package SpicejetAutomation;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumUtilPakage.SeleniumUtilClass;

public class MR {

	public void BookFlightOneWay() throws Exception
	{
         Properties p = new Properties();
		
		FileInputStream fin = new FileInputStream("D:\\Workspace\\SpiceJet\\SpiceJetStorageFile.properties");
		
		p.load(fin);

		
		/*
		 * File src = new File("./Excel\\SpiceJet.xlsx"); FileInputStream Excelfin = new
		 * FileInputStream(src); XSSFWorkbook read = new XSSFWorkbook(); XSSFSheet ss =
		 * read.getSheet("Sheet1");
		 */

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(p.getProperty("URL"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		WebElement OneWayRadioButton = driver.findElement(By.xpath("//td//input[@value=\"OneWay\"]"));
		
	    if(OneWayRadioButton.isSelected())
	    {
	    	driver.findElement(By.xpath("//span[@id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]")).click();
	    	
	    	List<WebElement> DepertureCityList = driver.findElements(By.xpath("//li//a[@href=\"#\"]"));
	    	
	    	System.out.println(DepertureCityList.size());
	    	
	    	for (int i = 0;i<DepertureCityList.size();i++)
	    	{
	    		WebElement DepertureCityElement = DepertureCityList.get(i);
	    		
	    		String DepertureCityName = DepertureCityElement.getText();
	    		
				/* ss.getRow(i+1).createCell(1).setCellValue(DepertureCityName); */
	    		
	    		String cityname = "Adampur (AIP)";
	    		
	    		System.out.println(DepertureCityName);
	    		
	    		if(DepertureCityName.equals(cityname))
	    		{
	    			System.out.println("DO");
	    			DepertureCityElement.click();
	    			break;
	    		}
	    	}
	    }
	    else 
	    {
	    	System.out.println("Need to select On Way ");
	    }
	    
	    driver.findElement(By.xpath("//span[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXTaction\"]")).click();
	    driver.findElement(By.xpath("//input[@name=\"ctl00$mainContent$view_date1\"]")).click();
	
	    
	    Boolean flag = false;
	    
	     for (int j = 4;j<=5;j++)
	     {
	    	 for (int k = 1;k<=6;k++)
	    	 {
	    		 WebElement datepicker = driver.findElement(By.xpath("//div[contains(@class,\"ui-datepicker-group ui-datepicker-group-first\")]/table/tbody/tr["+j+"]/td["+k+"]/a"));
	    		 String datepicker_value = datepicker.getText();
	    		 
	    		 System.out.println(datepicker_value);
	    		 
	    		 if(datepicker_value.equals("25"))
	    		 {
	    			 datepicker.click();
	    			 flag = true;
	    			 break;
	    		 }
	    	 
	    		 
	    	
	    	 }
	   
	         
	    	 if(flag == true)
    		 {
    			 break;
    		 }
	    	 
	    	 
	     }

	
	}
	
	public void test ()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		SeleniumUtilClass.URL(driver, "https://www.google.com/", 10);
	}
	
}
