package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {

        /**
         * 1. Open browser
         * 2. Go to website https://google.com
         * 3. Save the title in a string variable
         * 4. Go to https://etsy.com
         * 5. Save the title in a string variable
         * 6. Navigate back to previous page
         * 7. Verify that title is same is in step 3
         * 8. Navigate forward to previous page
         * 9. Verify that title is same is in step 5
         */

//        testForChrome();
//        testForFirefox();
//        testForEdge();




    }

    public static void testForChrome(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1,driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2,driver.getTitle());
        driver.close();

    }
    public static void testForFirefox(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String title1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1,driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2,driver.getTitle());
        driver.close();

    }
    public static void testForEdge(){
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String title1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1,driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2,driver.getTitle());
        driver.close();

    }
}
