package JavaPrograms;

public class FindDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "He89Llo1&";
		
		String numbers=str.replaceAll("[^0-9]", "");
		
		System.out.println(numbers);
		int sum=0;
			for(int i=0; i<numbers.length(); i++) {
			    char temp = numbers.charAt(i);
			    if (Character.isDigit(temp)) {
			        int b = Integer.parseInt(String.valueOf(temp));
			        sum=sum+b;
			    }
			}
			System.out.println(sum);
		}

	}


