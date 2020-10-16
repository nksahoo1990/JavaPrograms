package JavaPrograms;

public class two_Dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[][] = new String[3][4];
		
		str[0][0]= "A0";
		str[0][1]= "B0";
		str[0][2]= "C0";
		str[0][3]= "D0";
		
		str[1][0]= "A1";
		str[1][1]= "B1";
		str[1][2]= "C1";
		str[1][3]= "D1";
		
		str[2][0]= "A2";
		str[2][1]= "B2";
		str[2][2]= "C2";
		str[2][3]= "D2";
		
		//How to find row count or row size.
		
		System.out.println("row count is:" + " " + str.length);

		// How to find the column count
		
		System.out.println("column count is:" + " " + str[0].length);
		
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str[0].length;j++){
				
				System.out.print(str[i][j]+ " ");
			}
			
			System.out.println();
		}

	}

}
