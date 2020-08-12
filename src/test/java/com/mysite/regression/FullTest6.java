package com.mysite.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.mysite.pages.DashboardPage;
import com.mysite.pages.Header;
import com.mysite.pages.LeftNavigation;
import com.mysite.pages.LoginPage;

public class FullTest6 {
	
	@Test
	public void manageAdminDashborad() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Maximize broser
		driver.manage().window().maximize();
		
		driver.get("http://localhost/carrental/admin/");
		
		LoginPage loginpage = new LoginPage(driver);
		LeftNavigation leftnavigation = new LeftNavigation(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		Header header = new Header(driver);
		
		//Enter the user name
		loginpage.returnUserName().sendKeys("admin");
		
		//Enter the password
		loginpage.returnPassword().sendKeys("Test@12345");
		
		//click on login button
		loginpage.returnLoginButton().click();
		
		//Click on Dashboard link on left navigation
		leftnavigation.returnDashboradLink().click();
		
		//Click on 'More Detail' for reg. users on Dashboard
		dashboard.returnRegUsersLinkOnDashbord().click();
		
		//Logout
		Actions a = new Actions(driver);
		a.moveToElement(header.returnAccountLink()).build().perform();
		
		header.returnLogoutLink().click();
		Thread.sleep(3000);
		
		//close browser
		driver.quit();

	}

	@Test
	public void ManageBrandsScript() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
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
		leftnavigation.returnManageBrandsLink().click();
		Thread.sleep(1000);
		
		//Logout
		Actions a = new Actions(driver);
		a.moveToElement(header.returnAccountLink()).build().perform();
		
		header.returnLogoutLink().click();
		Thread.sleep(3000);
		
		//close browser
		driver.quit();

	}

	@Test
	public void ManageCreateBrands() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
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

