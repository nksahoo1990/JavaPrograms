package MyPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class VerifyK2UX_StudentLogin {

	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new FirefoxDriver();
		
		Properties obj = new Properties();
		FileInputStream inputFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\RR.properties");
		obj.load(inputFile);
			
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		
		Utility test = new Utility();
		test.openBrowserUrl(driver, obj.getProperty("url"));
		test.loginReader(driver, "K2UX001", "testing123$");
		//Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("rr_Logo"))));
		
		 
		 WebElement bigRRlogo= driver.findElement(By.xpath(obj.getProperty("rr_Logo")));
		// WebElement geatBtn=driver.findElement(By.id("settingsBtn"));
	     WebElement book=driver.findElement(By.className("book-pearson"));
		
		Assert.assertTrue(bigRRlogo.isDisplayed(), "Realize Reader logo is not displayed");
		Assert.assertTrue(book.isDisplayed(), "Bookshelf page is not displayed");
		
		driver.findElement(By.className(obj.getProperty("avtarIcon"))).click();
	
		WebElement userMenu = driver.findElement(By.id("control-panel-menu"));
		List<WebElement> userMenuListItems = userMenu.findElements(By.tagName("li"));
		System.out.println("number of values :" + userMenuListItems.size());
		
		WebElement About =driver.findElement(By.xpath(".//*[@id='control-panel-menu']/li[2]/a"));
		WebElement signOut=driver.findElement(By.id("logoutButton"));
		
		Assert.assertTrue(About.isDisplayed(), "About link is not displayed");
		Assert.assertTrue(signOut.isDisplayed(), "Sign out link is not displayed");
		
		signOut.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
		Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed(), "Sign out un successful.");
		
		
		driver.quit();
		
		System.out.println("Test Case completed");

	}

}
