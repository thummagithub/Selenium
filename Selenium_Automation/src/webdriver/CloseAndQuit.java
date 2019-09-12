package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	public static void main(String[] args) throws InterruptedException {
		// create webdriver objcet
		WebDriver driver;

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://naukri.com");
		Thread.sleep(5000);
		
		
		String abc = driver.getCurrentUrl();
		System.out.println(abc);
		String bcd = driver.getTitle();
		System.out.println(bcd);
		if (bcd.contains("Naukri")) {
			System.out.println("title is contains Naukri text");
		} else {
			System.out.println("Naukri text NOT displayed");

		}
		
		
		//close method will close the current browser window
		//driver.close();
		
		//to close current window and the child window also
		driver.quit();
		

	}
}
