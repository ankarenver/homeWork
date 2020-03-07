package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");



        for (String each : urls){
            WebDriver  driver = BrowserFactory.getDriver("chrome");
            driver.get(each);
            String title = driver.getTitle().replace(" ","").toLowerCase();
            for (int i = 0; i <title.length()-2 ; i++) {
                if(title.substring(i,i+3).equals("com")){
                    title=title.substring(0,i);
                }
            }
//            System.out.println(title);
            String url = driver.getCurrentUrl();
//            System.out.println(url);
            System.out.println(url.contains(title));
            driver.close();

        }



    }
}
