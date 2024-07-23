package testclasses;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyAccountTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    public MyAccountTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }
    @Test(description="verify logout  button is displayed on my account page")
    public void verifyLogOutButtonIsDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("username"), propertie.getProperty("password"));
        softAssert.assertTrue(myAccountPage.logOutBtnDisplayed(),"Logout should be displayed");
        softAssert.assertAll();
    }

    @Test(description="verify drag and drop campus coffee logo")
    public void dragAndDropLogo(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("username"), propertie.getProperty("password"));
        softAssert.assertTrue(myAccountPage.dragAndDrop(),"campus coffee logo should be drag and drop");
        myAccountPage.dragAndDrop();
        softAssert.assertAll();
    }

    @Test(description="verify logout functionality")
    public void verifyLogOut(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("username"), propertie.getProperty("password") );
        myAccountPage.logOutButton();
        myAccountPage.setConfirmLogOut();
        softAssert.assertTrue(myAccountPage.logOutFailMsgDisplayed(),"Sorry, you have been blocked msg should  be display");
        softAssert.assertAll();
    }
    @Test(description="verify bundles link in shop text bar")
    public void verifyMoveToShopTextBar() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("username"), propertie.getProperty("password"));
        myAccountPage.MoveToShopText();
        myAccountPage.getAllTextOfShop();
        myAccountPage.openBundlesPage();
        myAccountPage.closeSecondAd();
        String filterBar = myAccountPage.getTextOfResult();
        softAssert.assertEquals(filterBar,"SHOWING 21 OF 21 RESULTS","SHOWING 21 OF 21 RESULTS should be match");
        softAssert.assertAll();
    }

    @Test(description="verify orders link with empty cart")
    public void verifyOrdersWithEmptyCart(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("username"), propertie.getProperty("password") );
        myAccountPage.ordersLink();
        softAssert.assertTrue(myAccountPage.setEmptyOrderMsg(),"No order has been made yet. message should be display");
        softAssert.assertAll();
    }


    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
