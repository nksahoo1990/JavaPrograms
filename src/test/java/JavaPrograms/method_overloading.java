package JavaPrograms;

// We have to use same method name, same variable but different data type.


public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum("Ram","Sita");
		sum(4,5);
	}

	public static int sum(int x, int y){
		
		int z =x+y;
		System.out.println(z);
		return(z);
	}
	
	public static String sum(String x, String y){

		String z= x+y;
		System.out.println(z);
		return(z);
	}
}
