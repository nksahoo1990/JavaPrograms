package JavaPrograms;

import java.util.HashSet;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabccddiif";
		// Convert to char array
		char[] charArr=str.toCharArray();
		// create a hashSet bcz set contains unique elements only.
		HashSet<Character> chSet = new HashSet<Character>();
		//adding values to character set
		for(Character c:charArr) {
			chSet.add(c);
		}
		
		// string builder allows to append string
		StringBuilder sb = new StringBuilder();
		for(Character ch:chSet) {
			sb.append(ch);
		}
		System.out.println("String is : " + sb);
	}

}
