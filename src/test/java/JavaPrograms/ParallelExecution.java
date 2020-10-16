package JavaPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	
	// In parallel execution we need to set parallel='tests' in testng.xml
	
	WebDriver driver;
	String url = "https://www.google.com";
	
	@Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browserName){
		
	try{	
		
		if(browserName.equalsIgnoreCase("FF")){
			driver = new FirefoxDriver();
		} else if(browserName.equalsIgnoreCase("GC")){
			System.setProperty("webdriver.chrome.driver",
					"D:/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("IE")){
		
			System.setProperty("webdriver.ie.driver",
					"D:/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
	}catch(Exception e	){
		
		System.out.println(e.getMessage());
	}	
	}

	@Test
  public void testcaseOne(){
	
		driver.get(url);
		
  }

}


