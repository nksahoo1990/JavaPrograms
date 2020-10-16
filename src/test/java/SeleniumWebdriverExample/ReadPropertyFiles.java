package SeleniumWebdriverExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadPropertyFiles {

	WebDriver driver = new FirefoxDriver();
	
	@BeforeMethod
	public void openBrowser(){
		
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");
	}
	
	@BeforeMethod
	public void closeBrowser(){
		//driver.quit();
	}
	
	@Test
	public void calculator_Opertaion() throws IOException{
		
		//Create Object of Properties Class.
		Properties obj = new Properties();
		
		//Create Object of FileInputStream Class. Pass file path.
		FileInputStream inputFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\object.properties");
		
		//Pass object reference objfile to load method of Properties object.
		obj.load(inputFile);
		
		driver.findElement(By.id(obj.getProperty("eight"))).click();
		  driver.findElement(By.id(obj.getProperty("plus"))).click();
		  driver.findElement(By.id(obj.getProperty("four"))).click();
		  driver.findElement(By.id(obj.getProperty("equalsto"))).click();
	}
	
}
