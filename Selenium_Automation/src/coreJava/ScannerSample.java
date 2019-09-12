package coreJava;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		
		int a ;//= 90;
		int b ;// = 80;
		
		System.out.println("Please enter Two valid int numbers**************");
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
				
		int c = a+b;
		System.out.println(c);
		
	}

}
