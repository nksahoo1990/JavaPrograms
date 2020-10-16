package JavaPrograms;

public class reverseNumberAndPallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234321;
		int initNum=1234321;
		
		int rev=0;
		
		while(num>0){
			
			int rem=num%10;
			rev= rem+rev*10;
			num=num/10;
		}
		
		System.out.println(rev);
		
		if(rev==initNum){
			System.out.println("number is pallindrom");
		}else{
			System.out.println("number is not pallindrom");
		}

	}

}
