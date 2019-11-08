package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Confirmalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

		//type url
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='CONTINUE TO LOGIN']")).click();
		Thread.sleep(5000);
		
		//click on login button
		driver.findElement(By.xpath("//*[@id='Button2']")).click();
		
		//alert will display
		//use wait statement
		
		//new Select(driver.findElement(By.xpath("//button[text()='Try it']")));
		//driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		driver.findElement(By.xpath("//*[@onclick='Warn();']")).click();
		driver.switchTo().alert().dismiss();
	}

}
