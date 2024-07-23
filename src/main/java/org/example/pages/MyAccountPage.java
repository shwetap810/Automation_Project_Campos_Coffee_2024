package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.ActionsUtil;
import org.example.util.CommonWaits;
import org.example.util.DropDownUtil;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends WebTestBase {

    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logOutBtn;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement moveToShop;

    @FindBy(xpath = "//div[@class='cell small-12 large-4 filter-bar__inner__section filter-bar__inner__section--results']")
    WebElement filterBar;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeSecondAd;

    @FindBy(xpath = "(//img[@class='product-card__image__img'])[1]")
    WebElement superiorCoffeeBundle;

    @FindBy(xpath = "(//ul[@class='sub-menu'])[2]//child::li/a")
    List<WebElement> bootstrapDropDownListShop;

    @FindBy(xpath = "(//a[@class='menu__ul__li__a'])[12]")
    WebElement bundles;

    @FindBy(className = "header__logo-container")
    WebElement camusCoffeeLogo;

    @FindBy(id = "main")
    WebElement page;

    @FindBy(xpath = "(//a[@class='mini-cart'])[1]")
    WebElement cartImg;

    @FindBy(xpath = "//a[text()='Confirm and log out']")
    WebElement confirmLogOutBtn;

    @FindBy(xpath = "//h1[text()='Sorry, you have been blocked']")
    WebElement logOouFailMsgBtn;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logOutButtonClick;

    @FindBy(xpath = "//li[@id='menu-item-381507']")
    WebElement wholesaleTextBar;

    @FindBy(xpath = "//a[text()='Orders']")
    WebElement ordersLink;

    @FindBy(xpath = "//div[@class='woocommerce-info']")
    WebElement emptyOrderMsg;

    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }

    public String getTextOfMyAccount(){
       return WebElementUtil.getTextElement(myAccountText);
    }

    public boolean logOutBtnDisplayed(){
        return WebElementUtil.getElementDisplayed(logOutBtn);
    }

    public void MoveToShopText(){
        ActionsUtil.moveToTheElement(moveToShop);
    }

    public void getAllTextOfShop(){
        DropDownUtil.bootstrapDropDown(bootstrapDropDownListShop);
    }
    public  String getTextOfResult(){
        return WebElementUtil.getTextElement(filterBar);
    }

    public  void closeSecondAd(){
        CommonWaits.waitUntilElementToBeClickable(closeSecondAd);
    }

    public  void superiorCoffeeBundle(){
        WebElementUtil.clickOnElement(superiorCoffeeBundle);
    }

    public boolean dragAndDrop(){
       ActionsUtil.dragAndDropToTheElement(camusCoffeeLogo,page);
        return true;
    }

    public void openBundlesPage(){
        WebElementUtil.clickOnElement(bundles);
    }

    public void openCartPage(){
        CommonWaits.waitUntilElementToBeClickable(cartImg);
    }

    public void logOutButton(){
        CommonWaits.waitUntilElementToBeClickable(logOutButtonClick);
    }

    public void setConfirmLogOut(){
        CommonWaits.waitUntilElementToBeClickable(confirmLogOutBtn);
    }

    public boolean logOutFailMsgDisplayed(){
        return  WebElementUtil.getElementDisplayed(logOouFailMsgBtn);
    }

    public void openWholeSalePage(){
        CommonWaits.waitUntilElementToBeClickable(wholesaleTextBar);
    }

    public void ordersLink(){
        CommonWaits.waitUntilElementToBeClickable(ordersLink);
    }
    public boolean setEmptyOrderMsg(){
        return WebElementUtil.getElementDisplayed(emptyOrderMsg);
    }



    }



