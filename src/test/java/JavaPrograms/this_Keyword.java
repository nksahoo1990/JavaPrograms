package JavaPrograms;

public class this_Keyword {

	int x,y;
	// here we use this keyword to differentiate between formal parameter and data member.
	// if we remove this it would display ans as 25
	
	public void sum(int x, int y){
		
		this.x=10;
		this.y=15;
		
		int z=x+y;
		System.out.println("summation is " + z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		this_Keyword obj =  new this_Keyword();
		obj.sum(5, 5);
		
	}

}
