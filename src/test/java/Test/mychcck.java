package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class mychcck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
			
		al.add("ram");
		al.add("abram");
		al.add("champ");
		al.add("zkeerr");
		al.add("ram");
		
		Collections.sort(al);
		
		Iterator<String> itr =al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

//		TreeMap<Integer,String> hm = new TreeMap<Integer,String>();{
//			
//			hm.put(105, "Rama");
//			hm.put(101, "Sita");
//			hm.put(103, "Laxman");
//			hm.put(102, "Hanuman");
//			hm.put(104, "Rama");
//			
//			for(Map.Entry m:hm.entrySet()){
//				System.out.println(m.getKey() + " " + m.getValue());
//			}
//			
//		}
	}

}
 