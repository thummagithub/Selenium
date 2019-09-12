package webdriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

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

		Thread.sleep(5000);
		driver.findElement(By.id("listingtable_LinkButton3_2")).click();
		Thread.sleep(5000);
		// to click on OK button on Alert
		driver.switchTo().alert().accept();
		// to click on CANCLE button on ConfirmationAlert
		//driver.switchTo().alert().dismiss();
	}

}
