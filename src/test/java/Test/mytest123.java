package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class mytest123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String str[] = {"a","v","a","g"};
		
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				
				if(str[i].equalsIgnoreCase(str[j])){
					System.out.println("Common char is : " + str[i]);
				}
			}
		}
		
	}

}
