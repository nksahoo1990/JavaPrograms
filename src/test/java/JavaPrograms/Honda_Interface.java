package JavaPrograms;

public class Honda_Interface implements vehicle_Interface {

	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("i am in Honda acceleration mode");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Honda_Interface hr = new Honda_Interface();
		hr.accelerate();
		hr.brake();
		
		Maruti_Interface maruti = new Maruti_Interface();
		maruti.accelerate();
		maruti.brake();
		
	}

	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("this is honda super brake");
		
	}

}

