package com.weborders.pages;

import com.weborders.utilities.BrowserUtilities;
import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id="ctl00_MainContent_username")
    private WebElement userName;
    @FindBy(id="ctl00_MainContent_password")
    private WebElement password;
    @FindBy(tagName = "h2")
    private WebElement subTitle;

    public void login() { // Orginal way...
        BrowserUtilities.wait(2);
        String usernameValue = ConfigurationReader.getProperty("username");
        String passwordValue = ConfigurationReader.getProperty("password");
        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public String getTextOfSubTitle() {
        BrowserUtilities.wait(2);
        return subTitle.getText();
    }
 }