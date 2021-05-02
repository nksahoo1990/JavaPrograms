package SeleniumWebdriverExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;

public class ReadExcelFile {
	
	File file=null;
	XSSFWorkbook workbook=null;
	FileInputStream fis=null;
	public void getDataFromExcel() throws FileNotFoundException {
		
		// create a object of file and reads file path
		 file= new File("C:\\Users\\Nitya Krushna Sahoo\\Selenium Stuff\\TestFile.xlsx");
		
		//  create object of fileinputstream to read values
		 fis = new FileInputStream(file);
		//FileInputStream fis = new FileInputStream("C:\\Users\\Nitya Krushna Sahoo\\Selenium Stuff\\TestFile.xlsx");
		 
		
	}

}
