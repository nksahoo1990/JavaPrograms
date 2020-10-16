package fb.Common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver = new FirefoxDriver();
	public Properties obj=null;
	
	@BeforeMethod
	public void setApplication(){
		
		Reporter.log("***** Session Started*****");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Reporter.log("***** Browser Opened ******");
	}
	
	@BeforeMethod
	public void readPropertyFile() throws IOException{
		
		obj = new Properties();
		FileInputStream inputFile = new FileInputStream("D:\\Selenium Projects\\UserPractice\\UserPractice\\FB_OR.properties");
		obj.load(inputFile);
	}
	
	@AfterMethod
	public void closeApplication(){
		driver.quit();
		Reporter.log("**** Browser closed ******");
	}
}
