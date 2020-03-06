package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String arg){
        if(arg.equalsIgnoreCase("safari")){
            return null;
        }else if(arg.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return  new ChromeDriver();
        }else if(arg.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if(arg.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }else {
            WebDriverManager.chromedriver().setup();
            return  new ChromeDriver();
        }
    }
}
