package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInRegisterPage {
    private WebDriver driver;

    public SignInRegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//div[@class='heading-section__title']/h1");
    private By emailAddressInput = By.xpath("//input[@name='j_username']");
    private By passwordInput = By.xpath("//input[@name='j_password']");
    private By signInButton = By.xpath("//div[@class='button' and contains (text(),'Sign in')]");
    private By forgotPasswordLink = By.xpath("//div [@class='cs_cy au_aw']");
    private By showCTA = By.xpath("//span [@class='cs_co']");




    public String getSignInAndRegistrationHeader(){
        return driver.findElement(heading).getText();
    }

    public void setEmailaddress(String str){
        driver.findElement(emailAddressInput).sendKeys(str);
    }

    public void setPassword(String str) {
        driver.findElement(passwordInput).sendKeys(str);
    }

    public void clickSignInButton(){
        driver.findElement(signInButton).click();
    }

}