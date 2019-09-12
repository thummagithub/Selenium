package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Fb_signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_US");
		
		driver.findElement(By.xpath("//*[text()='First name']")).sendKeys("veni");
//		driver.findElement(By.xpath("//input[@type='text']")).
		driver.findElement(By.xpath("//*[text()='Last name']")).sendKeys("vani");
		driver.findElement(By.xpath("//*[text()='Mobile number or email']")).sendKeys("veni22@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("veni2222");
		driver.findElement(By.id("month")).sendKeys("Mar");
		
	}

}
