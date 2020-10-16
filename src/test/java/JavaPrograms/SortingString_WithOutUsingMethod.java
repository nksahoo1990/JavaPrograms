package JavaPrograms;

public class SortingString_WithOutUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "mnbvc";
		char[] charArr = a.toCharArray();
		
		for(int i=0;i<charArr.length;i++){
			for(int j=0;j<charArr.length;j++){
				char temp=0;
				
				if(charArr[j]>charArr[i]){
					temp= charArr[i];
					charArr[i]=charArr[j];
					charArr[j]=temp;
				}
			}
		}

		for(int k=0;k<charArr.length;k++){
			System.out.println(charArr[k]);
		}
	}

}
