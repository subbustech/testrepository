package com.mysite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	public WebElement returnUserName() {
		return userName;
	}
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	public WebElement returnPassword() {
		return password;
	}
	
	@FindBy(xpath="//button[@name='login']")
	WebElement login;
	public WebElement returnLoginButton() {
		return login;
	}
	
}
