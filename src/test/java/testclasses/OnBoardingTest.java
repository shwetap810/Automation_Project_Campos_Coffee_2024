package testclasses;

import org.example.pages.*;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OnBoardingTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    OnBoardingPage onBoardingPage;

    public OnBoardingTest() {
        super();
    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        onBoardingPage = new OnBoardingPage();
    }

    @Test(description="verify new user registration")
    public void verifyNewUserRegistration(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.registerNewUser();
        String registerText = onBoardingPage.registerText();
        softAssert.assertEquals(registerText,"REGISTER","REGISTER text should be match ");
        softAssert.assertAll();
        onBoardingPage.setRegistration(propertie.getProperty("email_id"),propertie.getProperty("password"));
        onBoardingPage.setRegisterButton();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
