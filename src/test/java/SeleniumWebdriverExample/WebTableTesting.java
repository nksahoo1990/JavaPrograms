package SeleniumWebdriverExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebTableTesting {
	
	

	@Test
	public void testGmail() throws InterruptedException{
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	driver.findElement(By.id("Email")).sendKeys("samplecheckhptm");
	driver.findElement(By.id("next")).click();
	driver.findElement(By.id("Passwd")).sendKeys("reset@123");
	driver.findElement(By.id("signIn")).click();
	Thread.sleep(10000);
	if(driver.findElement(By.xpath("//div[text()='COMPOSE']")).isDisplayed()==true){
		System.out.println("Login Successful");
	}
	
	List<WebElement> inboxSub = driver.findElements(By.xpath(".//*[@id=':2u']//td"));
	
	for(int i=0;i<inboxSub.size();i++){
		String subjectName=inboxSub.get(i).getText();
		if(subjectName.equalsIgnoreCase("NItya Krushna")){
			String val =inboxSub.get(i).getAttribute("name");
			System.out.println(val);
		}
	}
	
	/*
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//span[@class='gb_8a gbii']")).click();
	driver.findElement(By.xpath(".//*[@id='gb_71']"));
	Thread.sleep(4000);
	driver.quit();
	*/
}
}