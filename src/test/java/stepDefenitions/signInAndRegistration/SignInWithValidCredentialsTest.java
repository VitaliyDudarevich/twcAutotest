package stepDefenitions.signInAndRegistration;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.MyAccountPage;
import pages.PageURL;
import pages.SignInRegisterPage;
import stepDefenitions.utils.Browser;

public class SignInWithValidCredentialsTest {
    private HomePage homePage;
    private PageURL pageURL;

    @When("Try to sign in with valid (.*) and (.*)")
    public void tryToSignInWithValidEmailAndPassword(String email, String password) {
        SignInRegisterPage signInRegisterPage = new SignInRegisterPage();
        signInRegisterPage.setEmailaddress(email);
        signInRegisterPage.setPassword(password);
        signInRegisterPage.clickSignInButton();
        WebDriverWait wait = new WebDriverWait(Browser.getInstance(), 3 );
        MyAccountPage myAccountPage = new MyAccountPage();
        wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountPage.myOrderTail));
    }

    @Then("Successfully logged in")
    public void successfullyLoggedIn() {
        MyAccountPage myAccountPage = new MyAccountPage();
        Assert.assertEquals("MY ACCOUNT", myAccountPage.getMyAccountHeader());
    }

    @When("Try to sign in with invalid (.*) or invalid (.*)")
    public void tryToSignInWithAnInvalidEmailOrInvalidPassword(String email, String password) {
        SignInRegisterPage signInRegisterPage = new SignInRegisterPage();
        signInRegisterPage.setEmailaddress(email);
        signInRegisterPage.setPassword(password);
        signInRegisterPage.clickSignInButton();
     //   System.out.println("Email = "+email + "\npassword = "+password+ "\n");
    }

    @Then("The validation message (.*) is shown")
    public void theValidationMessageIsShown(String validationMessage) {
        SignInRegisterPage signInRegisterPage = new SignInRegisterPage();
        Assert.assertEquals(validationMessage.replace("\"",""),
                Browser.getInstance().findElement(signInRegisterPage.incorrectUserOrPasswordError).getText());
    }



/*   @After
    public void tierDown() {
      Browser.destroy();
   }*/
}