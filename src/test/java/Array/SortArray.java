package Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		arr[0]=100;
		arr[1]=21;
		arr[2]=32;
		arr[3]=4;
		
		int index=Arrays.binarySearch(arr, 32);
		System.out.println(index);
		
		Arrays.sort(arr);
		
		for(int i=1;i<arr.length;i++){
		System.out.println(arr[i]);
	}

	}

}
