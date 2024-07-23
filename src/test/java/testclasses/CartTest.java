package testclasses;

import org.example.pages.*;
import org.example.testbase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ProductPage productPage;
    CartPage cartPage;

    public CartTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        productPage = new ProductPage();
        cartPage = new CartPage();
    }

    @Test(description = "verify product delete button")
    public void verifyProductDeleteBtn(){
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
        productPage.checkoutProduct();
        cartPage.deleteProductFromCart();
        String sortBy = cartPage.sortByTextOnProductPage();
        softAssert.assertEquals(sortBy, "SORT BY", " Sort by text should be match");
        softAssert.assertAll();
    }
    @Test(description = "verify product checkout procedure")
    public void verifyProductCheckout() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("username"), propertie.getProperty("password"));
        myAccountPage.openCartPage();
        cartPage.closeThirdAd();
        cartPage.continueDeliveryButton();
        cartPage.firstNameTextBoxInput(propertie.getProperty("first_name"));
        cartPage.lastNameTextBoxInput(propertie.getProperty("last_name"));
        cartPage.companyNameTextBoxInput(propertie.getProperty("company_name"));
        cartPage.addressTextBoxInput(propertie.getProperty("address"));
        cartPage.addressCheckBox();
        cartPage.setStreetTextBox("street_address");
        cartPage.apartmentTextBox("apartment");
        cartPage.suburbTextBox("suburb");
        cartPage.stateTextBox();
        cartPage.setSelectState();
        cartPage.postCodeTextBox("postcode");
        cartPage.phoneTextBoxInput(propertie.getProperty("phone_number"));
        cartPage.deliveryNotesTextBoxInput(propertie.getProperty("delivery_notes"));
        cartPage.continueToPaymentButton();
        String paymentText = cartPage.getTextOfPayment();
        softAssert.assertEquals(paymentText,"PAYMENT","payment text should be match");
        softAssert.assertAll();

    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}
