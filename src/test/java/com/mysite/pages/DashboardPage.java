package com.mysite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Full Detail')])[1]")
	WebElement regUsersLinkOnDashboad;
	public WebElement returnRegUsersLinkOnDashbord() {
		return regUsersLinkOnDashboad;
	}
	
}
