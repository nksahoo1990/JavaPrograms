package SeleniumWebdriverExample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindows {
	
	@Test
	public void handleMultipleWindow(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking");
		String parentWindow = driver.getWindowHandle();
		System.out.println("This is parent window" + parentWindow);
		driver.findElement(By.className("loginetbank")).click();
		driver.findElement(By.id("netbanking")).click();
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> childWindow = driver.getWindowHandles();
		
		for(String obj :childWindow){
			
			if(!parentWindow.equals(obj))
			
			driver.switchTo().window(obj);
			System.out.println(driver.getTitle());
			
			
			//driver.findElement(By.id("banner-button")).click();
		}
		
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.close();
	}
	

}
