package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws Exception{

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String> titles = new ArrayList<>();
        List<Boolean> isStart = new ArrayList<>();
        for (String each : urls){
            driver.get(each);
            Thread.sleep(2000);
            titles.add(driver.getTitle());
            isStart.add(driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com"));
        }
//        System.out.println(titles);
        verifyAllTitle(titles);
//        System.out.println(isStart);
        verifyAllLinks(isStart);
        driver.close();







    }
    public static void verifyAllTitle(List<String> titles){
        for (int i = 0; i <titles.size() ; i++) {
            for (int j = i; j <titles.size() ; j++) {
                if(!titles.get(i).equals(titles.get(j))){
                    System.out.println("titles are not equal to each other");
                    return;
                }
            }
        }
        System.out.println("titles are equal to each other");
    }

    public static void verifyAllLinks(List<Boolean> isStart){
        for (int i = 0; i <isStart.size() ; i++) {
                if(!isStart.get(i)){
                    System.out.println("titles are not equal to each other");
                    return;
                }
        }
        System.out.println("titles are equal to each other");

    }



}
