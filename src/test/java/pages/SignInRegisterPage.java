package pages;

import org.openqa.selenium.By;
import stepDefenitions.utils.Browser;

public class SignInRegisterPage {

    private By heading = By.xpath("//div[@class='heading-section__title']/h1");
    private By emailAddressInput = By.xpath("//input[@name='j_username']");
    private By passwordInput = By.xpath("//input[@name='j_password']");
    private By signInButton = By.xpath("//button[@type=\"button\" and contains (text(),'Sign in')]");
    private By forgotPasswordLink = By.xpath("//div [@class='cs_cy au_aw']");
    private By showCTA = By.xpath("//span [@class='cs_co']");
    public By incorrectUserOrPasswordError = By.xpath("//div[contains (text(),'Please check your email and password')]");




    public String getSignInAndRegistrationHeader(){
        return Browser.getInstance().findElement(heading).getText();
    }

    public void setEmailaddress(String email){
       Browser.getInstance().findElement(emailAddressInput).sendKeys(email);
    }

    public void setPassword(String str) {
        Browser.getInstance().findElement(passwordInput).sendKeys(str);
    }

    public void clickSignInButton(){
        Browser.getInstance().findElement(signInButton).click();
    }

}