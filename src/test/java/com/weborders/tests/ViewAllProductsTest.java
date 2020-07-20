package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.pages.ViewAllProductsPage;
import com.weborders.utilities.BrowserUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ViewAllProductsTest extends BaseTest{

    @Test
    public void printPageSubtitle() {
        extentTest=extentReports.createTest ( "Verify page, Print Subtitle" );
        LoginPage loginPage=new LoginPage ();
        loginPage.login ();

        ViewAllProductsPage viewAllProductsPage=new ViewAllProductsPage();
        viewAllProductsPage.viewAllProductsClick.click();

        BrowserUtilities.wait ( 2 );

        String expectedSubtitle = "List of Products";
        String actualSubtitle = viewAllProductsPage.listOfProducts.getText();

        Assert.assertEquals(actualSubtitle,expectedSubtitle, "List of Products");

        extentTest.pass ( "Subtitle Printed, verified!" );
    }

    @Test
    public void printTable(){
        extentTest=extentReports.createTest ( "Verify page, Print Table" );

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ViewAllProductsPage viewAllProductsPage=new ViewAllProductsPage();
        viewAllProductsPage.viewAllProductsClick.click();


        String actual = viewAllProductsPage.Table.getText();
        String expected = "Product name";

        Assert.assertTrue(actual.equals(expected));

        extentTest.pass ( "Table Printed, verified!" );

    }
}
