package com.mysite.uat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.mysite.pages.DashboardPage;
import com.mysite.pages.Header;
import com.mysite.pages.LeftNavigation;
import com.mysite.pages.LoginPage;

public class FullTest3 {
	
	@Test
	public void ManageCreateBrands() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		DriverHolder.map1.put("ManageCreateBrands", driver);
		
		//Maximize the browser
		driver.manage().window().maximize();

		driver.get("http://localhost/carrental/admin/");
		
		LoginPage loginpage = new LoginPage(driver);
		LeftNavigation leftnavigation = new LeftNavigation(driver);
		Header header = new Header(driver);
		
		//Enter the user name
		loginpage.returnUserName().sendKeys("admin");
		
		//Enter the password
		loginpage.returnPassword().sendKeys("Test@12345");
		
		//click on login button
		loginpage.returnLoginButton().click();
		Thread.sleep(1000);
		
		//Click on Brands link on left navigation
		leftnavigation.returnBrandsLink().click();
		Thread.sleep(1000);
		
		//Click on Create Brand link
		leftnavigation.returnCreateBrandLink().click();
		Thread.sleep(1000);
		
		//Logout
		Actions a = new Actions(driver);
		a.moveToElement(header.returnAccountLink()).build().perform();
		
		header.returnLogoutLink().click();
		Thread.sleep(3000);
		
		//close browser
		driver.quit();

	}

}

