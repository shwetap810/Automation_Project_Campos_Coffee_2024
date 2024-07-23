package testclasses;

import org.example.pages.*;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ProductPage productPage;

    public ProductTest() {
        super();
    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        productPage = new ProductPage();
    }
    @Test(description="verify 1 kg superior coffee bundle product ")
    public void verifySuperiorCoffeeBundle() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("username"), propertie.getProperty("password"));
        myAccountPage.MoveToShopText();
        myAccountPage.openBundlesPage();
        myAccountPage.closeSecondAd();
        myAccountPage.superiorCoffeeBundle();
        productPage.groundBtnSelect();
        productPage.selectEspressoHomeBtn();
        productPage.selectBagSize();
        productPage.select1Kg();
        productPage.getProductQuality();
        productPage.addToCartProduct();
        String successMsgText = productPage.adCartSuccessMsg();
        softAssert.assertEquals(successMsgText,"SUCCESS! YOU’VE ADDED THIS ITEM TO YOUR CART"," SUCCESS! YOU’VE ADDED THIS ITEM TO YOUR CART text should be match");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
