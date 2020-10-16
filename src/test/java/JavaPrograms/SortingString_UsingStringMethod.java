package JavaPrograms;

import java.util.Arrays;

public class SortingString_UsingStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "mnbvc";
		
		char[] charArr = a.toCharArray();
		
		Arrays.sort(charArr);
		
		String sorted= new String(charArr);
		System.out.println(sorted);

	}

}
