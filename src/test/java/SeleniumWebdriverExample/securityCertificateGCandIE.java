package SeleniumWebdriverExample;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class securityCertificateGCandIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for chrome
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		// for ie
		DesiredCapabilities cap1 = new DesiredCapabilities().internetExplorer();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
	}
	

}
