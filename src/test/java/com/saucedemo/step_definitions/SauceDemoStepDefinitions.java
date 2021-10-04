package com.saucedemo.step_definitions;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.MainPage;
import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SauceDemoStepDefinitions {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("I am on the Sauce Demo Login Page")
    public void i_am_on_the_sauce_demo_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("I fill the account information for account {string} into the Username field and {string} into the Password field")
    public void i_fill_the_account_information_for_account_into_the_username_field_and_into_the_password_field(String username, String password) {

        loginPage.usernameInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);

    }

    @When("I click the Login Button")
    public void i_click_the_login_button() {

        loginPage.loginButton.click();

    }

    @Then("I am redirected to the Sauce Demo Main Page")
    public void i_am_redirected_to_the_sauce_demo_main_page() {

        Assert.assertTrue(mainPage.productsHeader.isDisplayed());

    }

    @Then("I verify the App Logo exists")
    public void i_verify_the_app_logo_exists() {

        Assert.assertTrue(mainPage.appLogo.isDisplayed());

    }


    @Then("I verify the Error Message contains the text {string}")
    public void iVerifyTheErrorMessageContainsTheText(String errorMessage) {

        String expectedInErrorMessage = errorMessage;
        String actualErrorMessage = loginPage.errorMessage.getText();
        System.out.println("actualErrorMessage = " + actualErrorMessage);
        System.out.println("expectedInErrorMessage = " + expectedInErrorMessage);

        Assert.assertTrue(actualErrorMessage.contains(expectedInErrorMessage));

    }
}
