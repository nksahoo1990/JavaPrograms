package SeleniumWebdriverExample;

public class MethodOverloading {

	
	
	void sum(int x, int y){
		
		System.out.println(x+y);
	}
	
	void sum(double a,double b){
		
		System.out.println(a+b);
	}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	MethodOverloading test = new MethodOverloading();
	test.sum(5, 5);
	test.sum(5.5, 6.5);
	
}
}
		