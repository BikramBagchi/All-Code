package Read;

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

public class StoreINExcelFromListInWebite {
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
        File src = new File("E:\\Exceldata\\LlList.xlsx");
		
		FileInputStream fin = new FileInputStream(src);//it will load yhe file in format of byte
		
		XSSFWorkbook load = new XSSFWorkbook(fin);//to load the workbook
		
		XSSFSheet gotosheet1 = load.getSheetAt(0);//to get the sheet
		
		String value1 = gotosheet1.getRow(0).getCell(0).getStringCellValue();//to get value
				
		System.out.println(value1);
		
		
		
		List<WebElement> ALLLinks = driver.findElements(By.xpath("//div/a"));
		
		int ALLLinks_size = ALLLinks.size();
		
		System.out.println(ALLLinks_size);
		
		for (int i = 0;i<=ALLLinks_size;i++)
			
		{
			int rowvalue = i+1;
			WebElement element = ALLLinks.get(i);
			String ValueNAme = element.getAttribute("href");
			
			System.out.println(ValueNAme);
			
			String value2 = gotosheet1.getRow(0).getCell(1).getStringCellValue();
			
			if(value2.contentEquals("LinklIst"))
			{	
			
			gotosheet1.getRow(rowvalue).createCell(1).setCellValue(ValueNAme);
			
			FileOutputStream fout = new FileOutputStream(src);
			
			load.write(fout);
			
		    }
		
	}

}
}
