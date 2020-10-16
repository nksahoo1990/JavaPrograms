package JavaPrograms;

import org.testng.annotations.Test;

public class InheritanceChildClass extends InheritanceSuperClass{
	
	int id=4;
	String name= "Ram";

	
		// TODO Auto-generated method stub
		
	@Test
	public void check(){
		InheritanceChildClass obj= new InheritanceChildClass();
		System.out.println(obj.id);
		System.out.println(obj.acc_no);
		System.out.println(obj.balance);
		obj.Bank();
	}
	

}
