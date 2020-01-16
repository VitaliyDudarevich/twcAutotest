package stepDefenitions.signInAndRegistration;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.MyAccountPage;
import pages.PageURL;
import pages.SignInRegisterPage;

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
        System.out.println("The email set is  " + "\""+email+"\"");
        System.out.println("The password set is " + "\""+password+"\"");
    }



    @Then("Successfully logged in")
    public void successfullyLoggedIn() {
        MyAccountPage myAccountPage = new MyAccountPage();
        Assert.assertEquals("MY ACCOUNT", myAccountPage.getMyAccountHeader());

    }





/*   @After
    public void tierDown() {
      Browser.destroy();
   }*/
}