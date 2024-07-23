package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends WebTestBase {


    @FindBy(id="user_login")
    WebElement emailTextBox;

    @FindBy(xpath = "//input[@class='woocommerce-Button button']")
    WebElement resetPasswordBtn;

    @FindBy(xpath = "//div[@class= 'woocommerce-message']")
    WebElement testLinkSent;

    @FindBy(xpath = "//ul[@class='woocommerce-error']")
    WebElement errorMsgForBlankText;

    public ForgotPasswordPage(){
        PageFactory.initElements(driver,this);
    }
    public void forgotPasswordEmailBox(String email_id){
        WebElementUtil.sendKeyToElement(emailTextBox,email_id);
    }
    public void resetPasswordBtn(){
       WebElementUtil.clickOnElement(resetPasswordBtn);
    }
    public boolean testLinkSentText(){
       return WebElementUtil.getElementDisplayed(testLinkSent);
    }
    public boolean setErrorMsgForBlankText(){
        return WebElementUtil.getElementDisplayed(errorMsgForBlankText);

    }
}
