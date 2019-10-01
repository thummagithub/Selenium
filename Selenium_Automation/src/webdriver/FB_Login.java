package webdriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FB_Login {
	// create webdriver objcet
	static WebDriver driver;

	public static void screenshots(String name) throws Exception {

		Date d = new Date();
		System.out.println(d);// Fri Sep 13 12:45:22 EDT 2019

		// yyyy_MM_dd_HH_mm_ss
		DateFormat df = new SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);

		// TakeScreenshot
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("./Screenshotsr/" + name + timeStamp + ".PNG"));

	}

	public static void main(String[] args) throws Exception {

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

		// Type URL
		driver.get("https://www.fb.com");

		// Type UserName and Passowrd
		driver.findElement(By.id("email")).sendKeys("Jagan123@gmail.com");
		screenshots("UN");

		driver.findElement(By.name("pass")).sendKeys("dsram");
		screenshots("Pwd");
		// click on login button
		driver.findElement(By.id("loginbutton")).click();
		screenshots("Lb");
		// link handle
		// driver.findElement(By.linkText("Forgot account?")).click();

	}
}
