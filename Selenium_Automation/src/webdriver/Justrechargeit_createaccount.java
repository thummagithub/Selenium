package webdriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justrechargeit_createaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.justrechargeit.com/");
		
		//create account
		
		driver.findElement(By.id("signup-link9")).click();

		driver.findElement(By.id("signup_name")).sendKeys("Veni");
		driver.findElement(By.id("signup_mobileno")).sendKeys("9955987999");
		driver.findElement(By.id("signup_email")).sendKeys("veniTesting@gmail.com");
		driver.findElement(By.id("signup_password")).sendKeys("123456");
		
//		driver.findElement(By.id("checkbox1")).click();

//		driver.findElement(By.id("checkbox")).click();
		//xpath for checkbox
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		driver.findElement(By.id("imgbtnSubmit")).click();
		

		driver.findElement(By.id("jriTop_signOut")).click();
		Thread.sleep(3000);

	
		 	driver.close();
		}
}