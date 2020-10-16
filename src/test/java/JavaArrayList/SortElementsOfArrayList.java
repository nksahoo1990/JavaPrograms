package JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortElementsOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al  = new ArrayList();
		al.add("Pakudi");
		al.add("Zaan");
		al.add("Abram");
		al.add("Mama");
		al.add("1");
		al.add("2");
		
		Collections.sort(al);
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		

	}

}
