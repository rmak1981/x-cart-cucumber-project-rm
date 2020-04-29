package com.xcart.demostore.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
 * Ravi's Creation
 * Date of Creation 29 Apr 20
 */
public class BasePage {


    public static WebDriver driver;
    //constructor
    public BasePage(){

        //log4j & page factory
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/com/xcart/demostore/resources/properties/log4j.properties");
        PageFactory.initElements(driver,this);
    }
}
