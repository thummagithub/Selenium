package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail_Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver",".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mail.com/");
		driver.findElement(By.id("signup-button")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@class='pos-input-radio__border']")).click();
		driver.findElement(By.id("//input[@id='d0f18dc6-4a5c-432b-9ed0-a6dc8c66e5dc']")).sendKeys("vani");
		driver.findElement(By.id("//input[@id='9a412129-4411-4830-91d8-16b557e9b96b']")).sendKeys("test");
		
		
		
		
		

	}

}
