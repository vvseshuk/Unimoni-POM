package com.unimoni.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	@FindBy(linkText = "Log out")
	private WebElement logout_link_text;
	
	@FindBy(linkText = "Manager")
	private WebElement manager;
	
	@FindBy(linkText = "New Customer")
	private WebElement newCustomer;
	
	@FindBy(linkText = "Edit Customer")
	private WebElement editCustomer;
	
	@FindBy(linkText = "Delete Customer")
	private WebElement deleteCustomer;
	
	
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);		
	}

	public void logout() {
		logout_link_text.click();
		getDriver().switchTo().alert().accept();
	}
	
	public void clickNewCustomer() {
		newCustomer.click();
	}

}
