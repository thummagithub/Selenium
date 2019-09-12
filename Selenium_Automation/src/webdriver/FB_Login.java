package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Login {
	public static void main(String[] args) {

		// create webdriver objcet
		WebDriver driver;

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

		// Type URL
		driver.get("https://www.fb.com");
		

		// Type UserName and Passowrd
		driver.findElement(By.id("email")).sendKeys("Ramya123@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dsram");

		// click on login button
		//driver.findElement(By.id("loginbutton")).click();
		
		
		
		//link handle
				driver.findElement(By.linkText("Forgot account?")).click();

	}
}
