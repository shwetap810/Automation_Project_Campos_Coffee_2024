package org.example.util;

import org.example.testbase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownUtil extends WebTestBase {
    public static Select select;

    public static void selectDropDownByValue(WebElement element,String value){
        select = new Select(element);
        select.selectByValue(value);
    }
    public static void selectDropDownByVisibleText(WebElement element,String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }
    public static void selectDropDownByIndex(WebElement element,int index){
        select = new Select(element);
        select.selectByIndex(index);
    }

    public static void bootstrapDropDown(List<WebElement> elementList){
        for(WebElement i : elementList) {
            String element = i.getText();
            System.out.println(element);
        }
    }

}
