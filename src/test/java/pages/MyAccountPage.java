package pages;

import org.openqa.selenium.By;
import stepDefenitions.utils.Browser;

public class MyAccountPage {

    private By myAccountHeader = By.xpath("//h1");
    public By myOrderTail = By.xpath("//div[@id='app']//a[2]");


    public String getMyAccountHeader () {
        return Browser.getInstance().findElement(myAccountHeader).getText();
    }
}
