package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWaits;
import org.example.util.DropDownUtil;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends WebTestBase {



    @FindBy(xpath = "(//div[@class='button-group__button'])[2]")
     WebElement groundBtn;

    @FindBy(xpath = "(//div[@class='radio'])[3]")
    WebElement espressoHomeBtn;

    @FindBy(xpath = "//select[@class='pa_weight']")
     WebElement selectBagSize;

    @FindBy(xpath = "//option[text()='1kg']")
     WebElement select1Kg;

    @FindBy(xpath = "//a[@class='quantity-input__icon quantity-input__icon--plus']")
     WebElement productQuantity;

    @FindBy(xpath = "//div[text()='Add to cart']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//div[text()='Success! You’ve added this item to your cart']")
    WebElement successMsgText;

    @FindBy(xpath = "//a[text()='Checkout']")
     WebElement checkoutBtn;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeAd;

    @FindBy(xpath = "(//div[@class='product-card__image'])[2]")
    WebElement camposCapsuleSubscription;

    public ProductPage(){
        PageFactory.initElements(driver,this );
    }

    public  void groundBtnSelect(){
        CommonWaits.waitUntilElementToBeClickable(groundBtn);
    }
    public  void selectEspressoHomeBtn(){
        CommonWaits.waitUntilElementToBeClickable(espressoHomeBtn);
    }
    public void selectBagSize(){
        CommonWaits.waitUntilElementToBeClickable(selectBagSize);
    }
    public  void select1Kg(){
        CommonWaits.waitUntilElementToBeClickable(select1Kg);
    }
    public  void getProductQuality(){
        CommonWaits.waitUntilElementToBeClickable(productQuantity);
    }
    public  void addToCartProduct(){
        CommonWaits.waitUntilElementToBeClickable(addToCartBtn);
    }
    public String adCartSuccessMsg(){
        CommonWaits.waitUntilElementToBeClickable(successMsgText);
        return WebElementUtil.getTextElement(successMsgText);
    }
    public  void checkoutProduct(){
        CommonWaits.waitUntilElementToBeClickable(checkoutBtn);
    }
    public void setCloseAd(){
        CommonWaits.waitUntilElementToBeClickable(closeAd);
    }
    public void setCamposCapsuleSubscription(){
        CommonWaits.waitUntilElementToBeClickable(camposCapsuleSubscription);
    }



}
