package JavaArrayList;

import java.util.ArrayList;
import java.util.List;

public class SubListOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al  = new ArrayList();
		al.add("Pakudi");
		al.add("Papa");
		al.add("tipa");
		al.add("mama");
		al.add("1");
		al.add("2");
	
		List subListVal =al.subList(1, 4);
		
		
		for(int i=0;i<subListVal.size();i++){
			System.out.println(subListVal.get(i));
		}


	}

}
