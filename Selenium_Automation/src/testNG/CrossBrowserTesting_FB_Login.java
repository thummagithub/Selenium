package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CrossBrowserTesting_FB_Login {
	WebDriver driver;

	@Test
	public void f() {
		// Type URL
		driver.get("https://www.fb.com");
		// Type UserName and Passowrd
		driver.findElement(By.id("email")).sendKeys("Jagan123@gmail.com");

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	// String browser = "Opera";
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			// launch chrome browser
			System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			// Firefox browser
			System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("IE")) {
			// IE browser code
			System.setProperty("webdriver.ie.driver", "./BrowserDrivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else {
			System.out.println("Please give valid browser parameter********************");
		}

	}

}
