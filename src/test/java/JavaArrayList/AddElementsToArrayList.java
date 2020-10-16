package JavaArrayList;

import java.util.ArrayList;

public class AddElementsToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al  = new ArrayList();
		al.add("Pakudi");
		al.add("Papa");
		al.add("tipa");
		al.add("mama");
		
		System.out.println("Before Insertion");
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		System.out.println("After Insertion");
		al.add(2, "Inserted Element : Nitya");
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		/*for(String obj:al){
			
			System.out.println(obj);
		};*/
		
		}

	}

}
