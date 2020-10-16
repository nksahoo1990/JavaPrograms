package Array;

import java.util.Arrays;

public class CommonElementInTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1={1,3,6,8};
		int[] arr2={3,5,8,9};
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println("common element is : " + arr1[i]);
				}
			}
		}
		
		

	}

}
