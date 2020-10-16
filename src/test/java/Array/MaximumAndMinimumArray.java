package Array;

public class MaximumAndMinimumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={4,23,56,88,90,2};
		int maxNum=arr[0];
		int minNum=arr[0];
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>maxNum){
				maxNum=arr[i];
			}
			else if(arr[i]<minNum){
				minNum=arr[i];
			}
		}
		
		System.out.println("max value : " + maxNum);
		System.out.println("min value : " + minNum);

	}

}
