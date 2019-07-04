package TestFirstSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		
		// Specify the path of file
		  File src = new File("D:\\ExcelRead/test2.xlsx");

		// load file
		FileInputStream fis=new FileInputStream(src);
		
		// Load workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		// Load sheet- Here we are loading first sheetonly
	     XSSFSheet sh1= wb.getSheetAt(0);
	     
	   /* String read =  sh1.getRow(0).getCell(0).getStringCellValue();
	     
	     System.out.println("Read Data "+read);
	   */
	     sh1.getRow(0).createCell(1).setCellValue("bal");
	     
	     FileOutputStream fout = new FileOutputStream(src);
	     
	     wb.write(fout);
	    
	    
	     
	     
	     
		
		
		
		
		
		
		
		
		

	}

}
