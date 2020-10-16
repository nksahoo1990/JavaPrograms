package JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CopyElementsFromOneArrayListToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al  = new ArrayList();
		al.add("Pakudi");
		al.add("Papa");
		al.add("tipa");
		al.add("mama");
		al.add("1");
		al.add("2");
		
		ArrayList<String> al1  = new ArrayList();
		al1.add("Asish");
		al1.add("Kumar");
		al1.add("Srikant");
		al1.add("Venky");
		
		Collections.copy(al, al1);
		
		

		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}


	}

}
