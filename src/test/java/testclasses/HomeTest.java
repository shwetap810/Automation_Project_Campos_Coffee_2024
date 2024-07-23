package testclasses;

import org.example.pages.HomePage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTest extends WebTestBase {
    HomePage homePage;

    public HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }

    @Test(description="verify cafe finder")
    public void verifyCafeFinder() {
        homePage.closeFirstAd();
        homePage.setCafeFinder();
        homePage.setCloseAd();
        homePage.setIconClick();
        homePage.setInsertSuburbIcon();
        homePage.setInsertSuburbTextBox(propertie.getProperty("suburb_adress"));
        homePage.setFindBtn();
    }

     @Test(description="verify search text box")
     public void verifySearchTextBox(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.setSearchIcon();
        homePage.setSearchText(propertie.getProperty("search_content"));
        homePage.setIconClick2();
        softAssert.assertTrue(homePage.setCoffeeProductsText(),"COFFEE PRODUCTS should be display");
        softAssert.assertAll();
     }

     @Test(description="verify discount of 10% on first order")
     public void verifyDiscountOnProduct(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.setEmailTextBox(propertie.getProperty("email_id2"));
        homePage.setSubmitBtn();
        softAssert.assertTrue(homePage.setDiscountMsg(),"WELCOMECAMPOS10  should be dispaly");
        softAssert.assertAll();

    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
