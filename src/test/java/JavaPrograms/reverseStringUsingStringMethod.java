package JavaPrograms;

public class reverseStringUsingStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "john cena";
		
		String reverse = new StringBuilder(word).reverse().toString();

		System.out.println("reversed string is: " + reverse);
	}
	

}
