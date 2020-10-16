package SeleniumWebdriverExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SecurityCertificate {
	
	@Test
	public void handleCertificate()
	{
	
		// we need to create an object of desired capabilities. it allows to handle certificate.
		
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver = new FirefoxDriver(cap);
		driver.get("https://tv.eurosport.com/"); */
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("https://tv.eurosport.com/");
		
		
		
		
	}

}
