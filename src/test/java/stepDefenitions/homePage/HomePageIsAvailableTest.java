package stepDefenitions.homePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SignInRegisterPage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePageIsAvailableTest {
    private WebDriver driver;
    private HomePage homePage;
    private SignInRegisterPage signInRegisterPage;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\testt\\IdeaProjects\\testSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        signInRegisterPage = new SignInRegisterPage(driver);
    }

    @Given("I'm on the home page")
    public void iMOnTheHomePage() {
    driver.get("https://www.thewhitecompany.com/uk");
        System.out.println("I'm on the home page");
    }

    @When("Click to Sign in and registration link")
    public void clickToSignInAndRegistrationLink() {
        SignInRegisterPage signInRegisterPage = homePage.clickSignIn();
        System.out.println("Click to Sign in and registration link");
    }

    @Then("Navigate to Sign in and registration page")
    public void navigateToSignInAndRegistrationPage() throws IOException {
        SignInRegisterPage title = new SignInRegisterPage(driver);
        Assert.assertEquals("SIGN IN TO YOUR ACCOUNT", title.getSignInAndRegistrationHeader());
        System.out.println("Navigate to Sign in and registration page");

       /* Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String filename = format.format(dateNow) + ".png";

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Screenshots\\"+ filename));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    @After
    public void tierDown(){
        driver.quit();
    }
}
