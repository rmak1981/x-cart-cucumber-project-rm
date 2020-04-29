package com.xcart.demostore.pages;

import com.cucumber.listener.Reporter;
import com.xcart.demostore.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NewAccountPage extends UtilityRM {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(id = "login")
    WebElement _emailField;

    @FindBy(id = "password")
    WebElement _passwordField;

    @FindBy(id = "password-conf")
    WebElement _confPassword;

    @FindBy(xpath = "//div[contains(@class,'button submit')]//button[contains(@class,'submit')]")
    WebElement _createButton;

    public void enterEmail(String ragEmail)  {
       // String ragEmail = "ram" + getRandomString(5) + "@gmail.com";
        Reporter.addStepLog("enter email" + ragEmail + "to email filed" + _emailField.toString() + "<br>");
        sendTextToElement(_emailField, "ram"+getRandomString(3)+"@gmail.com");
        log.info("enter email" + ragEmail + "to email filed" + _emailField.toString());
    }


    public void enterPassword(String pwd) {
        Reporter.addStepLog("enter password" + pwd + "to the filed" + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, pwd);
        log.info("enter password" + pwd + "to the filed" + _passwordField.toString());
    }

    public void enterConfPassword(String cpwd) {
        Reporter.addStepLog("enter password" + cpwd + "to the filed" + _confPassword.toString() + "<br>");
        sendTextToElement(_confPassword, cpwd);
        log.info("enter password" + cpwd + "to the filed" + _confPassword.toString());
    }

    public void clickOnCreateBtn() {
        Reporter.addStepLog("click on create btn " + _createButton.toString());
        clickOnElement(_createButton);
        log.info("click on create btn " + _createButton.toString());
    }
}