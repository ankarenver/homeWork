package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String arg){
        String os = System.getProperty("os.name").toLowerCase();
        if(os.contains("windows")&&arg.equalsIgnoreCase("safari")  ||  os.contains("mac")&&arg.equalsIgnoreCase("edg")){
            return null;
        }
        switch (arg){
            case "chrome":{
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
            case "firefox":{
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
            case "edge":{
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }
            case "safari":{
                return new SafariDriver();
            }
            default:{
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }

        }
     }
}
