package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWaits;
import org.example.util.DropDownUtil;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnerPage extends WebTestBase {

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeFourthAd;

    @FindBy(xpath = "//input[@id='input_5_25']")
    WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='input_5_1']")
    WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='input_5_2']")
    WebElement phoneTextBox;

    @FindBy(xpath = "//input[@id='input_5_3']")
    WebElement emailTextBox;

    @FindBy(id = "input_5_4")
    WebElement businessType;

    @FindBy(xpath = "//input[@id='input_5_5']")
    WebElement businessNameTextBox;

    @FindBy(xpath = "//input[@id='input_5_16']")
    WebElement businessAddress;

    @FindBy(id = "input_5_23")
    WebElement selectState;

    @FindBy(xpath = "//input[@id='input_5_19']")
    WebElement postcodeTextBox;

    @FindBy(xpath = "//input[@id='input_5_17']")
    WebElement abnTextBox;

    @FindBy(id = "input_5_24")
    WebElement existingBusiness;

    @FindBy(xpath = "//input[@id='input_5_8']")
    WebElement tradingBusinessDays;

    @FindBy(xpath = "//input[@id='input_5_9']")
    WebElement businessExperience;

    @FindBy(xpath = "//input[@id='input_5_12']")
    WebElement coffeeQuantity;

    @FindBy(xpath = "//textarea[@id='input_5_13']")
    WebElement informationTextBox;

    @FindBy(xpath = "//iframe[@name='a-5wudgg2ytg41']")
    WebElement captcha;

    @FindBy(xpath = "//input[@id='gform_submit_button_5']")
    WebElement registerInterest;

    public PartnerPage(){
        PageFactory.initElements(driver,this);
    }
    public void setCloseFourthAd(){
        CommonWaits.waitUntilElementToBeClickable(closeFourthAd);
    }
    public void setFirstNameTextBox(String first_name){
        WebElementUtil.sendKeyToElement(firstNameTextBox,first_name);
    }
    public void setLastNameTextBox(String last_name){
        WebElementUtil.sendKeyToElement(lastNameTextBox,last_name);
    }
    public void setPhoneTextBox(String phone_number){
        WebElementUtil.sendKeyToElement(phoneTextBox,phone_number);
    }
    public void setEmailTextBox(String email_id){
        WebElementUtil.sendKeyToElement(emailTextBox,email_id);
    }
    public void selectBusinessType( String Cafe){
        DropDownUtil.selectDropDownByVisibleText(businessType,Cafe);
    }
    public void setBusinessName(String business_name){
        WebElementUtil.sendKeyToElement(businessNameTextBox,business_name);
    }
    public void setBusinessAddress(String address) {
        WebElementUtil.sendKeyToElement(businessAddress, address);
    }
    public void setSelectState(String SA){
        DropDownUtil.selectDropDownByVisibleText(selectState,SA);
    }
    public void setPostcodeTextBox(String postcode){
        WebElementUtil.sendKeyToElement(postcodeTextBox,postcode);
    }
    public void setAbnTextBox(String abn_text){
        WebElementUtil.sendKeyToElement(abnTextBox,abn_text);
    }
    public  void setExistingBusiness(String Yes){
        DropDownUtil.selectDropDownByVisibleText(existingBusiness,Yes);
    }
    public void setTradingBusinessDays(String business_days_hours){
        WebElementUtil.sendKeyToElement(tradingBusinessDays,business_days_hours);
    }
    public void setBusinessExperience(String experience_year){
        WebElementUtil.sendKeyToElement(businessExperience,experience_year);
    }
    public void setCoffeeQuantity(String coffee_product_quantity){
        WebElementUtil.sendKeyToElement(coffeeQuantity,coffee_product_quantity);
    }
    public void setInformationTextBox(String business_information){
        WebElementUtil.sendKeyToElement(informationTextBox,business_information);
    }
    public void setCaptcha(){
        CommonWaits.waitUntilElementToBeClickable(captcha);
    }
    public void setRegisterInterest(){
        CommonWaits.waitUntilElementToBeClickable(registerInterest);
    }



}