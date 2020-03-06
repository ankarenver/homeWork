package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        String[] titles = new String[3];
        for (String each : urls){
            driver.get(each);
            System.out.println(each.startsWith("http://practice.cybertekschool.com"));
            driver.close();

        }

    }
}
