package SeleniumWebdriverExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class log4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here we need to create logger instance so we need to pass Class name for 
	     //which  we want to create log file in my case Google is classname
	         Logger logger=Logger.getLogger("log4j");
	        
	 
	       // configure log4j properties file
	       PropertyConfigurator.configure("Log4j.properties");
	 
		
		WebDriver driver = new FirefoxDriver();
		logger.info("Browser Opened");
		
		
		driver.get("https://www.google.com");
		logger.info("Navigated to Google");
		
		driver.quit();
		logger.info("Browser closed");
		
	}

}
