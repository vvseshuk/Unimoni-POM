package com.unimoni.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	@FindBy(name = "uid")
	private WebElement userId_textbox_name;

	@FindBy(name = "password")
	private WebElement password_textbox_name;
	
	@FindBy(name = "btnLogin")
	private WebElement login_button_name;
	
	@FindBy(name = "btnReset")
	private WebElement reset_button_name;

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public void setUserId(String userId) {
		userId_textbox_name.clear();
		userId_textbox_name.sendKeys(userId);
	}

	public void setPassword(String password) {
		password_textbox_name.clear();
		password_textbox_name.sendKeys(password);
	}

	public void clickOnLogin() {
		login_button_name.click();
	}

	public void clickOnReset() {
		reset_button_name.click();
	}

	public void login(String userId, String password) {
		setUserId(userId);
		setPassword(password);
		clickOnLogin();
	}

	public void reset() {
		clickOnReset();
	}

}
