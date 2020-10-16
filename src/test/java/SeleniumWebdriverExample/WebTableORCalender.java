package SeleniumWebdriverExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTableORCalender {

	
	 @Test
	  public void handleTableOrCalender() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/span")).click();
		Thread.sleep(4000);
		
		List<WebElement> datePicker =driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table//td"));
		
		for(int i=0;i<datePicker.size();i++){
			String dateValue =datePicker.get(i).getText();
			
			if(dateValue.equalsIgnoreCase("30")){
				datePicker.get(i).click();
				break;
			}
			
			
		}
		
	}
	
	
	
}
