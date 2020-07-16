package com.weborders.tests;


import com.weborders.pages.LoginPage;
import com.weborders.pages.ViewAllOrdersPage;
import com.weborders.utilities.BrowserUtilities;
import org.testng.annotations.Test;

public class ViewAllOrdersTest extends BaseTest {

    @Test
    public void checkAllDeleteTest() {
        extentTest = extentReports.createTest("Verify page, Delete All Orders");
        LoginPage loginPage = new LoginPage ();
        ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage ();

        loginPage.login ();
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.checkAll.click ();
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.deleteSelected.click ();
        extentTest.pass("All Orders was deleted, verified!");
    }
    @Test
    public void unceheckAllandLogOutTest(){
        extentTest = extentReports.createTest("Verify page, Uncheck All Orders and LogOut");
        LoginPage loginPage = new LoginPage ();
        ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage ();
        loginPage.login ();
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.checkAll.click ();
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.unceheckAll.click ();
        BrowserUtilities.wait ( 2 );
        viewAllOrdersPage.logOut.click ();
        extentTest.pass("Uncheck All Orders and LogOut, verified!");

    }
}
