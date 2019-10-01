package webdriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timestamp {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);//Fri Sep 13 12:45:22 EDT 2019

		//yyyy_MM_dd_HH_mm_ss
		DateFormat df = new SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		

	}

}
