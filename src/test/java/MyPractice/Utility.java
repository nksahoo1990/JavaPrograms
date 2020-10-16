package MyPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Utility {

	WebDriver driver;
	String parentWindow;
	
	public void openBrowserUrl(WebDriver driver,String url){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\chromedriver_win32\\chromedriver.exe");
		this.driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Browser opened");
		
	}
	
	public void loginReader(WebDriver driver,String uName, String pwd){
		
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("sign_in")).click();
		//String parentWindow = driver.getWindowHandle();
	}
	
	public void switchWindow(WebDriver driver,String expectedTitle){
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("legalNoticeLink"))));
		
       Set<String> childWindow = driver.getWindowHandles();
		
		for(String newWindow :childWindow){
			
			if(!parentWindow.equals(newWindow))
			driver.switchTo().window(newWindow);
			
			String actualLegalNoticeTitle=driver.getTitle();
			String expectedLegalNoticeTitle=expectedTitle;
			Assert.assertEquals(actualLegalNoticeTitle, expectedLegalNoticeTitle, "Title Mismatch");
			System.out.println("Title is :" + actualLegalNoticeTitle);
	}
	}
	
	public void closeBrowser(WebDriver driver){
		driver.quit();
		System.out.println("Browser closed");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
