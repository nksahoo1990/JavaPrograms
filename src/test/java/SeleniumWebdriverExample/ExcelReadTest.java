package SeleniumWebdriverExample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/*import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; */

public class ExcelReadTest {
	
	
	public void readExcelFile(String fileName) throws FileNotFoundException, IOException{
		InputStream xlsFileToRead = null;
		HSSFWorkbook workbook = null;
		//Workbook wb = new HSSFWorkbook();
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		HSSFRow row;
		HSSFCell cell;
		Iterator rows = sheet.rowIterator();

		while (rows.hasNext()) {
			row = (HSSFRow) rows.next();
			
			//Iterating all the cells of the current row
			Iterator cells = row.cellIterator();

			while (cells.hasNext()) {
				cell = (HSSFCell) cells.next();

				if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
					System.out.print(cell.getStringCellValue() + " ");
				} else if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
					System.out.print(cell.getNumericCellValue() + " ");
				} else if (cell.getCellType() == HSSFCell.CELL_TYPE_BOOLEAN) {
					System.out.print(cell.getBooleanCellValue() + " ");

				} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_BLANK
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
				}
			}
		
		}
			
		
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		ExcelReadTest readXlsx = new ExcelReadTest();
		readXlsx.readExcelFile("D:\\ReadExcelFile");
		

	}

}
