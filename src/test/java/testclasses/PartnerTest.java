package testclasses;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.example.pages.PartnerPage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PartnerTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    PartnerPage partnerPage;

    public PartnerTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        partnerPage = new PartnerPage();
    }

    @Test(description = "verify partnership with campus coffee in wholesale ")
    public void verifyWholeSalePage() {

        homePage.closeFirstAd();
        loginPage.setLogin(propertie.getProperty("username"), propertie.getProperty("password"));
        myAccountPage.openWholeSalePage();
        partnerPage.setCloseFourthAd();
        partnerPage.setFirstNameTextBox(propertie.getProperty("first_name"));
        partnerPage.setLastNameTextBox(propertie.getProperty("last_name"));
        partnerPage.setPhoneTextBox(propertie.getProperty("phone_number"));
        partnerPage.setEmailTextBox(propertie.getProperty("email_id"));
        partnerPage.selectBusinessType(propertie.getProperty("visible_text"));
        partnerPage.setBusinessName(propertie.getProperty("business_name"));
        partnerPage.setBusinessAddress(propertie.getProperty("address"));
        partnerPage.setSelectState(propertie.getProperty("state"));
        partnerPage.setPostcodeTextBox(propertie.getProperty("postcode"));
        partnerPage.setAbnTextBox(propertie.getProperty("abn_text"));
        partnerPage.setExistingBusiness(propertie.getProperty("existing_business"));
        partnerPage.setTradingBusinessDays(propertie.getProperty("business_days_hours"));
        partnerPage.setBusinessExperience(propertie.getProperty("experience_year"));
        partnerPage.setCoffeeQuantity(propertie.getProperty("coffee_product_quantity"));
        partnerPage.setInformationTextBox(propertie.getProperty("business_information"));
        partnerPage.setRegisterInterest();



    }
}