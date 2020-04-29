package com.xcart.demostore.pages;

import com.cucumber.listener.Reporter;
import com.xcart.demostore.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends UtilityRM {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(css = "a[class$='create-account-link']")
    WebElement _createAccountLink;

    @FindBy(css = "input#login-email")
    WebElement _emailfield;

    @FindBy(css = "input#login-password")
    WebElement _passwordfield;

    @FindBy(xpath = "//button[contains(@class,'submit')]//span[contains(text(),'Sign in')]")
    WebElement _signInButton;

    public void clickOnCreateAccount() {
        Reporter.addStepLog("Clicking on creating new account "+_createAccountLink.toString());
        clickOnElement(_createAccountLink);
        log.info("Clicking on creating new account "+_createAccountLink.toString());
    }

    public void enterLoginEmail(String str) {
        Reporter.addStepLog("Entering email id in the email field"+_emailfield.toString());
        sendTextToElement(_emailfield, str);
        log.info("Entering email id in the email field"+_emailfield.toString());
    }

    public void enterLoginPassword(String str) {
        Reporter.addStepLog("Entering password in the password field"+_passwordfield.toString());
        sendTextToElement(_passwordfield, str);
        log.info("Entering password in the password field"+_passwordfield.toString());
    }

    public void clickOnSignInButton() {
        Reporter.addStepLog("Clicking on sign in button"+_signInButton.toString());
        clickOnElement(_signInButton);
        log.info("Clicking on sign in button"+_signInButton.toString());
    }
}
