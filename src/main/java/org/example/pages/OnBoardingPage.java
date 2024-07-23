package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWaits;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnBoardingPage extends WebTestBase {


    @FindBy(xpath = "//input[@id='reg_email']")
    WebElement emailIdTextBox;

    @FindBy(xpath = "//input[@id='reg_password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@class='woocommerce-Button button']")
    WebElement registerButton;

    @FindBy(xpath = "//h2[text()='Register']")
    WebElement registerText;

   public OnBoardingPage(){
       PageFactory.initElements(driver,this);
    }
    public void setRegistration(String email_id,String password){
        WebElementUtil.sendKeyToElement(emailIdTextBox,"email_id");
        WebElementUtil.sendKeyToElement(passwordTextBox,"password");
    }
    public void setRegisterButton(){
        CommonWaits.waitUntilElementToBeClickable(registerButton);
    }
    public String registerText(){
       return WebElementUtil.getTextElement(registerText);
    }


}
