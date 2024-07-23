package testclasses;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();

    }
    @Test(description="verify login page with valid username and valid password")
    public void verifyloginpagewithvalidusernameandavalidpassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("username"), propertie.getProperty("password") );
        String myAccountText = myAccountPage.getTextOfMyAccount();
        softAssert.assertEquals(myAccountText,"MY ACCOUNT","My Account text should be match ");
        softAssert.assertAll();
    }
    @Test(description="verify login page with invalid password and invalid username")
    public void verifyLoginWithInvalidUsernameAndInvalidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("wrong_username"), propertie.getProperty("wrong_paswrd"));
        softAssert.assertTrue(loginPage.errorMsgDisplay(),"error message should be display");
        softAssert.assertAll();
    }
    @Test(description="verify login page with invalid username and valid password")
    public void verifyLoginWithInvalidUsernameAnValidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("wrong_username"), propertie.getProperty("password"));
        softAssert.assertTrue(loginPage.errorMsgDisplay(),"error message should be display");
        softAssert.assertAll();
    }

    @Test(description="verify login page with valid username and invalid password")
    public void verifyLoginWithValidUsernameAnInvalidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("username"), propertie.getProperty("wrong_paswrd"));
        softAssert.assertTrue(loginPage.errorMsgDisplay(),"error message should be display");
        softAssert.assertAll();
    }

    @Test(description="verify login page with blank username text box and blank password text box")
    public void verifyLoginWithBlankUsernameAndBlankPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("blank_username"), propertie.getProperty("blank_password"));
        softAssert.assertTrue(loginPage.setErrorMsgForBlank(),"Error: Username is required. message should be display");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
