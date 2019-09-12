
package coreJava;

public class DataTypesSample {

	public  void add() {
		int a = 90;
		int b = 80;
		int c = a + b;
		System.out.println(c);
	}
	
	public void sub()
	{
		System.out.println("fgadsgd");
	}
	public void sample() {
		byte a = 127;
		double b = 345346346.5487;
		boolean abg = false;
		char afsdf = 't';
		//selenium 
		
	}

	public static void main(String[] args) {
		System.out.println("Hi all");
		//add();

		//Non static methods are not allowed  to main method 
		
		//if you want call Non static methods to main method, you need to create a reference name
		//syntax for Reference creation of method
		//Classname ref = new classname();
		DataTypesSample obj = new DataTypesSample();
		obj.add();
		obj.sub();
		
	}

}
