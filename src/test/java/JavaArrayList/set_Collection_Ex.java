package JavaArrayList;

import java.util.HashSet;
import java.util.Iterator;

public class set_Collection_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("A");
		hs.add("C");
		
		/*Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		for(String obj:hs) {
			System.out.println(obj);
		}

	}

}
