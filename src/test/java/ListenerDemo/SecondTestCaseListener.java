package ListenerDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerDemo.TestNGListner.class)
public class SecondTestCaseListener {


	@Test
	public void googleVerifySecondTC() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitya Krushna Sahoo\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void testFailMessageSecondTC() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitya Krushna Sahoo\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Yahoo");
		driver.quit();
	}
}
