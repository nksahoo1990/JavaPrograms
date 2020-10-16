package SeleniumWebdriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip {

	@Test
	public void toolTip(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		driver.findElement(By.xpath(".//*[@id='GmailAddress']")).click();
		 Actions action = new Actions (driver);
		WebElement toolTipText =driver.findElement(By.xpath("html/body/div[3]"));
		action.moveToElement(toolTipText).perform();
		String toolTipMessage = toolTipText.getText();
		System.out.println(toolTipMessage);
	}

}
