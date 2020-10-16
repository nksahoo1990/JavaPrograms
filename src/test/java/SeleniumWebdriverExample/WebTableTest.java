package SeleniumWebdriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTableTest {
	
	@Test
	public void webTableSampleTest() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://demo.borland.com/gmopost/");
		driver.findElement(By.xpath(".//*[contains(text(),'Enter GMO OnLine')]")).click();
		//driver.findElement(By.id("txtStationTo")).sendKeys("Secunderabad Jn");
		
		//Thread.sleep(5000);
		
		//driver.findElement(arg0)
		
	}

}
