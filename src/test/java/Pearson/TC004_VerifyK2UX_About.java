package Pearson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC004_VerifyK2UX_About {

	public static void main(String[] args) throws IOException {
		
		
        Properties obj = new Properties();
		FileInputStream inputFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\RR.properties");
		obj.load(inputFile);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
        System.out.println("Test case started");
		
		driver.get(obj.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id(obj.getProperty("username"))).sendKeys("K2UX001");
		driver.findElement(By.id(obj.getProperty("password"))).sendKeys("testing123$");
		driver.findElement(By.id(obj.getProperty("signIn"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("rr_Logo"))));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(obj.getProperty("avtarIcon"))));
		driver.findElement(By.className(obj.getProperty("avtarIcon"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("aboutLink"))));
		WebElement About =driver.findElement(By.xpath(obj.getProperty("aboutLink")));
		WebElement legalNotice =driver.findElement(By.xpath(obj.getProperty("legalNoticeLink")));
		WebElement privacy =driver.findElement(By.xpath(obj.getProperty("privacyPolicyLink")));
		WebElement support =driver.findElement(By.xpath(obj.getProperty("supportLink")));
		WebElement permission =driver.findElement(By.xpath(obj.getProperty("permissionsLink")));
		String parentWindow = driver.getWindowHandle();
		
		About.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("legalNoticeLink"))));
		legalNotice.click();
		
        Set<String> childWindow = driver.getWindowHandles();
		
		for(String newWindow :childWindow){
			
			if(!parentWindow.equals(newWindow))
			driver.switchTo().window(newWindow);
			
			String actualLegalNoticeTitle=driver.getTitle();
			String expectedLegalNoticeTitle="https://sso.rumba.pearsoncmg.com/sso/license/LicenseAgreement.html";
			System.out.println("Title is :" + actualLegalNoticeTitle);
			
			Assert.assertEquals(actualLegalNoticeTitle, expectedLegalNoticeTitle, "Correct legal notice url opened");
			driver.close();
			driver.switchTo().window(parentWindow);
			System.out.println(driver.getTitle());
			driver.close();
		}
		

		
	}

}
