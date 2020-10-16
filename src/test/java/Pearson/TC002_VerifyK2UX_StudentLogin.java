package Pearson;

import java.util.List;
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

public class TC002_VerifyK2UX_StudentLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Test case started");
		
		driver.get("https://nightly-reader.realizedev.com/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("K2UX001");
		driver.findElement(By.id("password")).sendKeys("testing123$");
		driver.findElement(By.id("sign_in")).click();
		
		//Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='big_logo']")));
		
		 
		 WebElement bigRRlogo= driver.findElement(By.xpath("//div[@class='big_logo']"));
		// WebElement geatBtn=driver.findElement(By.id("settingsBtn"));
	     WebElement book=driver.findElement(By.className("book-pearson"));
		
		Assert.assertTrue(bigRRlogo.isDisplayed(), "Realize Reader logo is not displayed");
		Assert.assertTrue(book.isDisplayed(), "Bookshelf page is not displayed");
		
		driver.findElement(By.className("avatar-div")).click();
	
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
