package JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("ab");
		al.add("abc");
		
		ArrayList<String> al1 = new ArrayList<String>();
		al.add("z");
		al.add("cv");
		al.add("rty");
		
		ArrayList<Integer> kk = new ArrayList<Integer>();
		kk.add(1);
		kk.add(4);
		
		al.remove(0);
		al.set(1, "xz");
		System.out.println(Collections.max(kk));
		
		Collections.copy(al, al1);
		
		
		
		for(String str:al){
			System.out.println(str);
		}
		
		
		Collections.sort(kk);
		for(Integer str:kk){
			System.out.println(str);
		}
		
	}

}
