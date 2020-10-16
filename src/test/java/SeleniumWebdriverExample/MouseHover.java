package SeleniumWebdriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = driver.findElement(By.linkText("Product Category"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("iPads"))));
		action.moveToElement(driver.findElement(By.linkText("iPads"))).click().build().perform();
		//driver.quit();
	}

}
