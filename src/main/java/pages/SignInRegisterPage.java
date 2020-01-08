package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInRegisterPage {
    private WebDriver driver;

    public SignInRegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//div[@class='heading-section__title']/h1");

    public String getTitle (){
        return driver.findElement(heading).getText();
    }

}