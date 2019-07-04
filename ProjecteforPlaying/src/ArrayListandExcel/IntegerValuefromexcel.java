package ArrayListandExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegerValuefromexcel {

	public static void main(String[] args) throws Exception {
		
		File location = new File("D:\\XXX.xlsx");
		FileInputStream fin = new FileInputStream(location);
		XSSFWorkbook ee = new XSSFWorkbook(fin);
		XSSFSheet hobena = ee.getSheetAt(1);
		
		int a = (int) hobena.getRow(1).getCell(0).getNumericCellValue();
					
		System.out.println(a);
		
		

	}

}
