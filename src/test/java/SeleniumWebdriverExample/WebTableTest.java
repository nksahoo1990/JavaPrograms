package SeleniumWebdriverExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTableTest {
	
	@Test
	public void webTableSampleTest() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitya Krushna Sahoo\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//identify number of rows present in table
		List<WebElement> tableRow=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		int rowCnt=tableRow.size();
		System.out.println("Number of rows present in table : " + rowCnt);
		
		//identify number of columns present in table
		List<WebElement> tableColData=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		int colCnt=tableColData.size();
		System.out.println("Number of columns present in table : " + colCnt);
		
		//
		
		for(int i=0;i<=tableColData.size();i++) {
			String str =tableColData.get(i).getText().trim();
			if(str.equalsIgnoreCase("HDIL")) {
				tableColData.get(i).click();
			}
		}
	}

}
