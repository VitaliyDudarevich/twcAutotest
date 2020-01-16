package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By signInLink = By.xpath("//a[@href='/uk/login']");

    public SignInRegisterPage clickSignIn(){
        driver.findElement(signInLink).click();
     //   driver.findElement(signInLink).click();
        return new SignInRegisterPage();

    }
}
