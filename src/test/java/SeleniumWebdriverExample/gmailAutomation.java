package SeleniumWebdriverExample;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("This is parent window" + parentWindow);
	
		driver.findElement(By.id("identifierId")).sendKeys("Pabana");
		driver.findElement(By.id("identifierNext")).click();
		
		//Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Sikha");
		driver.findElement(By.id("passwordNext")).click();
		
		List<WebElement> allMail = driver.findElements(By.xpath("//table[@id=':30']//td"));
		
		System.out.println("Number of data"+ allMail);
		
		for(WebElement ele: allMail){
			
			String inbox=ele.getText();
			if(inbox.contains("GoogleTest")){
				ele.click();
				break;
			}
		}
	
		driver.findElement(By.xpath("//a[contains(text(),'google.co.in')]")).click();
		
		Set<String> childWindow = driver.getWindowHandles();
		
         for(String obj :childWindow){
			
			if(!parentWindow.equals(obj))
			
			driver.switchTo().window(obj);
			System.out.println("New Window Title is"+driver.getTitle());
			
			
		}
	}

}
