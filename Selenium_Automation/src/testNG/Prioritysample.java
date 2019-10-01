package testNG;

import org.testng.annotations.Test;

public class Prioritysample {
	@Test(priority = 1 )
	public void f() {
		System.out.println("f");
	}

	@Test(priority = 0 )
	public void a() {
		System.out.println("a");
	}

	@Test(priority = 2 )
	public void b() {
		System.out.println("b");
	}

}