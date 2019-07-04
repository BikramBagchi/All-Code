package ArrayListandExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compare {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	   	  ArrayList<String> Excel = new ArrayList<String>();
		
		  File ExcelLocation = new File("./Excel\\Compare.xlsx");
		  FileInputStream fin = new FileInputStream(ExcelLocation);
		  XSSFWorkbook tt = new XSSFWorkbook(fin);
		  XSSFSheet sheet_number = tt.getSheetAt(0);
		  int size = sheet_number.getLastRowNum();
		  
		  System.out.println(size);
		 
		 try { 
		  for(int i = 0;i < size ;i++)
		  {
			  String ss = sheet_number.getRow(i).getCell(0).getStringCellValue();
			  System.out.println(ss);
			  Excel.add(ss);
		  }
		 }
		 catch(Exception e)
		 {
		 }
		 
		 System.out.println(Excel.get(3));
		 

			List<WebElement> elelment_list = driver.findElements(By.xpath("//a"));
			  
			int dd = elelment_list.size();
			  
		    System.out.println(dd);
		
		    for(int i = 0; i < dd ; i++)
		    {
		    	 for(int j = 0 ; j < 12 ; j++)
				     
			  
			  {
		    	 WebElement ElelmetFromWebSite_Element = elelment_list.get(i);
				  
		         String Name = ElelmetFromWebSite_Element.getAttribute("innerHTML");
		         
		 
		         
		         String Compare_one = Excel.get(j);
				  
		         if(Name.equals(Compare_one))
		         {
		        	 System.out.println(Compare_one);
		        	 
		        	 break;
		        	 
		         }
		         
		         else
		         {
		        	 System.out.println("Fail");
		         }
		        	 
		         
		         
		  
			  }
	}

}
}