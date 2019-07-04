package ArrayListandExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadbynestedfor {

	public static void main(String[] args) throws Exception {
		
		//using nested loop we will read the value of excel sheet and using of break statement

		
		File location = new File("D:\\XXX.xlsx");
		FileInputStream fin = new FileInputStream(location);
		XSSFWorkbook ee = new XSSFWorkbook(fin);
		XSSFSheet hobena = ee.getSheetAt(0);
		
		String gapjal = hobena.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(gapjal);
		
		int panu = hobena.getLastRowNum();
		System.out.println(panu);
		
		System.out.println("============================================");
		
		for(int i=1;i<=panu;i++)
		{
			for(int j =1; j<=3; j++)
			{
			String gg = hobena.getRow(i).getCell(j).getStringCellValue();
			System.out.println(gg);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			
			if(gg.equalsIgnoreCase("forteen"))
			{
				System.out.println("Holo Oboses");
			}
		   }
		
			break ; 
			/*
			 break means if the condition match then it will not
			 with the loop for the next time loop will get break 
			 and go to the next statement 
			 
			 */
	}

}
}

	
