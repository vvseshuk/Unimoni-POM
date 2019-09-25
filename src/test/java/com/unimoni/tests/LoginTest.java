package com.unimoni.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.unimoni.pages.HomePage;
import com.unimoni.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void login() {
		LoginPage loginPage = new LoginPage(getDriver(), getWait());
		HomePage homePage = new HomePage(getDriver(), getWait());
		Assert.assertEquals(loginPage.getPageTitle(), "Guru99 Bank Home Page");
		loginPage.login("mngr222872", "apamyhy");
		Assert.assertEquals(homePage.getPageTitle(), "Guru99 Bank Manager HomePage");
		homePage.logout();
		Assert.assertEquals(loginPage.getPageTitle(), "Guru99 Bank Home Page");
	}
}
