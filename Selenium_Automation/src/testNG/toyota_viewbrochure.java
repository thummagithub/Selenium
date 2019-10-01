package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class toyota_viewbrochure {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://forms.toyota.co.uk/brochure");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='tgbgdpr-overlay-agree']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='inner10'])[2]")).click();

		driver.findElement(By.xpath("(//div[@class='car_image'])[11]")).click();

		String msg = "GT86";
		String actualmsg = driver.findElement(By.xpath("//input[@id='brochure_gt86']")).getText();
		System.out.println(msg);
		System.out.println(actualmsg);
		if (msg.equals(actualmsg)) {
			System.out.println("both the msgs are equal");
		} else {
			System.out.println("both the msgs are equal");
		}

		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("view-br"));
		jse.executeScript("arguments[0].scrollIntoView();", ele);

		Thread.sleep(5000);
		jse.executeScript("arguments[0].click();", ele);

		Thread.sleep(7000);

		driver.findElement(By.xpath("//*[@class='t1-form t1-form-brochure chrome']")).click();

		while (driver.findElements(By.xpath("//*[@id='btnMore']/img")).size() == 0) {
			Thread.sleep(2000);
			System.out.println("Wiat for element*******");
			int i = 0;
			if (i > 10) {
				break;
			}
		}

		WebElement ele1 = driver.findElement(By.xpath("//*[@id='btnMore']/img")); // *[@id="btnMore"]/img
		jse.executeScript("arguments[0].scrollIntoView();", ele1);

		driver.findElement(By.xpath("//div[@id='moreBtnDownload']")).click();

	}

}
