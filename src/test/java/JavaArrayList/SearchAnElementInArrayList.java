package JavaArrayList;

import java.util.ArrayList;

public class SearchAnElementInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al  = new ArrayList();
		al.add("Pakudi");
		al.add("Papa");
		al.add("tipa");
		al.add("mama");
		al.add("1");	
		al.add("2");
		
		boolean result=al.contains("mama");
		System.out.println(result);

	}

}
