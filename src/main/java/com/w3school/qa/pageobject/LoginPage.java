package com.w3school.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='current-password']")
	WebElement password;

	@FindBy(xpath = "//span[normalize-space()='Log in']")
	WebElement Loginbutton;

	public LoginPage(WebDriver driver) {
		driver = this.driver;
		PageFactory.initElements(driver, this);

	}

	public void email(String emailid) {
		email.sendKeys(emailid);

	}

	public void password(String pswd) {
		password.sendKeys(pswd);
	}

	public void loginbutton() {
		Loginbutton.click();
	}
}
