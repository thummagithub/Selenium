package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Jri_Retesting {
  @Test(dataProvider = "ramya")
  public void f(Integer n, String s) {
	  System.out.println(n);
	  System.out.println(s);
  }

  @DataProvider
  public Object[][] ramya() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
