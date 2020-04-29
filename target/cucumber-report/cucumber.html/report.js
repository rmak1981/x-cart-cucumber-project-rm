$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/xcart/demostore/resources/featurefiles/account.feature");
formatter.feature({
  "line": 1,
  "name": "New Account feature",
  "description": "As a user I want to create new account successfully",
  "id": "new-account-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 22782545500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to Sign up page successfully",
  "description": "",
  "id": "new-account-feature;user-should-navigate-to-sign-up-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on sign in tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on create new account",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter email \"\"in the email field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter password \"london1\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter confirm password \"london1\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on create account",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see My account text\"My account\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 492227400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignInTab()"
});
formatter.result({
  "duration": 1495407400,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.iClickOnCreateNewAccount()"
});
formatter.result({
  "duration": 22290406600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 15
    }
  ],
  "location": "NewAccountSteps.iEnterEmailInTheEmailField(String)"
});
formatter.result({
  "duration": 539818700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "london1",
      "offset": 18
    }
  ],
  "location": "NewAccountSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 598955100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "london1",
      "offset": 26
    }
  ],
  "location": "NewAccountSteps.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 283056000,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.iClickOnCreateAccount()"
});
formatter.result({
  "duration": 336819300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My account",
      "offset": 22
    }
  ],
  "location": "NewAccountSteps.iSeeMyAccountText(String)"
});
formatter.result({
  "duration": 3154482200,
  "status": "passed"
});
formatter.after({
  "duration": 183100,
  "status": "passed"
});
formatter.before({
  "duration": 16467708100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should be able to add anew product",
  "description": "",
  "id": "new-account-feature;user-should-be-able-to-add-anew-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I click on sign in tab",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter \"ram111@gmail.com\" id in the email field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter \"london1\"in the password fiel",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Hot Deals",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Sale",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I add a product to basket",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I see product added text\"You have just added\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 45900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignInTab()"
});
formatter.result({
  "duration": 1795982100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ram111@gmail.com",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterIdInTheEmailField(String)"
});
formatter.result({
  "duration": 1851194000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "london1",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterInThePasswordFiel(String)"
});
formatter.result({
  "duration": 472426700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignInButton()"
});
formatter.result({
  "duration": 369592800,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.iClickOnHotDeals()"
});
formatter.result({
  "duration": 24986567800,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d81.0.4044.122)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENSESUK\u0027, ip: \u0027192.168.0.15\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.122, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\LENSES~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:60674}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: edc33142a4c152669507c2228bd97566\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.xcart.demostore.utility.UtilityRM.clickOnElement(UtilityRM.java:33)\r\n\tat com.xcart.demostore.pages.AccountPage.clickOnHotDeals(AccountPage.java:56)\r\n\tat com.xcart.demostore.cucumber.Stepdefs.NewAccountSteps.iClickOnHotDeals(NewAccountSteps.java:49)\r\n\tat ✽.And I click on Hot Deals(src/test/java/com/xcart/demostore/resources/featurefiles/account.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NewAccountSteps.iClickOnSale()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAccountSteps.iAddAProductToBasket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "You have just added",
      "offset": 25
    }
  ],
  "location": "NewAccountSteps.iSeeProductAddedText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1362186200,
  "status": "passed"
});
});