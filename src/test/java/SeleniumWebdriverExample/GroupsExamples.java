package SeleniumWebdriverExample;

import org.testng.annotations.Test;

public class GroupsExamples {

	//refer tentNg.xml file for grouping
	
	@Test(groups="Regression")
	public void testCaseOne(){
		System.out.println("This is regresion test");
	}
	
	@Test(groups="Smoke")
	public void testCaseTwo(){
		System.out.println("This is Smoke test");
	}
	
	@Test(groups="Regression")
	public void testCaseThree(){
		System.out.println("This is regresion test");
	}
	
	@Test(groups="Smoke")
	public void testCaseFour(){
		System.out.println("This is Smoke test");
	}
	
	@Test(groups="Database")
	public void testCaseFive(){
		System.out.println("This is database test");
	}
	
	
}
