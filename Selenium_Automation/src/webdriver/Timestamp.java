package webdriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Timestamp {

	static WebDriver driver;

	public static void screenshots(String name) throws Exception {

		// get the system date
		Date d = new Date();
		System.out.println(d);// Fri Sep 13 12:45:22 EDT 2019

		// yyyy_MM_dd_HH_mm_ss
		DateFormat df = new SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);

		// take screenshot
		String path = ".\\screenshot\\";
		// system will store the screenshot into RAM location
		// To move your screenshot to specific folder
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("./Screenshotsr/" + name + timeStamp + ".PNG"));

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

}
