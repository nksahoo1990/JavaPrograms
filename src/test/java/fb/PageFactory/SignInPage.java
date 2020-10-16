package fb.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

	WebDriver driver;
	
	public SignInPage(WebDriver receivedDriver){
		this.driver=receivedDriver;
	}
	
	@FindBy(id="email")
	WebElement userName;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement login_button;
	
	public void loginToFB(String uId, String pwd){
		
		userName.sendKeys(uId);
		password.sendKeys(pwd);
		login_button.click();
	}
	
}
