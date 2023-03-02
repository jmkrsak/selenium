package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Class for testing selenium
public class SelTest {

    public static void main(String[] args) {

        //Invoke Browser

        //Chrome - ChromeDriver -> methods
        //methods have the same name for all browsers
        //ChromeDriver driver = new ChromeDriver();

        //chromedriver -> invokes Chrome browser
        //webdriver.chrome.driver -> value of path
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        //WebDriver - control interface for all browsers -> methods
        //WebDriver methods + Class methods
        WebDriver driver = new ChromeDriver();

        //Navigate to URL
        driver.get("https://google.com");

        //Get Title
        System.out.println("This is the title: " + driver.getTitle());

        //Get URL
        System.out.println("This is the URL: " + driver.getCurrentUrl());

        //Close Browser
        driver.close();

        //Quit Browser
        //Quit vs Close
        driver.quit();

    }

}
