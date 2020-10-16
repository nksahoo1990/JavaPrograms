package SeleniumWebdriverExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class justTest {

	@Test
	public void justForFun(){
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=vClaWaqvDIS71ATK3YLoDw&gws_rd=ssl");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement obj= driver.findElement(By.name("btnK"));
		if(obj.isDisplayed()==true){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		//String actualName=driver.findElement(By.name("btnK")).getText();
		//Assert.assertEquals(actualName, "Google Search");
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println("No of links present in the page" + ele.size());
		
		for(int i=0;i<ele.size();i++){
			System.out.println(ele.get(i).getText());
		}
		
		driver.quit();
	}
	
}
