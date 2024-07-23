package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWaits;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement userLogo;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeFirstAd;

    @FindBy(xpath = "//a[text()='Café Finder']")
    WebElement cafeFinder;

    @FindBy(xpath = "//button[@class='mc-closeModal']")
    WebElement closeAd;

    @FindBy(xpath = "//icon[@class='filter_item-icon']")
    WebElement iconClick;

    @FindBy(xpath = "//icon[@class='filter_item-list-item-icon']")
    WebElement insertSuburbIcon;

    @FindBy(xpath = "//input[@id='locationSearch']")
    WebElement insertSuburbTextBox;

    @FindBy(xpath = "//button[@id='locationSearchButton']")
    WebElement findBtn;

    @FindBy(xpath = "//strong[text()='Pullman Hotel Adelaide']")
    WebElement locationText;

    @FindBy(xpath = "//a[text()='WOOLWORTHS COMP']")
    WebElement woolWorthsComp;

    @FindBy(xpath = "//input[@id='searchsubmit']")
    WebElement searchIcon;

    @FindBy(xpath = "//input[@class='search__input']")
    WebElement searchTextBox;

    @FindBy(xpath = "//h2[@class='search_results-header-results_query']")
    WebElement coffeeProductsText;

    @FindBy(xpath = "//input[@id='input_13_1']")
    WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='gform_submit_button_13']")
    WebElement submitBtn;

    @FindBy(xpath = "(//strong[text()='WELCOMECAMPOS10'])[1]")
    WebElement discountMsg;

    @FindBy(xpath = "(//a[@class='menu__ul__li__a'])[16]")
    WebElement subscriptionLink;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void closeFirstAd(){
        CommonWaits.waitUntilElementToBeClickable(closeFirstAd);
        CommonWaits.waitUntilElementToBeClickable(userLogo);
    }
    public void setCafeFinder(){
        WebElementUtil.clickOnElement(cafeFinder);
    }
    public void setCloseAd(){
        CommonWaits.waitUntilElementToBeClickable(closeAd);
    }
    public void setIconClick(){
        CommonWaits.waitUntilElementToBeClickable(iconClick);
    }
    public void setInsertSuburbIcon(){
       WebElementUtil.clickOnElement(insertSuburbIcon);
    }
    public void setInsertSuburbTextBox(String postcode){
        WebElementUtil.sendKeyToElement(insertSuburbTextBox,postcode);
    }
    public void setFindBtn(){
        CommonWaits.waitUntilElementToBeClickable(findBtn);
    }
    public boolean setLocationText()
    {
        CommonWaits.waitUntilElementToBeClickable(locationText);
       return WebElementUtil.getElementDisplayed(locationText);
    }
    public void setWoolWorthsComp(){
        CommonWaits.waitUntilElementToBeClickable(woolWorthsComp);
    }
    public void setSearchIcon(){
        CommonWaits.waitUntilElementToBeClickable(searchTextBox);
    }
    public void setSearchText(String search_content){
        WebElementUtil.sendKeyToElement(searchTextBox,search_content);
    }
    public void setIconClick2(){
        CommonWaits.waitUntilElementToBeClickable(searchIcon);
    }
    public boolean setCoffeeProductsText(){
      return WebElementUtil.getElementDisplayed(coffeeProductsText);
    }
    public void setEmailTextBox(String email_id2){
        WebElementUtil.sendKeyToElement(emailTextBox,email_id2);
    }
    public void setSubmitBtn(){
        CommonWaits.waitUntilElementToBeClickable(submitBtn);
    }
    public boolean setDiscountMsg(){
        return WebElementUtil.getElementDisplayed(discountMsg);
    }
    public void setSubscriptionLink(){
        CommonWaits.waitUntilElementToBeClickable(subscriptionLink);
    }





}
