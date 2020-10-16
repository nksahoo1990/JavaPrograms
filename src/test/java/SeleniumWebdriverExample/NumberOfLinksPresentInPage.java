package SeleniumWebdriverExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NumberOfLinksPresentInPage {
	
	@Test
	public void countLinksInPage(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=dTxhV4T8Bo-D2QSfnqiADQ&gws_rd=ssl");
		
		List<WebElement> numberOflinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links present : " + numberOflinks.size());
		
		for(int i=0;i<numberOflinks.size();i++){
			System.out.println(numberOflinks.get(i).getText());
		}
		
		driver.quit();
		
	}

}
