package JavaPrograms;

public class exammple_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "I Love My India";
		String b = "I Love Berhampur";
		
		System.out.println(a.length());
		System.out.println(a.charAt(7));
		System.out.println(a.indexOf("M"));
       // System.out.println(a.indexOf('I'));
        System.out.println(a.indexOf("n"));
        System.out.println(a.indexOf("India"));
        System.out.println(a.equals(b));
        System.out.println(a.substring(7, 10));
         
        String val[] = b.split("Love");
        
        for(int i=0;i<val.length;i++){
        	System.out.println(val[i]);
        }
        
	}
	

}
