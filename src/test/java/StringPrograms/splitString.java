package StringPrograms;

public class splitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String str = "abc-def ";
		String[] part=str.split("-");
		for(int i=0;i<part.length;i++){
			System.out.println(part[i].trim());
		}
	}

}
