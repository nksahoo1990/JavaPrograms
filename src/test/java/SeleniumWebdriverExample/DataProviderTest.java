package SeleniumWebdriverExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	//plzz refer dataprovider video for more details.
	
	//here row represents the number of times you call the test and column represents numbr of arguments.
	
	@DataProvider(name="data")
	public Object[][] getdata(){
		
		Object [][] obj = null;
		obj = new Object[2][2];
		
		obj[0][0]= "Ram";
		obj[0][1] = 1;
		
		obj[1][0]= "Krushna";
		obj[1][1] = 2;
		
		return obj;
		
	}
	

	@Test(dataProvider="data")
	public void testCaseOne(String a, Integer b){
		
		System.out.println("arguement  : " + a + "argument :" + b);

	}

}
