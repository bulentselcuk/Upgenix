package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {

    @Test(dataProvider = "smokeTestData")
    public void smokeTest(String menu, String subTitle) {
        extentTest = extentReports.createTest("Verify" + menu + "page has " + subTitle + "subtitle, SmokeTest");

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        BrowserUtilities.wait(2);
        loginPage.navigateTo(menu);
        BrowserUtilities.wait(2);
        Assert.assertEquals(loginPage.getTextOfSubTitle(), subTitle);

        extentTest.pass(subTitle + "Smoke Test, subtitle verified!");
    }

    @DataProvider(parallel = true)
    public Object[][] smokeTestData() {
        return new Object[][]{
                {"View all orders", "List of All Orders"},
                {"View all products", "List of Products"},
                {"Order", "Order"}
        };
    }

}