package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWaits;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends WebTestBase {
    @FindBy(id = "username")
    WebElement userNameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(name = "login")
    WebElement logInBtn;

    @FindBy(xpath = "//strong[text()='ERROR']")
    WebElement errorMsg;

    @FindBy(xpath = "//strong[text()='Error:']")
    WebElement errorMsgForBlank;

    @FindBy(xpath = "//a[text()='Lost your password?']")
    WebElement lostYourPassword;

    @FindBy(xpath = "//a[text()='Click here']")
    WebElement registerBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    public void setLogin(String userName, String password) {
        WebElementUtil.sendKeyToElement(userNameTextBox, userName);
        WebElementUtil.sendKeyToElement(passwordTextBox,password);
        CommonWaits.waitUntilElementToBeClickable(logInBtn);
    }
    public boolean errorMsgDisplay(){
        return WebElementUtil.getElementDisplayed(errorMsg);

    }
    public void forgotPassword(){
        CommonWaits.waitUntilElementToBeClickable(lostYourPassword);
    }
    public void registerNewUser(){
        CommonWaits.waitUntilElementToBeClickable(registerBtn);
    }
    public boolean setErrorMsgForBlank(){
        return WebElementUtil.getElementDisplayed(errorMsgForBlank);
    }
}
