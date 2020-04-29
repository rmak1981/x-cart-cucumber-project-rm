package com.xcart.demostore.cucumber;

import com.cucumber.listener.Reporter;
import com.xcart.demostore.basepage.BasePage;
import com.xcart.demostore.browserselector.BrowserSelector;
import com.xcart.demostore.loadproperty.Loadproperty;
import com.xcart.demostore.utility.UtilityRM;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 * Date of Creation 29 Apr 20
 */
public class Hook extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    Loadproperty loadproperty = new Loadproperty();

    String browser = loadproperty.getProperty("browser");
    String baseURL = loadproperty.getProperty("baseURL");

    // cucumber before class must need to selected
    @Before
    public void openBrowser() {

        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);
        // assign author
        Reporter.assignAuthor("x cart Prime 3", "GS-RM");
    }

    @After
    public void closeBrowser(Scenario scenario) {

        if (scenario.isFailed()) {
            String screenShotPath = UtilityRM.getScreenshot(driver, scenario.getName());
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

       // driver.quit();
    }

}
