package stepDefenitions.utils;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.PageURL;

import java.util.concurrent.TimeUnit;

public class OpenPage {
    WebDriver driver;
    private HomePage homePage;
    private PageURL pageURL;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\testt\\IdeaProjects\\testSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        pageURL = new PageURL(driver);
    }

    @Given("I'm on the {string}")
    public void iMOnThe(String arg0) {
        driver.get(PageURL.returnURL(arg0));

    }
}
