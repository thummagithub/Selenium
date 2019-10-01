package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver;

		// launch chrome browser
//		System.setProperty("webdriver.ie.driver", "./BrowserDrivers/IEDriverServer.exe");
//		driver = new InternetExplorerDriver();
		
		
		//Firefox browser
		System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		driver.get("https://www.fb.com");

		// Type UserName and Passowrd
		driver.findElement(By.id("email")).sendKeys("Jagan123@gmail.com");

	}

}
