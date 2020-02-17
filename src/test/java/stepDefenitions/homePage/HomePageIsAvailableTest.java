package stepDefenitions.homePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SignInRegisterPage;
import stepDefenitions.utils.Browser;

import java.io.IOException;

public class HomePageIsAvailableTest {
    private WebDriver driver;
    private HomePage homePage;
    private SignInRegisterPage signInRegisterPage;


    @When("Click to Sign in and registration link")
    public void clickToSignInAndRegistrationLink() {
        HomePage homePage = new HomePage(Browser.getInstance());
        homePage.clickSignIn();
        System.out.println("Click to Sign in and registration link");
    }

    @Then("Navigate to Sign in and registration page")
    public void navigateToSignInAndRegistrationPage() throws IOException {
        SignInRegisterPage title = new SignInRegisterPage();
        Assert.assertEquals("SIGN IN TO YOUR ACCOUNT", title.getSignInAndRegistrationHeader());
        System.out.println("Navigate to Sign in and registration page");
    }
}
