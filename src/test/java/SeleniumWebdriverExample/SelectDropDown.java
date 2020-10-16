package SeleniumWebdriverExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDown {
	@Test
	public void dropDownTest(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("D:\\Selenium Projects\\HTML Files\\DropDown.html");
		List<WebElement> numberOfoption = driver.findElements(By.tagName("option"));
		System.out.println("Number of options : " + numberOfoption.size());
		
		WebElement element = driver.findElement(By.xpath("html/body/select"));
		Select se = new Select(element);
		se.selectByVisibleText("Nokia");
		//se.selectByValue("2");
		//se.selectByIndex(3);
		
	}

}
