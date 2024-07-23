package testclasses;

import org.example.pages.*;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SubscriptionTest extends WebTestBase {
    HomePage homePage;
    MyAccountPage myAccountPage;
    ProductPage productPage;
    SubscriptionPage subscriptionPage;

    public SubscriptionTest() {
       super();
    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        myAccountPage = new MyAccountPage();
        productPage = new ProductPage();
        subscriptionPage = new SubscriptionPage();
    }

    @Test(description="verify campos capsules subscription")
    public void verifyCamposCapsulesSubscription(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.setSubscriptionLink();
        productPage.setCloseAd();
        productPage.setCamposCapsuleSubscription();
        subscriptionPage.setCapsules(propertie.getProperty("select_capsule"));
        subscriptionPage.setCapsulePackSize(propertie.getProperty("capsule_pack_size"));
        subscriptionPage.setFrequencyMonthly();
        subscriptionPage.setSubscriptionLength(propertie.getProperty("subscription_length"));
        subscriptionPage.setAddToCartBtn2();
        String successMessage = subscriptionPage.setSuccessMessage();
        softAssert.assertEquals(successMessage,"SUCCESS! YOU’VE ADDED THIS ITEM TO YOUR CART","SUCCESS! YOU’VE ADDED THIS ITEM TO YOUR CART should be match");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
