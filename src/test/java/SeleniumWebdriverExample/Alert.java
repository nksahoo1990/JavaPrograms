package SeleniumWebdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Alert {
	
	@Test
	public void handleAlert() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("D:\\Selenium Projects\\AlertGeneratingText.html");
		driver.findElement(By.xpath("html/body/fieldset/button")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
		driver.close();
		
	}

}
