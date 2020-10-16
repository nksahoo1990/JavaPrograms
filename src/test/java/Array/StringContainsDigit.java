package Array;

import java.util.regex.Pattern;

public class StringContainsDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern patter = Pattern.compile(".*[^0-9]*.");
		
		String[] inputs= {"1234","abc123","-123"};
		
		for(String str:inputs){
			System.out.println("Does string " + str + "is a number" + !patter.matcher(str).matches());
		}
	}

}
