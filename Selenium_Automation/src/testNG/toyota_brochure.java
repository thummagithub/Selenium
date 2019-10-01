package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class toyota_brochure {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://forms.toyota.co.uk/brochure");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='tgbgdpr-overlay-agree']")).click();
//		driver.switchTo().alert().dismiss();

		// check radio button
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='inner10'])[3]")).click();

		driver.findElement(By.xpath("(//div[@class='car_image'])[12]")).click();

		// details

		driver.findElement(By.xpath("//a[@class='dropdown-toggle  ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-value='Miss']")).click();
		

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("veni");
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("veni123@gmail.com");
		driver.findElement(By.xpath("//input[@name='home_tel']")).sendKeys("9988998899");

		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("submit-br"));
		jse.executeScript("arguments[0].scrollIntoView();", ele);

		Thread.sleep(7000);
		jse.executeScript("arguments[0].click();", ele);

		String msg = "Please enter your house name or number";
		String actualmsg = driver.findElement(By.xpath("(//p[@class='error-message-required'])[4]")).getText();
		System.out.println(msg);
		System.out.println(actualmsg);
		if (msg.equals(actualmsg)) {
			System.out.println("both the msgs are equal");
		} else {
			System.out.println("both the msgs are equal");
		}
		

	}
}
