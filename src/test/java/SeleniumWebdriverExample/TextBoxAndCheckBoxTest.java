package SeleniumWebdriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TextBoxAndCheckBoxTest {
	
	@Test
	public void textBoxCheckBox(){
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		driver.findElement(By.id("Email")).sendKeys("iamnityakrushna");
		driver.findElement(By.id("next")).click();
		boolean checkStatus = driver.findElement(By.id("PersistentCookie")).isSelected();
		if(checkStatus == true){
			driver.findElement(By.id("PersistentCookie")).click();	
		}
	}

}
