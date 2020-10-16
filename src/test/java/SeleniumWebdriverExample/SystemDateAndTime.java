package SeleniumWebdriverExample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SystemDateAndTime {
	
	public static void main(String[] args) {
	// Create object of SimpleDateFormat class and decide the format
	 DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy ");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String todayDate= dateFormat.format(date);
	 
	 // Print the Date
	 System.out.println(todayDate);
	 
	 DateFormat dateTimeFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	 
	 //get current date time with Date()
	 Date dateTime = new Date();
	 
	 // Now format the date
	 String TodayDateTime= dateTimeFormat.format(dateTime);
	 
	 // Print the Date
	 System.out.println("Current date and time is " +TodayDateTime);
	

}
}