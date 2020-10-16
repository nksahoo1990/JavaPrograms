package SeleniumWebdriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class demo {
    @Test
	public void check(){
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	//driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("samplecheckhptm");
	driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("samplecheckhptm");;
	driver.findElement(By.xpath(".//*[@id='next']")).click();
	driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	System.out.println(driver.findElement(By.xpath(".//*[@id='errormsg_0_Passwd']")).getText());
	
	//driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("samplecheckhptm");
	}
}
