package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy (xpath = "//span[.= 'Products']")
    public WebElement productsHeader;

    @FindBy (xpath = "//div[@class= 'app_logo']")
    public WebElement appLogo;

}
