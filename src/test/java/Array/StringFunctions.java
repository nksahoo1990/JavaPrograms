package Array;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Split function*/
		
		String fullname = "lee john cena";
		String[] halfname = fullname.split(" ");
		
		for(int i=0;i<halfname.length;i++){
			System.out.println(halfname[i]);
		}
		
		/* ============================================= */
		
		String test = " johncena   ";
		System.out.println(test.trim());
		
		/* ============================================= */
		
		String concatString = test.trim().concat(" The Champ is here.");
		System.out.println(concatString);
		
		
		
		
		
	}

}
