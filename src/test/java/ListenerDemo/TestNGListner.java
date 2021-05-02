package ListenerDemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test cases started and details are: " + result.getName());
	  }
	public void onTestSuccess(ITestResult result) {
		 System.out.println("Test cases successfully executed " + result.getName());
	  }

	public void onTestFailure(ITestResult result) {
		 System.out.println("Test cases failed and its name is: " + result.getName());
	  }

	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test cases skipped and its name is:" + result.getName());
	  }

}
