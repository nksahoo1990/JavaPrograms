package SeleniumWebdriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitAndExplicitWait {
	@Test
	public void implicitExplicitWait(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
		//page load timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		// Implicit wait 
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("next")));
		//WebElement isElementPresent = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("next")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("next")));
		
		//System.out.println("Element id is : "+  isElementPresent);
	}

}
