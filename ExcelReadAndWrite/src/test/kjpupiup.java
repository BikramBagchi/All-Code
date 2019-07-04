package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class kjpupiup {

	public static void main(String[] args) throws Exception {
		
		File src = new File("E:\\Exceldata\\LinkList.xlsx");
         FileInputStream fin = new FileInputStream(src);//it will load yhe file in format of byte
		
		XSSFWorkbook load = new XSSFWorkbook(fin);//to load the workbook
		
		XSSFSheet gotosheet1 = load.getSheetAt(0);//to get the sheet
		
		String value1 = gotosheet1.getRow(0).getCell(0).getStringCellValue();//to get value
				
		System.out.println(value1);
		    

		gotosheet1.getRow(1).createCell(2).setCellValue("ppp");
		
		FileOutputStream fout = new FileOutputStream(src);
		
		load.write(fout);
		
		load.close();
	}
	}


