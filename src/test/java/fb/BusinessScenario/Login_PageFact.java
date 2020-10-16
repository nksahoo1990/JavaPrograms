package fb.BusinessScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import fb.Common.Browser_PageFactory;
import fb.PageFactory.SignInPage;

public class Login_PageFact {

	@Test
	public void LoginToApp(){
		
		// below line return WebDriver 
		// PageFactory is a class
		WebDriver driver =Browser_PageFactory.setupApplication("firefox", "https://www.facebook.com/");
		
		// INITIALIZE SIGN IN PAGE .
		// .class is a binary. it will return the byte code
		SignInPage signIn_Page=PageFactory.initElements(driver, SignInPage.class);
		signIn_Page.loginToFB("nit.krish4444@gmail.com", "nabinsurekha");
	}
}
