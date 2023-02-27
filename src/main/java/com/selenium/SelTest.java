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
        driver.get("https://choremore.net/login");

        //Get Title
        System.out.println(driver.getTitle());

        //Get URL



    }

}
