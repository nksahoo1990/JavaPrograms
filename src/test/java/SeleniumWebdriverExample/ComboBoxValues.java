package SeleniumWebdriverExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ComboBoxValues {
	
	@Test
	public void getComboboxValues(){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebElement combo = driver.findElement(By.id("month"));
	List<WebElement> ele = combo.findElements(By.tagName("option"));
	System.out.println(ele.size());
	for(int i=0;i<ele.size();i++){
		
		System.out.println(ele.get(i).getText());
	}
	}

}
