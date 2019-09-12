package coreJava;

public class StringSample {
	public static void main(String[] args) {

		String abc = "       testing  ";

		String bcd;
		bcd = "Automation";

		System.out.println(bcd + abc);

		System.out.println(abc.length());

		char a = abc.charAt(4);
		System.out.println(a);

		System.out.println(abc.toUpperCase());
		System.out.println(bcd.toLowerCase());

		System.out.println(abc);
		System.out.println(abc.trim());

		String expectedValue = "Ramya";
		String actualVlue = "ramya";

		if (expectedValue.equalsIgnoreCase(actualVlue)) {
			System.out.println("Both the values are matching");

		} else {
			System.out.println("Both the values are NOT matching");
		}

		String b = "189";
		int d = Integer.parseInt(b);
		int c = 11;

		System.out.println(b + c);
		System.out.println(d + c);

		System.out.println(expectedValue.replace('a', 'u'));

	}

}
