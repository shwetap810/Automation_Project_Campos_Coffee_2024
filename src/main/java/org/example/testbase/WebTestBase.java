package org.example.testbase;

import org.example.util.CommonWaits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public static WebDriver driver;
    public static Properties propertie;
    public WebTestBase()  {
           FileInputStream fileInputStream = null;
           try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/config.properties");
            } catch(FileNotFoundException f){
               f.printStackTrace();
            }
          propertie = new Properties();
            try{
          propertie.load(fileInputStream);
           }catch(IOException i){
            i.printStackTrace();
           }
    }
    public  void initialization(){
        String browserName = propertie.getProperty("browser");
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/main/resources/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/src/main/resources/driver/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("please select the correct browser name");
        }
        driver.get(propertie.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(CommonWaits.PAGE_LOAD_TIMEOUT));
        driver.manage().deleteAllCookies();
    }

}
