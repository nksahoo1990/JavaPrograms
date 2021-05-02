package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "anukulchandra";
		char[] chararr=str.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char c:chararr) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		
		
		
		
		
	}

}
