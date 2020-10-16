package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverTest {
	@Test
	public void openBrowser(){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=mg1QV6uAF5GE4AKnoK6IBw&gws_rd=ssl");
	
	}
	
	

}
