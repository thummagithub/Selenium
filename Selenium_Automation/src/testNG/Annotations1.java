package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotations1 {
  @Test
  public void f() {
	  System.out.println(" @Test");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println(" @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" @AfterClass");
  }
  @Test
  public void v() {
	  System.out.println(" @Test v");
  }
}

//text in console

//String firstname = driver.findElement(By.xpath("(//*[@class='field-validation-error'])[1]")).getText();
//System.out.println("Please enter valid name");

//if (firstname.equals("Please enter valid name")) {
//    System.out.println("Error displayed: Please enter valid name");
//    
//} else {
//    System.out.println("Accepted");
//}