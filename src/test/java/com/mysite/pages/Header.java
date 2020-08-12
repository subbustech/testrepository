package com.mysite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
	WebDriver driver;
	public Header(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement returnAccountLink() {
		return driver.findElement(By.xpath("//a[contains(text(), 'Account')]"));
	}
	
	public WebElement returnLogoutLink() {
		return driver.findElement(By.xpath("//a[text()='Logout']"));
	}
}
