package com.weborders.tests;


import com.weborders.pages.LoginPage;
import com.weborders.pages.ViewAllOrdersPage;
import com.weborders.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ViewAllOrdersTest extends BaseTest {

    @Test
    public void checkAllDeleteTest() {
        extentTest=extentReports.createTest ( "Verify page, Delete All Orders" );
        LoginPage loginPage=new LoginPage ();
        ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage ();
        loginPage.login ();
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.checkAll.click ();
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.deleteSelected.click ();
        extentTest.pass ( "All Orders was deleted, verified!" );
    }

    @Test
    public void unceheckAllandLogOutTest() {
        extentTest=extentReports.createTest ( "Verify page, Uncheck All Orders and LogOut" );
        LoginPage loginPage=new LoginPage ();
        ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage ();
        loginPage.login ();
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.checkAll.click ();
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.unceheckAll.click ();
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.logOut.click ();
        extentTest.pass ( "Uncheck All Orders and LogOut, verified!" );

    }

    @Test
    public void editOrder() {
        extentTest=extentReports.createTest ( "Verify page, Edit Order" );
        LoginPage loginPage=new LoginPage ();
        ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage ();
        loginPage.login ();
        BrowserUtilities.wait ( 2 );

//      Edit Order...
        viewAllOrdersPage.editOrder.click ();
        BrowserUtilities.wait ( 2 );
//       ************************************
//        Product Information
        WebElement product=driver.findElement ( By.xpath ( "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']" ) );
        Select s1=new Select ( product );
        BrowserUtilities.wait ( 2 );
        s1.selectByVisibleText ( "FamilyAlbum" );
        BrowserUtilities.wait ( 2 );
        WebElement quantity=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']" ) );
        BrowserUtilities.wait ( 2 );
        quantity.clear ();
        BrowserUtilities.wait ( 2 );
        quantity.sendKeys ( "3" );
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.calculate.click ();
//        ************************************
//        Address Information
        WebElement customerName=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_txtName']" ) );
        customerName.clear ();
        customerName.sendKeys ( "Michael Moore" );
        WebElement street=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_TextBox2']" ) );
        street.clear ();
        street.sendKeys ( "1923, Louetta Dr" );
        WebElement city=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']" ) );
        city.clear ();
        city.sendKeys ( "Austin" );
        WebElement zip=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_TextBox5']" ) );
        zip.clear ();
        zip.sendKeys ( "77573" );
//        *************************************
//         Payment Information
        WebElement Card=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_cardList_2']" ) );
        Card.click ();

        WebElement cardNr=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_TextBox6']" ) );
        BrowserUtilities.wait ( 2 );
        cardNr.clear ();
        BrowserUtilities.wait ( 2 );
        cardNr.sendKeys ( "657473543219" );
        BrowserUtilities.wait ( 2 );

        WebElement expire=driver.findElement ( By.xpath ( "//input[@id='ctl00_MainContent_fmwOrder_TextBox1']" ) );
        BrowserUtilities.wait ( 2 );
        expire.clear ();
        expire.sendKeys ( "07/15" );

        viewAllOrdersPage.update.click ();
        extentTest.pass ( "Orders Edited, verified!" );

    }
}
