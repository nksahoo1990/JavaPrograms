package JavaArrayList;

import java.util.ArrayList;

public class ReplaceElementsInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al  = new ArrayList();
		al.add("Pakudi");
		al.add("Papa");
		al.add("tipa");
		al.add("mama");
		al.add("1");
		al.add("2");
		
		al.set(4, "King");
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
	}

}
