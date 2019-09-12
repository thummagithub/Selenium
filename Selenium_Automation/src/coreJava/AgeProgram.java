package coreJava;

import java.util.Scanner;

public class AgeProgram {
	public static void main(String[] args) {

		System.out.println("Please enter Age as integer**************");

		Scanner s = new Scanner(System.in);
		int age = s.nextInt();

//		0-2 infant
//		2-12 child
//		12-25 youth
//		25-59 adults
//		59-100 sr.citizen

		if (age >= 0 && age <= 2) {
			System.out.println("entered age comes under Infant*******");
		} else if(age>2 && age<=12) {
              System.out.println("entered age comes under Child");
		} else if(age>12 && age<=18) {
                  System.out.println("entered age comes under youth");     
		} else if(age>18 && age<=59) {
            System.out.println("entered age comes under adult");
		} else if(age>59 && age<=100) {
                System.out.println("entered age comes under Sr.citizen");
		} else {
			System.out.println("entered valid age");
		}
	}
	

}
