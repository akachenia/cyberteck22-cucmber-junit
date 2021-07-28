package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /**
    This method accepts a List<WebElements> and returns List<String>
     @param webElements
     */
    public static List<String> getElementsText(List<WebElement> webElements){

        //Create placeholder List<String>
        List<String> actualMonthsAsString = new ArrayList<>();

        for (WebElement each: webElements){

            actualMonthsAsString.add(each.getText());
        }
        return actualMonthsAsString;


    }


}
