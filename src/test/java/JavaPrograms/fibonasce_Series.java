package JavaPrograms;

import java.util.Scanner;

public class fibonasce_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int num =10;
		int n=0;
		
		for(int i=1;i<=num; i++){
			
			 n= n +i;9
			
		}
		System.out.println(n); */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		
		int count =sc.nextInt();
		
		int n1=0,n2=1,n3,i;
				
		//count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    

	}

}
