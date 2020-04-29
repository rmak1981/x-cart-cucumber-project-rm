package com.xcart.demostore.pages;

import com.cucumber.listener.Reporter;
import com.xcart.demostore.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Ravi's Creation
 * Date of Creation 29 Apr 20
 */

public class HomePage extends UtilityRM {

            private static final Logger log = LogManager.getLogger(HomePage.class.getName());

        @FindBy(xpath = "//div[@id='header-bar']//div//span[contains(text(),'Sign in')]")
        WebElement _signInTab;

        public void verifySignInText(String str) {
            Reporter.addStepLog("verifying Sign in text on Home page" + _signInTab.toString());
            verifyText(_signInTab, str);
            log.info("verifying Sign in text on Home page" + _signInTab.toString());
        }

        public void clickOnSignInTab() {
            Reporter.addStepLog("Clicking on sign in link on home page" + _signInTab.toString());
            clickOnElement(_signInTab);
            log.info("Clicking on sign in link on home page" + _signInTab.toString());
        }

    }
