package Array;

import java.util.Arrays;

public class MinimumAndMaximumValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,2,13};
		Arrays.sort(arr);
		int minVal = arr[0];
		int maxVal = arr[arr.length-1];
		System.out.println("Min Value is : " + minVal);
		System.out.println("Max value is : " + maxVal);
	}

}
