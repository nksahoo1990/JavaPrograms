package SeleniumWebdriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Frames {
	
	@Test
	public void handleFrames(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/iframe-practice-page/");

		//Switch by frame name. we can switch to frame by name or id or index
		
		//driver.switchTo().frame("1");
		//driver.switchTo().frame("name");
		
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys("aa");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='main-nav']/li[2]/a/span")).click();
		driver.quit();
		
	}

}
