package fb.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_PageFactory {

	static WebDriver driver;
	
	public static WebDriver setupApplication(String browser,String url){
		
		if(browser.equalsIgnoreCase("firefox")){
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		
		driver.get(url);
		return driver;
		
	}
}
