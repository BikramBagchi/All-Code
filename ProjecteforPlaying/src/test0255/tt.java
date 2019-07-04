package test0255;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tt {

	public static void main(String[] args) throws IOException {
		
		System.out.println("First Coide");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> test001 = driver.findElements(By.xpath("//div/a"));
		
		int test001_size = test001.size();
		
		for (int i = 0; i<=test001_size;i++)
		{
			WebElement elelment = test001.get(i);
			String AllLinks = elelment.getAttribute("href");
			System.out.println(AllLinks);
			
		}
		
		
		File src = new File("D:\\ExcelRead/test04.xlsx");
		// load file
		FileInputStream fis = new FileInputStream(src);

		// Load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// Load sheet- Here we are loading first sheetonly
		XSSFSheet sh1 = wb.getSheetAt(0);

		
		String read = sh1.getRow(0).getCell(0).getStringCellValue();
		  
    	System.out.println("Read Data "+read);
		  		  		 
    	 System.out.println("Sam");
		  sh1.getRow(1).createCell(1).setCellValue("bal");
		  
		  System.out.println("Ram");
		  
		  FileOutputStream fout = new FileOutputStream(src);
		  
		  wb.write(fout);
		  
		  wb.close();
	}

}
