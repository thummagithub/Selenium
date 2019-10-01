package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Volunteerregistration_TTD {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://hdpp.ttdsevaonline.com/Registration/VolunteerRegistration");
		Thread.sleep(5000);
		driver.manage().window().maximize();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("btnSubmit"));
		jse.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].click();", ele);

		String name = driver.findElement(By.xpath("(//*[@class='field-validation-error'])[1]")).getText();
		System.out.println(name);
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[2]")).getText();
		System.out.println("Please enter surname");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[3]")).getText();
		System.out.println("Please select gender");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[4]")).getText();
		System.out.println("Please enter valid date of birth");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[5]")).getText();
		System.out.println("Please select occupation category");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[6]")).getText();
		System.out.println("Please select education category");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[7]")).getText();
		System.out.println("Please enter house or ward number");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[8]")).getText();
		System.out.println("Please enter municipality or city");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[9]")).getText();
		System.out.println("Please select state value");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[10]")).getText();
		System.out.println("Please enter valid PIN Code");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[11]")).getText();
		System.out.println("Please enter valid mobile number");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[12]")).getText();
		System.out.println("Please select experience choice");
		driver.findElement(By.xpath("(//*[@class='field-validation-error'])[13]")).getText();
		System.out.println("Please accept terms and conditions");

		driver.navigate().refresh();

		driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("vani");
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("venga");
		driver.findElement(By.xpath("(//*[@type='radio'])[2]")).click();
		// DOB
		driver.findElement(By.xpath("//*[@type='button']")).click();
		new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"))).selectByVisibleText("Aug");
		new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"))).selectByVisibleText("2013");
		driver.findElement(By.linkText("25")).click();

		new Select(driver.findElement(By.name("Occupation"))).selectByVisibleText("Home Maker");
		new Select(driver.findElement(By.name("EducationCategory"))).selectByVisibleText("Graduation and above");
		driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("Graduation");
		// address
		driver.findElement(By.xpath("//*[@id='Address1']")).sendKeys("3112 wheatonway");
		driver.findElement(By.xpath("//*[@id='Address2']")).sendKeys("Karimnagar");
		new Select(driver.findElement(By.xpath("//*[@name='State']"))).selectByVisibleText("Telangana");
//		new Select(driver.findElement(By.xpath("//*[@name='District']"))).selectByVisibleText("Bhupalapalli");
		driver.findElement(By.xpath("//*[@id='txtpinnumber']")).sendKeys("506001");
		driver.findElement(By.xpath("//*[@id='txtMobileNum']")).sendKeys("9988998899");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("vani25@gmail.com");
		driver.findElement(By.xpath("//*[@id='txtProofNum']")).sendKeys("008899221133");
		driver.findElement(By.xpath("(//*[@type='radio'])[4]")).click();

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		WebElement ele1 = driver.findElement(By.id("btnSubmit"));
		jse1.executeScript("arguments[0].scrollIntoView();", ele1);
		Thread.sleep(3000);
		jse1.executeScript("arguments[0].click();", ele1);

	}
}
