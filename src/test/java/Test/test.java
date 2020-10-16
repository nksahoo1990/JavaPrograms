package Test;
public class test {
	int x;
	int y=4;
	public void demo(){
		System.out.println(x);	
		System.out.println(y);
	}
	public static void main(String[] args) {	
		test t = new test();
		t.demo();
	}
}

//O/P - 0
//      4
// what happens when we declare a local variable but do not initialize.
// Example same above program but int x is declared inside demo method.
// O/P - Compilation error. because local variables has to be initialized.