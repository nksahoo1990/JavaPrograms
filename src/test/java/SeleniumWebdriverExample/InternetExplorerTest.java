package SeleniumWebdriverExample;


import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class InternetExplorerTest {

	
	@Test
	public void IETest(){
		
		System.setProperty("webdriver.ie.driver", "D:\\Software 32 bit\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=jU5SV6z1JqXv8weszqSgDQ&gws_rd=ssl");
		
	}
	
}
