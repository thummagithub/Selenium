package coreJava;

import java.util.Scanner;

public class TablesSample {
	public static void main(String[] args) {

		// 2 * 1 = 2
		System.out.println("Please enter table number**************");

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(a);
		
		for (int i = 1; i <=10; i++) {
			System.out.println(a + "*" + i + "=" + (a*i));
		}
		

	}

}
