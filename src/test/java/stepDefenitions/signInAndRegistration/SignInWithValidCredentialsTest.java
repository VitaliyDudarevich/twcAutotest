package stepDefenitions.signInAndRegistration;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.MyAccountPage;
import pages.SignInRegisterPage;

import java.util.concurrent.TimeUnit;

public class SignInWithValidCredentialsTest {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\testt\\IdeaProjects\\testSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }
    @Given("I'm on the Sign in and registration page")
    public void SignInAndRegistrationPage() {
        driver.get("https://www.thewhitecompany.com/uk/login");
        System.out.println("Navigate to log in page");
    }

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
    public void tierDown(){
        driver.quit();
    }*/
}