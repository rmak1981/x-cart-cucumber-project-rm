package com.xcart.demostore.cucumber.Stepdefs;

import com.xcart.demostore.pages.AccountPage;
import com.xcart.demostore.pages.HomePage;
import com.xcart.demostore.pages.LoginPage;
import com.xcart.demostore.pages.NewAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

/*
 * Ravi's Creation
 * Date of Creation 29 Apr 20
 */
public class NewAccountSteps {

    @And("^I click on create new account$")
    public void iClickOnCreateNewAccount() {
        new LoginPage().clickOnCreateAccount();
    }

    @And("^I enter email \"([^\"]*)\"in the email field$")
    public void iEnterEmailInTheEmailField(String email)  {
        new NewAccountPage().enterEmail(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new NewAccountPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String password) {
        new NewAccountPage().enterConfPassword(password);
    }

    @And("^I click on create account$")
    public void iClickOnCreateAccount() {
        new NewAccountPage().clickOnCreateBtn();
    }
    @Then("^I see My account text\"([^\"]*)\"$")
    public void iSeeMyAccountText(String str) {
        new AccountPage().verifyAccountText(str);
    }

    @And("^I click on Hot Deals$")
    public void iClickOnHotDeals() {
        new AccountPage().clickOnHotDeals();
    }

    @And("^I click on Sale$")
    public void iClickOnSale() {
        new AccountPage().clickOnSale();
    }

    @Then("^I add a product to basket$")
    public void iAddAProductToBasket() {
        new AccountPage().clickOnAddTocart();
    }

    @Then("^I see product added text\"([^\"]*)\"$")
    public void iSeeProductAddedText(String str) {
        new AccountPage().verifyAddToCartText(str);
    }



}
