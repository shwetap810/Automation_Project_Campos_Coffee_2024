package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWaits;
import org.example.util.DropDownUtil;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends WebTestBase {

    @FindBy(xpath = "//div[@class='cart__remove__icon']")
    WebElement deleteProductBtn;

    @FindBy(xpath = "//div[text()='Sort by']")
    WebElement sortBy;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeThirdAd;

    @FindBy(xpath = "//a[text()='Continue to delivery']")
    WebElement continueToDeliveryBtn;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='billing_company']")
    WebElement companyNameTextBox;

    @FindBy(xpath = "//input[@id='billing_autocomplete']")
    WebElement addressTextBox;

    @FindBy(xpath = "(//span[@class='woocommerce-input-wrapper'])[6]")
    WebElement addressCheckBox;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement streetTextBox;

    @FindBy(xpath = "//input[@id='billing_address_2']")
    WebElement apartmentTextBox;

    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement suburbTextBox;

    @FindBy(xpath = "//select[@id='billing_state']")
    WebElement stateTextBox;

    @FindBy(xpath = "(//option[text()='South Australia'])[1]")
    WebElement selectState;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement postCodeText;

    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement phoneTextBox;

    @FindBy(xpath = "//textarea[@id='order_comments']")
    WebElement deliveryNotesTextBox;

    @FindBy(xpath = "//a[text()='Continue to payment']")
    WebElement continueToPaymentBtn;
    @FindBy(xpath = "//h3[text()='Payment']")
    WebElement paymentText;

    public CartPage(){
        PageFactory.initElements(driver,this);
    }
    public void deleteProductFromCart(){
        CommonWaits.waitUntilElementToBeClickable(deleteProductBtn);
    }
    public String sortByTextOnProductPage(){
       return WebElementUtil.getTextElement(sortBy);
    }
    public void continueDeliveryButton(){
        CommonWaits.waitUntilElementToBeClickable(continueToDeliveryBtn);
    }
    public void firstNameTextBoxInput(String first_name){
        WebElementUtil.sendKeyToElement(firstNameTextBox,first_name);
    }
    public void lastNameTextBoxInput(String last_name){
        WebElementUtil.sendKeyToElement(lastNameTextBox,last_name);
    }
    public void companyNameTextBoxInput(String company_name){
        WebElementUtil.sendKeyToElement(companyNameTextBox,company_name);
    }
    public void addressTextBoxInput(String address){
        WebElementUtil.sendKeyToElement(addressTextBox,address);
    }
    public void addressCheckBox(){
       CommonWaits.waitUntilElementToBeClickable(addressCheckBox);
    }
    public void setStreetTextBox(String street_address){
        WebElementUtil.sendKeyToElement(streetTextBox,street_address);
    }
    public void apartmentTextBox(String apartment){
        WebElementUtil.sendKeyToElement(apartmentTextBox,apartment);
    }
    public void suburbTextBox(String suburb){
        WebElementUtil.sendKeyToElement(suburbTextBox,suburb);
    }
    public void stateTextBox(){
        CommonWaits.waitUntilElementToBeClickable(stateTextBox);
    }
    public void setSelectState(){
        CommonWaits.waitUntilElementToBeClickable(selectState);
    }
    public void postCodeTextBox(String postcode){
        WebElementUtil.sendKeyToElement(postCodeText,postcode);
    }

    public void phoneTextBoxInput(String phone_number){
        WebElementUtil.sendKeyToElement(phoneTextBox,phone_number);
    }
    public void deliveryNotesTextBoxInput(String delivery_notes){
        WebElementUtil.sendKeyToElement(deliveryNotesTextBox,delivery_notes);
    }
    public void continueToPaymentButton(){
        CommonWaits.waitUntilElementToBeClickable(continueToPaymentBtn);
    }
    public void closeThirdAd(){
        CommonWaits.waitUntilElementToBeClickable(closeThirdAd);
    }
    public String getTextOfPayment(){
        CommonWaits.waitUntilElementToBeClickable(paymentText);
       return WebElementUtil.getTextElement(paymentText);
    }


}
