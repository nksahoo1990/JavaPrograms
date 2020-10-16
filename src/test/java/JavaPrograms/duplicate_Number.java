package JavaPrograms;

import java.util.Arrays;

public class duplicate_Number {

	public static void main(String[] args) {
		int[] num = {1,4,6,3,4,2,2,1};
		//String[] num = {"a","b","f","a","f","y","t"};		
		Arrays.sort(num);
		for(int i=1;i<num.length;i++){
			if(num[i] == num[i-1]){
				System.out.println("duplicate number is :" + num[i]);
			}
		}

	}

}
