package JavaPrograms;

public class static_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		login();
		inbox(4);
		int summation_val= sum(4,5);
		System.out.println("This is static method, with paramaeter and with return value");
		System.out.println(summation_val);

		int add_val=add();
		System.out.println("This is a static method , without parameter and with return value");
		System.out.println(add_val);
	}
	
	// Method without parameter and return value.
	
	public static void login(){
		
		System.out.println("This is static function without paramaer and return value");
	}
	
	// Method with parameter and without return value.
	
	public static void inbox(int a){
		
		System.out.println("This is static method, with parameter and without returnvalue");
		System.out.println("value of integer is :" + "" + a);
		
	}

	//Method with parameter and with return value
	
	public static int sum(int x, int y){
		
		int z= x+y;
		return(z);
	}
	
	//MEthod without parameter and with return value
	
	public static int add(){
		
		int i= 4;
		int j=4;
		
		int k = i+j;
		
		return(k);
	}
	
}
