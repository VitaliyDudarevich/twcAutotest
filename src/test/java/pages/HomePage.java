package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By signInLink = By.xpath("//a[@href='https://www.thewhitecompany.com/uk/my-account']");
    private By search = By.xpath("//div[@class='flex-container']/div[@class='labeled-icon']");

    public SignInRegisterPage clickSignIn(){
        driver.findElement(signInLink).click();
        return new SignInRegisterPage();

    }

}
