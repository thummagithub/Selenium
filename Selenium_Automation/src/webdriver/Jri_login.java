package webdriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Jri_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.justrechargeit.com/");
		driver.findElement(By.id("jriTop_signin9")).click();

		driver.findElement(By.id("txtUserName")).sendKeys("veniTesting@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");

		// enter captcha value int a; int b;

		System.out.println("Please enter Two valid int numbers");

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		System.out.println(Integer.toString(a));
		Thread.sleep(5000);
		driver.findElement(By.id("txtCaptcha")).sendKeys(Integer.toString(a));

		driver.findElement(By.id("imgbtnSignin")).click();

		//driver.findElement(By.id("jriTop_signOut")).click();
		Thread.sleep(3000);
		
//		driver.getCurrentUrl();
//		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(	driver.getTitle());
		//driver.close();
	}

}
