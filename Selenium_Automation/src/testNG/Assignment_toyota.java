package testNG;

import static org.testng.Assert.assertEquals;

import javax.security.auth.Refreshable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_toyota {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		// open URL
		driver.navigate().to("https://forms.toyota.co.uk/brochure");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		// close the alert
		driver.findElement(By.xpath("//*[@id='tgbgdpr-overlay-agree']")).click();

		// click on By email
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='inner10'])[1]")).click();

		// Select the car and get the name of secelted car
		driver.findElement(By.xpath("(//div[@class='car_image'])[10]")).click();
		System.out.println("GT86");

		// without fill any details click on submit button

		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("submit-br"));
		jse.executeScript("arguments[0].scrollIntoView();", ele);

		Thread.sleep(7000);
		jse.executeScript("arguments[0].click();", ele);

		// get the validation messages of all the mandatory elements and print into
		// console

		String title = driver.findElement(By.xpath("//*[text()='Please select your title']")).getText();
		System.out.println(title);
		String Firstname = driver.findElement(By.xpath("//*[text()='Please enter your first name']")).getText();
		System.out.println(Firstname);
		String surname = driver.findElement(By.xpath("//*[text()='Please enter your surname']")).getText();
		System.out.println(surname);
		String email = driver.findElement(By.xpath("(//*[@class='error-message-required'])[3]")).getText();
		System.out.println(email);

		// validate with expected messages as below
		String t = driver.findElement(By.xpath("//*[text()='Please select your title']")).getText();
		System.out.println(("Title :" + t));
		String fn = driver.findElement(By.xpath("//*[text()='Please enter your first name']")).getText();
		System.out.println(("Firstname :" + fn));
		String sn = driver.findElement(By.xpath("//*[text()='Please enter your surname']")).getText();
		System.out.println(("Surname:" + sn));
		String em = driver.findElement(By.xpath("(//*[@class='error-message-required'])[3]")).getText();
		System.out.println(("Email :" + em));

		
	

	// Enter invalid data (Firstname,surname,email) and click on submit button
	driver.navigate().refresh();

	driver.findElement(By.xpath("//a[@class='dropdown-toggle  ']")).click();

	driver.findElement(By.xpath("//*[@data-value='Miss']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("132312j3h");
	driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("4q4rnbm");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hafghafahfkj");

	// validate with expected messages as below

	// clear entered invalid data and entered valid inpput

	WebElement element = driver.findElement(By.xpath("//a[@class='dropdown-toggle  ']"));

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",element);
	Thread.sleep(5000);
	jse.executeScript("arguments[0].click();",element);

	driver.findElement(By.xpath("//*[@data-value='Miss']")).click();
	Thread.sleep(3000);driver.findElement(By.xpath("//input[@name='firstname']")).clear();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("veni");
	driver.findElement(By.xpath("//input[@name='surname']")).clear();
	driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("test");
	driver.findElement(By.xpath("//input[@name='email']")).clear();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("veni123@gmail.com");

	// click on submit and check any validation messages displayed or not?

}

}
