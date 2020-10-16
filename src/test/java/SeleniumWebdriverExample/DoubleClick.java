package SeleniumWebdriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {
	
    @Test
	public void doubleClick(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/intl/en/mail/help/about.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("gmail-sign-in"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).doubleClick().build().perform();
		
	}
	
}
