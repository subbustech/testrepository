package com.mysite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftNavigation {
	WebDriver driver;
	public LeftNavigation(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement returnDashboradLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
		//return driver.findElement(By.xpath("//a[contains(text(),'jhlkjh')]"));
	}
	
	public WebElement returnBrandsLink() {
		return driver.findElement(By.xpath("(//a[contains(text(),'Brands')])[1]"));
	}
	
	public WebElement returnCreateBrandLink() {
		return driver.findElement(By.xpath("//a[text()='Create Brand']"));
	}
	
	public WebElement returnManageBrandsLink() {
		//return driver.findElement(By.xpath("//a[text()='Manage Brands']"));
		return driver.findElement(By.xpath("//a[text()='asdhlkhl']"));
	}
}
