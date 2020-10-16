package JavaPrograms;

public class object_reference {
	
	int wheel;
	String model;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       
		// Syntax to create a new object
		// new classname
		// new object_reference
		
		object_reference a = new object_reference();
		a.wheel= 4;
		System.out.println(a.wheel);
		
		a.model="BMW";
		System.out.println(a.model);
		a.start();
		a.acc();
		a.stop();
		
		// gear() is  static method. Static method can be called directly or using class name. No Need of reference variable.
		
		object_reference.gear();
		gear();
		
	}

	public void start(){
		
		System.out.println("I am in Start function");
	}
	
	public void stop(){
		System.out.println("i am in stop function");
	}
	
	public void acc(){
		System.out.println("I am in acc function");
	}
	
	public static void gear(){
		
		System.out.println("i am in break function");
	}
	
	
}
