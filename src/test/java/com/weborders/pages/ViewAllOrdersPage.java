package com.weborders.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllOrdersPage extends BasePage{

    @FindBy(xpath="//a[@id='ctl00_MainContent_btnCheckAll']")
    public WebElement checkAll;
    @FindBy(xpath="//a[@id='ctl00_MainContent_btnUncheckAll']")
    public WebElement unceheckAll;
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
    public WebElement deleteSelected;
    @FindBy(xpath="//a[@id='ctl00_logout']")
    public WebElement logOut;
}
