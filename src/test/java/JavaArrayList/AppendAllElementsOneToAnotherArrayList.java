package JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AppendAllElementsOneToAnotherArrayList {

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
		
		//al.addAll(al1);
		al.addAll(1, al1);
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		

	}

}
