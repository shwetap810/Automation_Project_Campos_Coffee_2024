package org.example.util;

import org.example.testbase.WebTestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class ScrollDownUtil extends WebTestBase {

    public static JavascriptExecutor javascriptExecutor;

    public static void scrollDownPage(WebElement element) {
        javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments [0].scrollIntoView()", element);
    }
}
