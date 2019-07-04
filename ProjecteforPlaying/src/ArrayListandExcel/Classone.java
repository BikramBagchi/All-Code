package ArrayListandExcel;

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

public class Classone {

	public static void main(String[] args) throws IOException {
		
		System.out.println("First Coide");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		try
		{List<WebElement> test01 = driver.findElements(By.xpath("//ul/li/a"));
		
		int test01size = test01.size();
		
		System.out.println(test01size);
		
		for(int i =  0 ; i<=test01size;i++)
		{
			WebElement Element = test01.get(i);
			String link_name = Element.getAttribute("href");
			System.out.println(link_name);
		}
		}
		catch(Exception e)
		{
			
		}
		System.out.println("KK");
		
		File store = new File("D:\\ExcelRead\\test03.xlsx");
		
		System.out.println("KK1");
		
		FileInputStream store1 = new FileInputStream(store);
		
		System.out.println("KK2");
		
		XSSFWorkbook store2 = new XSSFWorkbook(store1);
		
		System.out.println("KK3");
		
		XSSFSheet sh2= store2.getSheetAt(1);
		
		System.out.println("KK4");
		
		String dd = sh2.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("KK5"); // working still this much
		
		System.out.println(dd);
		
		sh2.getRow(0).createCell(1).setCellValue("Gapjal");
			     
	    FileOutputStream Store11 = new  FileOutputStream(store);
	    
	    store2.write(Store11);
	    
		
		
	}

}
