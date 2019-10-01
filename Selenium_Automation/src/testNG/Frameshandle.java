package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frameshandle {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.toyota.co.uk/order-a-brochure");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='tgbgdpr-overlay-agree']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);

		driver.findElement(By.xpath("//div[text()='By Post']")).click();

	}
}
