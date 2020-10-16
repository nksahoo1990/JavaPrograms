package Array;

public class CountConsonantAndVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="india";
		char charArr[]=str.toCharArray();
		int count=0;
		
		for(char obj:charArr){
			switch(obj){
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				default:
			}
		}
		
		System.out.println("number of vowels in string is : " + count);

	}

}
