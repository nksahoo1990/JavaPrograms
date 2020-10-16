package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al  = new ArrayList();
		al.add("Pakudi");
		al.add("Papa");
		al.add("tipa");
		al.add("mama");
		al.add("1");
		al.add("2");
		
		Iterator itr = al.listIterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}

	}

}
