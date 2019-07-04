package Read;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class READ {

	public static void main(String[] args) throws Exception {
		
		File src = new File("E:\\Exceldata\\DataSheet.xlsx");
		
		FileInputStream fin = new FileInputStream(src);//it will load yhe file in format of byte
		
		XSSFWorkbook load = new XSSFWorkbook(fin);//to load the workbook
		
		XSSFSheet gotosheet1 = load.getSheetAt(0);//to get the sheet
		
		String value1 = gotosheet1.getRow(0).getCell(0).getStringCellValue();//to get value
		
		System.out.println(value1);

		int rownumber = gotosheet1.getLastRowNum();
		/*
		 It will give me the last row number means
		 the total row number 
		*/
		
		System.out.println(rownumber);
		
		for (int i = 0; i<=rownumber;i++)
		
		{
			String value2 = gotosheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(value2);
		}
		
		gotosheet1.getRow(1).createCell(2).setCellValue("Pass");// to write
		
		FileOutputStream fout = new FileOutputStream(src); // to write 
		
		load.write(fout);// to write
				
		load.close();
		
		

	}

}
