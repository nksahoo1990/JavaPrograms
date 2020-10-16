package JavaPrograms;

public class SuperKeyword_ChildClass_Boss extends SuperKeyword_ParentClass_Employee {
	
	public void my_Salary(){
		
		System.out.println("I am the boss and my salary  is " + super.salary);
	}

	String name = "King";
	int age = 40;
	double salary= 90000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 SuperKeyword_ChildClass_Boss obj = new SuperKeyword_ChildClass_Boss();
		
		obj.my_Salary();
		
		
		
	}

}
