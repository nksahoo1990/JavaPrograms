package JavaPrograms;

import java.util.Scanner;

public class MatrixCreation {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = Integer.parseInt(obj.nextLine());
		
		System.out.println("Enter number of columns");
		int column= Integer.parseInt(obj.nextLine());
		
		int[][] matrix = new int[row][column];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				
				matrix[i][j]= obj.nextInt();
			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				
				System.out.print("\t" + matrix[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
