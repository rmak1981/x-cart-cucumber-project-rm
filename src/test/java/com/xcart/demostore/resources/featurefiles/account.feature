Feature: New Account feature
  As a user I want to create new account successfully

  Scenario: User should navigate to Sign up page successfully
    Given   I am on Home Page
    When    I click on sign in tab
    And     I click on create new account
    And     I enter email ""in the email field
    And     I enter password "london1"
    And     I enter confirm password "london1"
    And     I click on create account
    Then    I see My account text"My account"

  Scenario: User should be able to add anew product
    Given   I am on Home Page
    When    I click on sign in tab
    And     I enter "ram111@gmail.com" id in the email field
    And     I enter "london1"in the password fiel
    And     I click on sign in button
    And     I click on Hot Deals
    And     I click on Sale
    Then    I add a product to basket
    Then    I see product added text"You have just added"

