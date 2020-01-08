package stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SignInRegisterPage;

import java.util.concurrent.TimeUnit;

public class HomePageTest {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\testt\\IdeaProjects\\testSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.thewhitecompany.com/uk");
        homePage = new HomePage(driver);
    }

    @Given("I'm on the home page")
    public void iMOnTheHomePage() {
     //  System.setProperty("webdriver.chrome.driver","C:\\Users\\testt\\IdeaProjects\\testSelenium\\drivers\\chromedriver.exe");
     //   driver = new ChromeDriver();
        driver.get("https://www.thewhitecompany.com/uk");
    }

    @When("Click to Sign in and registration link")
    public void clickToSignInAndRegistrationLink() {
     //   homePage = new HomePage(driver);
        SignInRegisterPage signInRegisterPage = homePage.clickSignIn();
    }

    @Then("Navigate to Sign in and registration page")
    public void navigateToSignInAndRegistrationPage() {
        SignInRegisterPage title = new SignInRegisterPage(driver);
        Assert.assertEquals("SIGN IN TO YOUR ACCOUNT", title.getTitle());
    }
}
