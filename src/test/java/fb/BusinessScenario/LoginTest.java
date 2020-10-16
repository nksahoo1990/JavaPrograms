package fb.BusinessScenario;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import fb.Common.BaseClass;

public class LoginTest extends BaseClass{
	
	@Test
	public void LoginToApplication(){
		
		driver.findElement(By.id(obj.getProperty("userName"))).sendKeys("nit.krish4444@gmail.com");
		driver.findElement(By.id(obj.getProperty("password"))).sendKeys("nabinsurekha");
		driver.findElement(By.id(obj.getProperty("loginBtn"))).click();
		Reporter.log("Logged in to Facebook :) ");
	}

}
