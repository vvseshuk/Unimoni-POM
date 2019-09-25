package com.unimoni.tests;

import java.util.Properties;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.unimoni.pages.HomePage;
import com.unimoni.pages.LoginPage;
import com.unimoni.utilities.PropertiesUtility;

public class HomeTest extends BaseTest {
	
	@Test
	public void clickOnNewCustomer() {
		LoginPage loginPage = new LoginPage(getDriver(), getWait());
		Properties properties = PropertiesUtility.getAllPoperties("Login");
		loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		HomePage homePage = new HomePage(getDriver(), getWait());
		Assert.assertEquals(homePage.getPageTitle(), "Guru99 Bank Manager HomePage");
		homePage.clickNewCustomer();
		Assert.assertEquals(homePage.getPageTitle(), "Guru99 Bank New Customer Entry Page");		
	}

}
