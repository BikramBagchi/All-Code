package WriteFromWebTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class one {

	public static void main(String[] args) throws Exception {
       
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		File src = new File("E:\\ff.xlsx");
		
		FileInputStream fin = new FileInputStream(src);//it will load yhe file in format of byte
		
		XSSFWorkbook load = new XSSFWorkbook(fin);//to load the workbook
		
		XSSFSheet gotosheet1 = load.getSheetAt(0);//to get the sheet
		
		String value1 = gotosheet1.getRow(0).getCell(0).getStringCellValue();//to get value
		
		System.out.println(value1);
		
		String Title = "Web Table Elements";
		
		WebDriverWait wait  = new  WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(Title));
		
	
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]/a"));
		
		int list_size = list.size();
		
		System.out.println("The size of the list is  "+list_size);
		
		for (int i = 0 ; i<list_size ; i++)
		{
			WebElement element = list.get(i);
			//String list_String = element.getAttribute("innerHTML");
			String list_String = element.getText();
			
			int y = i+1;
			
			WebElement element2 = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+y+"]/td[4]"));
			
			String Value = element2.getText();
			
			gotosheet1.getRow(y).createCell(1).setCellValue(list_String);
			
			gotosheet1.getRow(y).createCell(2).setCellValue(Value);
			
			FileOutputStream fout = new FileOutputStream(src);
			
			load.write(fout);
						
			System.out.println("Current Price for "+list_String+" is " +Value);
				
			
				
			}


	}

}
