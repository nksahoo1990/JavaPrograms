package JavaPrograms;

public class palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       String a = "nitin";
		String b = "";
		for(int i=a.length()-1;i>=0;i--){
			 b=b+a.charAt(i);
			
		}
		
		if(a.equalsIgnoreCase(b)){
			
			System.out.println("String is pallindrom : " + a );
			
		}

		
	}

}
