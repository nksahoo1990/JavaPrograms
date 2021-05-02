package JavaPrograms;

import java.util.Scanner;

public class prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value : "); 
		int num=sc.nextInt();
    	//int num=20;
		int cnt =0;
	
	/*for(int i=1;i<=num;i++){
		cnt=0;
			for(int j=2;j<=i/2;j++){
				if(i%j == 0){
					cnt++;
					break;
				}
			}
			
			if(cnt==0){
				System.out.println(i);
			}
		}*/
		
		// ex num = 20
		// any number divided by 1 or itself(20) is known as prime number.
		// if any number between 1 and 20. if 20 is divisible by any number between 1 & 20 , then its not prime number. so same login written below.
		
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				cnt = cnt +1;
			}
			
		}
		if(cnt>0) {
			System.out.println(num + " : number is  not a prime  number");
		}else {
			System.out.println(num + "number is a prime  number");
		}
	}
}
	


