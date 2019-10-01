package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jri_login {
	@Test
	public void f() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.justrechargeit.com/");
		driver.findElement(By.id("jriTop_signin9")).click();

		driver.findElement(By.id("txtUserName")).sendKeys("veniTesting@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");

		// enter captcha value int a; int b;

		System.out.println("Please enter Two valid int numbers");
	}
}
