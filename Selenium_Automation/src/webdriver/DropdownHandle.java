package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.fb.com");

		Select sel = new Select(driver.findElement(By.id("month")));
		sel.selectByVisibleText("Mar");
		Select s = new Select(driver.findElement(By.id("day")));
		s.selectByVisibleText("18");
		Select y = new Select(driver.findElement(By.id("year")));
		y.selectByVisibleText("2016");
	}

}
