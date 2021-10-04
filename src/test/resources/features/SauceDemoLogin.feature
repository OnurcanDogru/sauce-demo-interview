@wip
Feature: Login feature
  User Story : As a Swag Labs customer who is not locked out, I need to be able to log in so
              that I can purchase Sauce Labs merch.

  Scenario: 1 Successful Login
    Given I am on the Sauce Demo Login Page
    When  I fill the account information for account "standard_user" into the Username field and "secret_sauce" into the Password field
    And   I click the Login Button
    Then  I am redirected to the Sauce Demo Main Page
    And   I verify the App Logo exists

  Scenario: 2 Failed Login
    Given I am on the Sauce Demo Login Page
    When  I fill the account information for account "locked_out_user" into the Username field and "secret_sauce" into the Password field
    And   I click the Login Button
    Then  I verify the Error Message contains the text "Sorry, this user has been banned."

