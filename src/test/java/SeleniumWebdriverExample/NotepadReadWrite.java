package SeleniumWebdriverExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotepadReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// create file in D drive.
		
		String fileName = "D:\\test.txt";
		File file = new File(fileName);
		file.createNewFile();
		
		//Writing In to file.
		  //Create Object of java FileWriter and BufferedWriter class.
		FileWriter FW = new FileWriter(fileName);
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("I am Sahoo");
		BW.newLine();
		BW.write("I am from Berhampur.");
		BW.close(); 
		
		
		//Reading from file.
		  //Create Object of java FileReader and BufferedReader class.
		
		FileReader FR = new FileReader(fileName);
		BufferedReader BR = new BufferedReader(FR);	
		String content = "";
		
		while((content = BR.readLine())!=null){
			
			System.out.println(content);
		}
	

	}

}
