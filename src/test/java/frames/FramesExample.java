package frames;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysite.sit.DriverHolder;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Maximize broser
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Selenium%20Course/Selenium%20Course/selenium/index/index.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("label")).click();
		
		Runtime.getRuntime().exec("D:\\uploadimages\\upload.exe");
		
//		driver.findElement(By.xpath("//input[@id='uploadimage']")).sendKeys("D:\\carimages\\image1.jpg");
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//input[@id='uploadimage']")).sendKeys("D:\\carimages\\image2.jpg");
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//input[@id='uploadimage']")).sendKeys("D:\\carimages\\image3.jpg");
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//input[@id='uploadimage']")).sendKeys("D:\\carimages\\image4.jpg");

	}

}
