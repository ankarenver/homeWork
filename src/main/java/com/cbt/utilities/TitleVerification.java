package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String> titles = new ArrayList<>();
        for (String each : urls){
            driver.get(each);
            titles.add(driver.getTitle());
            System.out.println(driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com"));
            driver.close();

        }

    }
}
