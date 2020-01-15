package stepDefenitions.signInAndRegistration;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.MyAccountPage;
import pages.PageURL;
import pages.SignInRegisterPage;

public class SignInWithValidCredentialsTest {
    private WebDriver driver;
    private HomePage homePage;
    private PageURL pageURL;

//    @Before
/*    public void setUp () {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\v.dudarevich\\IdeaProjects\\twcAutotest2\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        pageURL = new PageURL(driver);
    }*/

    @When("Try to sign in with valid login and valid password")
    public void tryToSignInWithValidLoginAndValidPassword() {
        SignInRegisterPage setEmail = new SignInRegisterPage(driver);
        setEmail.setEmailaddress("DV@test.test");
        System.out.println("Email Address set");
    }

    @Then("Successfully logged in")
    public void successfullyLoggedIn() {
        SignInRegisterPage setPassword = new SignInRegisterPage(driver);
        MyAccountPage myAccountHeader = new MyAccountPage(driver);
        setPassword.setPassword("Test922922");
        setPassword.clickSignInButton();
    }
/*   @After
    public void tierDown() {
      Browser.destroy();
   }*/
}