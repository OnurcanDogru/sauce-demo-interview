package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy (id = "user-name")
    public WebElement usernameInputBox;

    @FindBy (id = "password")
    public WebElement passwordInputBox;

    @FindBy (id = "login-button")
    public WebElement loginButton;

    @FindBy (xpath = "//h3[@data-test = 'error']")
    public WebElement errorMessage;

}
