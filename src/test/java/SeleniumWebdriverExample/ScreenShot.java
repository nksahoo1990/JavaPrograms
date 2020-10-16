package SeleniumWebdriverExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

// TakesScreenShots is an interface and getScreenshotAs is a method.

public class ScreenShot {

	@Test
	public void tekeScreenshot() throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.findElement(By.xpath(".//*[@id='hplogo']")).click();
	TakesScreenshot screenShot = (TakesScreenshot)driver;
	File src = screenShot.getScreenshotAs(OutputType.FILE);	
	FileUtils.copyFile(src, new File("./ScreenShot/google.png"));
	
	
	}
	
}
