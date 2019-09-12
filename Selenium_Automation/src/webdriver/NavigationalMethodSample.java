package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethodSample {
	public static void main(String[] args) throws InterruptedException {
		// create webdriver objcet
		WebDriver driver;

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://ttdsevaonline.com/#/registration");
		//driver.get("https://ttdsevaonline.com/#/registration");
		
		driver.navigate().refresh();
		//to go to backpage 
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().forward();
		
		
		
	
	}

}
