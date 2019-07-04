package ArrayListandExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CompareElelementwithExcel {

	public static void main(String[] args) throws Exception 
	{
		/*
		 Here we have store some WebElement in list and have some common name in excel.
		 So here we will play with the excel and WebElement.
		 
		 */
		
		  System.setProperty("webdriver.chrome.driver",
		  "D:\\ChromeDriver\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  File ExcelLocation = new File("./Excel\\Compare.xlsx");
		  FileInputStream fin = new FileInputStream(ExcelLocation);
		  XSSFWorkbook tt = new XSSFWorkbook(fin);
		  XSSFSheet sheet_number = tt.getSheetAt(0);
			
		  int sheet_number_latRow_Number = sheet_number.getLastRowNum();
			
		  List<WebElement> ElelmetFromWebSite = driver.findElements(By.xpath("//a"));
		  
		  int ElelmetFromWebSite_Size = ElelmetFromWebSite.size();
		  
		  System.out.println(ElelmetFromWebSite_Size);
		    
					  
		  for(int i = 0; i<ElelmetFromWebSite_Size;i++) 
		  
		  {
			 for( int j = 0 ; j<sheet_number_latRow_Number;j++)
			 {
		         WebElement ElelmetFromWebSite_Element = ElelmetFromWebSite.get(i);
		  
		         String ElelmetFromWebSite_CovertTOString = 
				  
		         ElelmetFromWebSite_Element.getAttribute("innerHTML");
		        
		         String m = sheet_number.getRow(j).getCell(0).getStringCellValue();
		         
		         if(ElelmetFromWebSite_CovertTOString.equalsIgnoreCase(m))
		         {
		        	 System.out.println(m);
		         }
		         
		         else
		         {
		        	 System.out.println("fail");
		         }
		 
		  
		  }
		 
	    
		
		
		
	}

}
}
