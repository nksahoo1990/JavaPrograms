package JavaPrograms;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number =1234;
		int reverseNumber=0;
		int reminder=0;
		
		while(number>0){
			
			reminder=number%10;
			reverseNumber = reminder + (reverseNumber*10);
			number = number/10;
		}
		
		System.out.println("Reverse number is : " + reverseNumber);
		
	}

}
