package SeleniumWebdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleMultipleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("D:\\Selenium Projects\\AlertGeneratingText.html");
		driver.findElement(By.xpath("html/body/fieldset/button")).click();
		
		
	}
	
	// Method always written outside Main function
	
	public void isAlertExist(){
		try{
		WebDriver driver = null;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		org.openqa.selenium.Alert al =wait.until(ExpectedConditions.alertIsPresent());
		/*wait.until(ExpectedConditions.alertIsPresent());
		org.openqa.selenium.Alert al =  driver.switchTo().alert();
		al.accept();*/
		} catch(Exception e){
			
		}
		
	}

	

}
