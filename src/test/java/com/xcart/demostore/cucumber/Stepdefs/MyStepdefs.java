package com.xcart.demostore.cucumber.Stepdefs;

import com.xcart.demostore.pages.AccountPage;
import com.xcart.demostore.pages.HomePage;
import com.xcart.demostore.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Ravi's Creation
 * Date of Creation 29 Apr 20
 */
public class MyStepdefs {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }
    @When("^I click on sign in tab$")
    public void iClickOnSignInTab() {
        new HomePage().clickOnSignInTab();
    }

    @And("^I enter \"([^\"]*)\" id in the email field$")
    public void iEnterIdInTheEmailField(String email) {
        new LoginPage().enterLoginEmail(email);
    }
    @And("^I enter \"([^\"]*)\"in the password fiel$")
    public void iEnterInThePasswordFiel(String pwd) {
        new LoginPage().enterLoginPassword(pwd);
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        new LoginPage().clickOnSignInButton();
    }

    @Then("^I am logged in successfully and I see the Log in Text\"([^\"]*)\"$")
    public void iAmLoggedInSuccessfullyAndISeeTheLogInText(String str) {
        new AccountPage().verifyAccountText(str);
    }
    @And("^I click on my account drop down$")
    public void iClickOnMyAccountDropDown() {
        new AccountPage().clickOnMyAccountButton();
    }

    @And("^I click on log out button$")
    public void iClickOnLogOutButton() {
        new AccountPage().clickOnLogOutButton();
    }

    @Then("^I see sigin/sign out text \"([^\"]*)\"$")
    public void iSeeSiginSignOutText(String text){
        new HomePage().verifySignInText(text);

    }

}


