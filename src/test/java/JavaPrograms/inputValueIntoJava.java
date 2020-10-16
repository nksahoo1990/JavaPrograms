package JavaPrograms;

import java.util.Scanner;

public class inputValueIntoJava {

	public static void main(String[] args) {
	
		int n;
		String s;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enetr String Value");
		s=obj.nextLine();
		System.out.println("String enetred" +" :" +s);

		System.out.println("Enter Integer");
		n=obj.nextInt();
		System.out.println("Integer Enetred"+  " :"+n);
	}

}
