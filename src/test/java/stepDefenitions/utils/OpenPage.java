package stepDefenitions.utils;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.PageURL;

public class OpenPage {
//    WebDriver driver;
    private HomePage homePage;
    private PageURL pageURL;


    @Given("I'm on the {string}")
    public void iMOnThe(String pageName) {
        Browser.getInstance().get(PageURL.returnURL(pageName));
    }
}
