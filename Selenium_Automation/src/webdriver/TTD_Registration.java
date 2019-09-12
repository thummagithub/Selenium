package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class TTD_Registration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		Thread.sleep(5000);
		driver.findElement(By.name("fName")).sendKeys("ram");
		driver.findElement(By.name("lName")).sendKeys("sam");
		driver.findElement(By.id("indiMobile")).sendKeys("9988998899");
		//DOB
		driver.findElement(By.id("regdob")).click();
		new Select(driver.findElement(By.xpath("//*[@title='Change the month']"))).selectByVisibleText("March");
		new Select(driver.findElement(By.xpath("//*[@title='Change the year']"))).selectByVisibleText("1999");
		driver.findElement(By.linkText("23")).click();
		
		driver.findElement(By.name("address1")).sendKeys("321 testway");
		driver.findElement(By.name("cityS")).sendKeys("hyderabad");
		driver.findElement(By.name("zipCode")).sendKeys("5000001"); 
		driver.findElement(By.name("countryS")).click();
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
		new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Andhra Pradesh");
		//new Select(driver.findElement(By.name("proofS"))).selectByVisibleText("Passport");
		new Select(driver.findElement(By.name("proofS"))).selectByIndex(4);
		driver.findElement(By.id("proofid")).sendKeys("D32456990"); 
		
		driver.findElement(By.name("emailId")).sendKeys("Ramya123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Tesing@123");
		driver.findElement(By.name("repassword")).sendKeys("Tesing@123");
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("regi_continue"));
		jse.executeScript("arguments[0].scrollIntoView();", ele);

		Thread.sleep(7000);
		jse.executeScript("arguments[0].click();", ele);
		}
	}


