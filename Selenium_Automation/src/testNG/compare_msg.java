package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class compare_msg {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://forms.toyota.co.uk/brochure");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='tgbgdpr-overlay-agree']")).click();
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("submit-br"));
		jse.executeScript("arguments[0].scrollIntoView();", ele);

		Thread.sleep(7000);
		jse.executeScript("arguments[0].click();", ele);
		
		// validate with expected messages as below
		WebElement strvalue = driver.findElement(By.xpath("(//*[@class= 'error-message-tgb'])[4] "));
        String expected = "Title:Please select your title";
        String actual = strvalue.getText();
        System.out.println(expected);
        //System.out.println(actual);
        
        if(expected.equals(actual)){
            System.out.println("Pass");
        }
            else {
                System.out.println("Fail");
            }


  }
}
