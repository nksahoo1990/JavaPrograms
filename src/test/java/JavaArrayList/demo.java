package JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Bawaluuu");
		al.add("Kumuti");
		al.add("Gaji");
		al.add("Booooby");
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Mama");
		al1.add("Pakudi");
		al1.add("Nitu");
		
		al.addAll(al1);
		//al.addAll(1,al1);
		
		/*for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		al.set(2, "Abu");
		//List sublt=al.subList(2, 5);
	
		//al.remove("Nitu");
		ListIterator itr =al.listIterator();
		while(itr.hasNext()) {
			System.out.println("next element is : " + itr.next());
		}
		boolean res = al.contains("Mama");
		
		System.out.println(res);
		
		/*while(itr.hasPrevious()) {
			System.out.println("backward :" + itr.previous());
		}*/
		
		ArrayList<Integer> al2 = new ArrayList();
		al2.add(1);
		al2.add(50);
		al2.add(7);
		
		System.out.println(Collections.max(al2));
		System.out.println(Collections.min(al2));
		
		al2.remove(1);
		System.out.println(Collections.max(al2));
	}

}
