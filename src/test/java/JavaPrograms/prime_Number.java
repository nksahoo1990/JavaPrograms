package JavaPrograms;

public class prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	int num=20;
		int cnt =0;
	
	for(int i=1;i<=num;i++){
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
		}
	}
}
	


