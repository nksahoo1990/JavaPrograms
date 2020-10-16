package Array;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"INDIA","ODISHA","BERHAMPUR"};
		
				
		for(String loc:arr){
			if(loc.contains("ODISHA")){
				System.out.println("Search Successful");
			} 
			/*else{
				System.out.println("Search Unsuccessful");
			}*/
		}
		
	}

}
