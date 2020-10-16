package SeleniumWebdriverExample;

public class StringToIntegerConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="100";
		String y = "100";
		
		System.out.println("Before conversion values are : = " + x + " " + y);
		
		int i = Integer.parseInt(x);
		int j = Integer.parseInt(y);
		
		int k=i+j;
		
		System.out.println("after conversion value is = " + k);
		
		System.out.println("Now Integer to string conversion");

		String d = String.valueOf(i);
		String e = String.valueOf(k);
		
		String z= d + " " + e;
		
		System.out.println("After conversion from Interger to string value is = " + " " + z);
	}

}
