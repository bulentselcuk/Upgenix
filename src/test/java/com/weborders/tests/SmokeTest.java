package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {

    @Test
    public void smokeTest() {
        extentTest=extentReports.createTest ( "Verify, SmokeTest" );
        LoginPage loginPage=new LoginPage ();
        loginPage.login ();

        WebElement viewallorders=driver.findElement ( By.xpath ( "//a[.='View all orders']" ) );
        viewallorders.click ();
        BrowserUtilities.wait ( 2 );
        WebElement viewallproducts=driver.findElement ( By.xpath ( "//a[.='View all products']" ) );
        viewallproducts.click ();
        BrowserUtilities.wait ( 2 );
        WebElement order=driver.findElement ( By.xpath ( "//a[.='Order']" ) );
        order.click ();
        BrowserUtilities.wait ( 2 );
        extentTest.pass ( "Smoke Test, verified!" );



    }

}