package JavaPrograms;

import java.util.Scanner;

public class reverseStringUsingStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = sc.nextLine();
		
		//String reverse = new StringBuilder(word).reverse().toString();

		String reverse= new StringBuilder(word).reverse().toString();
		System.out.println("reversed string is: " + reverse);
	}
	

}
