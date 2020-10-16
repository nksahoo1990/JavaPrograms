package JavaPrograms;

public class localVariables {
	
	// here i is instance variable
	int i=10;
	
	public void test(){
		
		// here y is local variable
		int y=20;
		System.out.println(y);
		i=i+5;
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		
		localVariables var = new localVariables();
		var.test();
		System.out.println(var.i);

	}

}
