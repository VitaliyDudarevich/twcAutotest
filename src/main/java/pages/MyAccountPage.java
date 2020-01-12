package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }
        private By myAccountHeader = By.xpath("//h1");

    public String getMyAccountHeader () {
        return driver.findElement(myAccountHeader).getText();

    }
}
