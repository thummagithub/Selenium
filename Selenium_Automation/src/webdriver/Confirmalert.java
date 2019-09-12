package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Confirmalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

		//driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		driver.get("https://www.tutorialspoint.com/javascript/javascript_dialog_boxes.htm");
		//new Select(driver.findElement(By.xpath("//button[text()='Try it']")));
		//driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		driver.findElement(By.xpath("//*[@onclick='Warn();']")).click();
		driver.switchTo().alert().dismiss();
	}

}
