package JavaPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creates object of date class
		Date d = new Date();
		// formats the date as we wish
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy ss:mm:hh");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
		
	}

}
