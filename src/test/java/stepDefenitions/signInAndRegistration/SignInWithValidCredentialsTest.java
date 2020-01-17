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

//    @Before
/*    public void setUp () {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\v.dudarevich\\IdeaProjects\\twcAutotest2\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        pageURL = new PageURL(driver);
    }*/

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
        System.out.println("test completed");
    }



/*   @After
    public void tierDown() {
      Browser.destroy();
   }*/
}