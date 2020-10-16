package JavaPrograms;

public class pallindrom {

	public static void main(String[] args) {

		String str = "EMME";
		System.out.println(str.length());
		
		int len = str.length();
		len= len/2;
		
		/*for(int i=0;i<len;i++){
			System.out.println(str.charAt(i));
		}
		
		
		for(int j=str.length()-1;j>=len;j--){
			System.out.println(str.charAt(j));
		}*/
		
		
		for(int i=0;i<len;i++){
			for(int j=str.length()-1;j>=len;j--){
				
				if(str.charAt(i)==str.charAt(j)){
					System.out.println("Pallindrom succes");
				}
			}
			
			
		}
		
		
		
		
		
	}

}
