package JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumMaximumElementInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(56);
		al.add(89);
		al.add(5);
		
		Object obj= Collections.min(al);
		System.out.println("Minimun element : " + obj);

		Object obj1= Collections.max(al);
		System.out.println("Maximum element : " + obj1);
	}

}
