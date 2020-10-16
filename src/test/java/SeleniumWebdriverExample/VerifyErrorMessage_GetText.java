package SeleniumWebdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessage_GetText {
	@Test
	public void verifyErrorMessage() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		String actualErrorMessage = driver.findElement(By.id("eLogin_err")).getText();
		String expectedErroMessage = "Please enter your Email ID";
		
		Assert.assertEquals(actualErrorMessage, expectedErroMessage);
		
	}
		

}
