package JavaArrayList;

import java.util.ArrayList;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al  = new ArrayList();
		al.add("Pakudi");
		al.add("Papa");
		al.add("tipa");
		al.add("mama");
		al.add("1");
		al.add("2");
		
		al.remove(4);
		System.out.println("Before Removal of element");
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		
		al.clear();
		System.out.println("After removal");
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}

	}

}
