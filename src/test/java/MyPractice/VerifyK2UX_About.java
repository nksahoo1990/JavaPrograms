package MyPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyK2UX_About {
    
	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Properties obj = new Properties();
		FileInputStream inputFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\RR.properties");
		obj.load(inputFile);
			
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		
		Utility test = new Utility();
		test.openBrowserUrl(driver, obj.getProperty("url"));
		test.loginReader(driver, "K2UX001", "testing123$");
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("rr_Logo"))));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(obj.getProperty("avtarIcon"))));
		driver.findElement(By.className(obj.getProperty("avtarIcon"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("aboutLink"))));
		WebElement About =driver.findElement(By.xpath(obj.getProperty("aboutLink")));
		WebElement legalNotice =driver.findElement(By.xpath(obj.getProperty("legalNoticeLink")));
		WebElement privacy =driver.findElement(By.xpath(obj.getProperty("privacyPolicyLink")));
		WebElement support =driver.findElement(By.xpath(obj.getProperty("supportLink")));
		WebElement permission =driver.findElement(By.xpath(obj.getProperty("permissionsLink")));
		
		About.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("legalNoticeLink"))));
		legalNotice.click();
		Thread.sleep(15000);
		
		test.switchWindow(driver, "https://sso.rumba.pearsoncmg.com/sso/license/LicenseAgreement.html");
		
		//test.closeBrowser(driver);
		
	}

}
