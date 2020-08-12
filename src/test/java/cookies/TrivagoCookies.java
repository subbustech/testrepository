package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivagoCookies {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Maximize broser
		driver.manage().window().maximize();

		driver.get("https://www.trivago.in");

		Set<Cookie> st =  driver.manage().getCookies();

		System.out.println("------Before Deleting--------");

		for(Cookie ck : st) {
			System.out.println(ck.getName()+" : "+ck.getDomain());
		}

		driver.manage().deleteAllCookies();

		System.out.println("------After Deleting-------");
		
		Set<Cookie> st1 =  driver.manage().getCookies();
		
		for(Cookie ck : st1) {
			System.out.println(ck.getName()+" : "+ck.getDomain());
		}



	}

}
