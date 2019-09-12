package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class Shearcircle_signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.shearcircle.com/login");
		driver.findElement(By.id("username")).sendKeys("Ramya123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("dsram");
		driver.findElement(By.className("btn-blue")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.linkText("Join Now")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("firstname")).sendKeys("Ramya");
		driver.findElement(By.id("lastname")).sendKeys("sam");
	
		
		driver.findElement(By.id("uname")).sendKeys("Ramya123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("rock123");
		driver.findElement(By.name("cnf_password")).sendKeys("rock123");
		Thread.sleep(5000);
		//xpath for billing agreement
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
//		driver.findElement(By.xpath("//input[@type='text'][@']")).click();
		
//		driver.findElement(By.xpath("//*[text()='Billing Agreement'][1]")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("(//*[text()='Join Now'])[2]"));
		jse.executeScript("arguments[0].scrollIntoView();", ele);

		Thread.sleep(5000);
		jse.executeScript("arguments[0].click();", ele);
	}
}