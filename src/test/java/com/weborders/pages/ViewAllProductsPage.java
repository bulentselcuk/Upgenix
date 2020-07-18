package com.weborders.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllProductsPage extends BasePage {

    @FindBy(tagName= "h2")
    public WebElement listOfProducts;

    @FindBy(linkText= "View all products")
    public WebElement viewAllProductsClick;

    @FindBy(tagName="th")
    public WebElement Table;




}
