package testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_surname {

	@Test
	public void f() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		// open URL
		driver.navigate().to("https://forms.toyota.co.uk/brochure");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		// close the alert
		driver.findElement(By.xpath("//*[@id='tgbgdpr-overlay-agree']")).click();

		// click on By email
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='inner10'])[1]")).click();

		driver.findElement(By.xpath("//a[@class='dropdown-toggle  ']")).click();

		driver.findElement(By.xpath("//*[@data-value='Miss']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Veni");

		String value = "GT86MrsVenichr";
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("//input[@name='surname']"));
		jse.executeScript("arguments[0].value=arguments[1];", element, value);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("veni123@gmail.com");

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("submit-br"));
		js.executeScript("arguments[0].scrollIntoView();", ele);

		Thread.sleep(7000);
		js.executeScript("arguments[0].click();", ele);
		
		
	}		
}