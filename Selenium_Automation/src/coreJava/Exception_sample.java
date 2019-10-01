package coreJava;

public class Exception_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 90;
			int b = 0;
			System.out.println(a / b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
