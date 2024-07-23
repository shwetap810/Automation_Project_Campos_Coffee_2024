package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWaits;
import org.example.util.DropDownUtil;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage extends WebTestBase {

    @FindBy(xpath = "//select[@class='pa_capsules-1']")
    WebElement capsules;

    @FindBy(xpath = "//select[@class='pa_capsule-packs']")
    WebElement capsulePackSize;

    @FindBy(xpath = "(//div[@class='radio'])[3]")
    WebElement frequencyMonthlyBtn;

    @FindBy(xpath = "//select[@class='pa_subscription-length']")
    WebElement subscriptionLength;

    @FindBy(xpath = "//span[@class='price']")
    WebElement addToCartBtn2;

    @FindBy(xpath = "//div[text()='Success! You’ve added this item to your cart']")
    WebElement successMessage;

    public SubscriptionPage(){
      PageFactory.initElements(driver,this);
    }
    public void setCapsules(String select_capsule){
        DropDownUtil.selectDropDownByVisibleText(capsules,select_capsule);
    }
    public void setCapsulePackSize(String capsule_pack_size){
        DropDownUtil.selectDropDownByVisibleText(capsulePackSize,capsule_pack_size);
    }
    public void setFrequencyMonthly(){
        CommonWaits.waitUntilElementToBeClickable(frequencyMonthlyBtn);
    }
    public void setSubscriptionLength(String subscription_length){
        DropDownUtil.selectDropDownByVisibleText(subscriptionLength,subscription_length);
    }
    public void setAddToCartBtn2(){
        CommonWaits.waitUntilElementToBeClickable(addToCartBtn2);
    }
    public String setSuccessMessage(){
        CommonWaits.waitUntilElementToBeClickable(successMessage);
        return WebElementUtil.getTextElement(successMessage);
    }
}
