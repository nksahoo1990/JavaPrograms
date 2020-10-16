package SeleniumWebdriverExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleChromeTest {
	
	// first we need to download third party browser driver for chrome. 
	
	@Test
	public void GCTest(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitya Krushna Sahoo\\Selenium Stuff\\Browser Standalone\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=jU5SV6z1JqXv8weszqSgDQ&gws_rd=ssl");
		
	}

}

