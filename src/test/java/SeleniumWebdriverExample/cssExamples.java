package SeleniumWebdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		String str =driver.findElement(By.cssSelector("input#btnK")).getText();
		System.out.println(str);
		
	}

}
