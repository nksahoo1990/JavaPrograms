package JavaPrograms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabbc";
		
		char[] charArr= str.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(Character ch: charArr){
			
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}else{
				map.put(ch, 1);
			}
		}
		
		Set<Character> keys= map.keySet();
		
		for(Character ch: keys){
			if(map.get(ch)>1){
				System.out.println("character " + ch +" "+ map.get(ch));
				
			}
		}
	}

}
