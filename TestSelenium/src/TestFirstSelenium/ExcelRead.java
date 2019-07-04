package TestFirstSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		// Specify the path of file
		  File src = new File("D:\\ExcelRead/test.xlsx");

		// load file
		FileInputStream fis=new FileInputStream(src);
		
		// Load workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		// Load sheet- Here we are loading first sheetonly
	     XSSFSheet sh1= wb.getSheetAt(0);
	     
	     String a = sh1.getRow(1).getCell(0).getStringCellValue();
	     System.out.println(a);
	     
	     String b = sh1.getRow(2).getCell(0).getStringCellValue();
	     System.out.println(b);
	     
	     XSSFSheet sh2= wb.getSheetAt(1);
	     
	     for(int i = 0 ; i<=3; i++)
	     {	 
	     String find = sh2.getRow(0).getCell(i).getStringCellValue();
	      
	       if (find.equals("Pin"))
	        {
	    	 System.out.println("Gapjal sala tui");
	  	      
	    	  for (int j = 0; j<=10; ++j )
	    	    {
	    		  String find1 = sh2.getRow(j).getCell(i).getStringCellValue();
	    		  System.out.println(find1);
	    		  ArrayList store = new ArrayList();
	    		  store.add(find1);
	    		  System.out.println("ArrayList value"+store);
	    		  	   
	    		  HashMap store2 = new HashMap();
	    		  store2.put(j, find1);
	    		  System.out.println("HashMap value"+store2);
	    		  
	    		  LinkedList store3 = new LinkedList();
	    		  store3.add(find1);
	    		  System.out.println("LinkedList value "+store2+" Just an example "+j);
	    		  
	    	 }
	        }
	     
	     }
	     
	}
	     
	}




