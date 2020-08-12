package com.mysite.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mysite.pages.DashboardPage;
import com.mysite.pages.Header;
import com.mysite.pages.LeftNavigation;
import com.mysite.pages.LoginPage;

public class FullTest {

	WebDriver driver;
	
	@BeforeMethod
	public void OpenAndLogin() {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		//Maximize broser
		driver.manage().window().maximize();
		
		driver.get("http://localhost/carrental/admin/");
		
		LoginPage loginpage = new LoginPage(driver);
		
		//Enter the user name
		loginpage.returnUserName().sendKeys("admin");
		
		//Enter the password
		loginpage.returnPassword().sendKeys("Test@12345");
		
		//click on login button
		loginpage.returnLoginButton().click();

	}
	
	@AfterMethod
	public void LogoutAndClose() throws InterruptedException {
		
		Header header = new Header(driver);
		
		//Logout
		Actions a = new Actions(driver);
		a.moveToElement(header.returnAccountLink()).build().perform();
		
		header.returnLogoutLink().click();
		Thread.sleep(3000);
		
		//close browser
		driver.quit();

	}
	
	@Test
	public void manageAdmingDashborad() throws InterruptedException {
		
		LeftNavigation leftnavigation = new LeftNavigation(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		
		//Click on Dashboard link on left navigation
		leftnavigation.returnDashboradLink().click();
		
		//Click on 'More Detail' for reg. users on Dashboard
		dashboard.returnRegUsersLinkOnDashbord().click();
		

	}

	@Test
	public void ManageBrandsScript() throws InterruptedException {
				
		LeftNavigation leftnavigation = new LeftNavigation(driver);
		
		//Click on Brands link on left navigation
		leftnavigation.returnBrandsLink().click();
		Thread.sleep(1000);
		
		//Click on Create Brand link
		leftnavigation.returnManageBrandsLink().click();
		Thread.sleep(1000);

	}

	@Test
	public void ManageCreateBrands() throws InterruptedException {
		
		LeftNavigation leftnavigation = new LeftNavigation(driver);
		
		//Click on Brands link on left navigation
		leftnavigation.returnBrandsLink().click();
		Thread.sleep(1000);
		
		//Click on Create Brand link
		leftnavigation.returnCreateBrandLink().click();
		Thread.sleep(1000);
	}

}

