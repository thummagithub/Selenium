package webdriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jri_addnumbers {

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
		driver.findElement(By.className("addMobileLink")).click();
		driver.findElement(By.className("radius tooltip_mainbox")).click();
		driver.findElement(By.id("lblpopMobileCaption")).sendKeys("9988998899");
		driver.findElement(By.id("lblpopMobileSPCaption")).click();
		new Select(driver.findElement(By.id("ddlpopMobileSP"))).selectByVisibleText("AIRTEL");
		driver.findElement(By.id("lblpopMobileNicknameCaption")).sendKeys("mike");
		driver.findElement(By.id("btnPopupAddMobile")).click();
	}

}
