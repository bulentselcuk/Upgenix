package com.weborders.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPages extends BasePage {

    @FindBy(xpath="//a[contains(text(),'Order')]")
    public WebElement order;
    @FindBy(xpath="//div[@class='buttons_process']//input[@class='btn_dark']")
    public WebElement reset;
    @FindBy(xpath="//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement process;
}
