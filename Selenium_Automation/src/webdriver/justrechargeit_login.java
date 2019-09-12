package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justrechargeit_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("test123@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("rough");
		driver.findElement(By.id("imgbtnSignin")).click();

}
}
