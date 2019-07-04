package Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write {

	public static void main(String[] args) throws Exception {
		
		File src = new File("E:\\Exceldata\\DataSheet.xlsx");
		
		FileInputStream fin = new FileInputStream(src);//it will load yhe file in format of byte
		
		XSSFWorkbook load = new XSSFWorkbook(fin);//to load the workbook
		
		XSSFSheet gotosheet1 = load.getSheetAt(0);//to get the sheet
		
        String value1 = gotosheet1.getRow(0).getCell(0).getStringCellValue();//to get value
		
		System.out.println(value1);
		
	    gotosheet1.getRow(5).createCell(0).setCellValue("Pass");// to write
		
		FileOutputStream fout = new FileOutputStream(src); // to write 
		
		load.write(fout);// to write
				
		load.close();
		
	}

}
