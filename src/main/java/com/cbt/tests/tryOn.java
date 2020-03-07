package com.cbt.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tryOn {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ankar","l","ankar");
        verifyAllThree(names);



    }
    public static void verifyAllThree(List<String> titles){

        for (int i = 0; i <titles.size() ; i++) {
            for (int j = i; j <titles.size() ; j++) {
                if(!titles.get(i).equals(titles.get(j))){
                    System.out.println("is not equal to each other");
                    return;
                }
            }
        }
        System.out.println("is equal to each other");
    }
}
