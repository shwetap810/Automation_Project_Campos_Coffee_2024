package testclasses;

import org.example.pages.ForgotPasswordPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ForgotPasswordTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ForgotPasswordPage forgotPasswordPage;

    public ForgotPasswordTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        forgotPasswordPage = new ForgotPasswordPage();
    }

    @Test(description = "verify forgot password page with valid email id")
    public void verifyForgotPasswordWithValidEmailId() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.forgotPassword();
        forgotPasswordPage.forgotPasswordEmailBox(propertie.getProperty("email_id"));
        forgotPasswordPage.resetPasswordBtn();
        softAssert.assertTrue(forgotPasswordPage.testLinkSentText(),"Password reset email has been sent. should be display on text sent page");
        softAssert.assertAll();
    }

    @Test(description = "verify forgot password page with Blank email id Text Box" )
    public void verifyForgotPasswordWitBlankInput() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.forgotPassword();
        forgotPasswordPage.forgotPasswordEmailBox(propertie.getProperty("blank_email_id"));
        forgotPasswordPage.resetPasswordBtn();
        softAssert.assertTrue(forgotPasswordPage.setErrorMsgForBlankText(),"Enter a username or email address. message should be display");
        softAssert.assertAll();
    }

    @Test(description = "verify forgot password page without @ in email id")
    public void verifyForgotPasswordWithInValidEmailId() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.forgotPassword();
        forgotPasswordPage.forgotPasswordEmailBox(propertie.getProperty("invalid_email_id"));
        forgotPasswordPage.resetPasswordBtn();
        softAssert.assertFalse(forgotPasswordPage.testLinkSentText(), "Password reset email has been sent. display on text sent page");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}