package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.pages.OrderPages;
import com.weborders.pages.ViewAllOrdersPage;
import com.weborders.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrdersTest extends BaseTest{

    @Test
    public void order(){
        extentTest=extentReports.createTest ( "Verify page, Order" );
        LoginPage loginPage=new LoginPage ();
        loginPage.login ();
        OrderPages orderPages = new OrderPages ();
        orderPages.order.click ();
        ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage ();
//        ********************
//        ProductInformation for Reset...
        WebElement product=driver.findElement ( By.xpath ( "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']" ) );
        Select s1=new Select ( product );
        BrowserUtilities.wait ( 2 );
        s1.selectByVisibleText ( "ScreenSaver" );
        BrowserUtilities.wait ( 2 );
        WebElement quantity=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']" ) );
        BrowserUtilities.wait ( 2 );
        quantity.clear ();
        BrowserUtilities.wait ( 2 );
        quantity.sendKeys ( "7" );
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.calculate.click ();
//        ********************
//        AddresInformation
        WebElement customerName=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_txtName']" ) );
        customerName.clear ();
        customerName.sendKeys ( "Kenny Rogers" );
        WebElement street=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_TextBox2']" ) );
        street.clear ();
        street.sendKeys ( "178, Mohawk Piont Cir" );
        WebElement city=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']" ) );
        city.clear ();
        city.sendKeys ( "Dallas" );
        WebElement zip=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_TextBox5']" ) );
        zip.clear ();
        zip.sendKeys ( "99570" );
//        ********************
//        Payment Option
        WebElement Card=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_cardList_0']" ) );
        Card.click ();

        WebElement cardNr=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_TextBox6']" ) );
        BrowserUtilities.wait ( 2 );
        cardNr.clear ();
        BrowserUtilities.wait ( 2 );
        cardNr.sendKeys ( "155696365852" );
        BrowserUtilities.wait ( 2 );

        WebElement expire=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_TextBox1']" ) );
        BrowserUtilities.wait ( 2 );
        expire.clear ();
        expire.sendKeys ( "08/30" );
        BrowserUtilities.wait ( 2 );
        orderPages.reset.click ();
//        **********************
//        **********************
//        ProductInformation for Process...

        s1.selectByVisibleText ( "ScreenSaver" );
        BrowserUtilities.wait ( 2 );
        quantity.clear ();
        BrowserUtilities.wait ( 2 );
        quantity.sendKeys ( "7" );
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.calculate.click ();
//        ********************
//        AddresInformation  for Reset..
        customerName.clear ();
        customerName.sendKeys ( "Kenny Rogers" );
        street.clear ();
        street.sendKeys ( "178, Mohawk Piont Cir" );
        city.clear ();
        city.sendKeys ( "Dallas" );
        zip.clear ();
        zip.sendKeys ( "99570" );
//        ********************
//        Payment Option
        Card.click ();
        BrowserUtilities.wait ( 2 );
        cardNr.clear ();
        BrowserUtilities.wait ( 2 );
        cardNr.sendKeys ( "155696365852" );
        BrowserUtilities.wait ( 2 );
        expire.clear ();
        expire.sendKeys ( "08/30" );
        BrowserUtilities.wait ( 2 );
        orderPages.process.click ();
        extentTest.pass ( "Order, verified!" );
    }
}
