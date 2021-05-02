package JavaArrayList;

import java.util.HashMap;
import java.util.Map;

public class hashMap_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Nitya", 1);
		hm.put("Krushna", 2);
		hm.put("Sahoo", 3);
		hm.put("Bapi", 4);
		hm.put("Dandu", 5);
		
		for(Map.Entry M: hm.entrySet()) {
			
			System.out.println("Key is : " + M.getKey() + " Value is : " + M.getValue());
		}

	}

}
