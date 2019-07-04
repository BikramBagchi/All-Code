package UtilPakage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;

public class SeleniumUtilMethod
{
	 
	//to get the URL and maximize
	public static void URL(WebDriver d , String url , int pageloadtime)
	  {
		  d.get(url);
	      d.manage().timeouts().pageLoadTimeout(pageloadtime, TimeUnit.SECONDS);
	      d.manage().window().maximize();
		  
	  }
	 
	//to call value from properties
	 public static String GetPropertyKey(String keyvalue) throws Exception
	 {
		Properties pop = new Properties();
		
		FileInputStream fin = new FileInputStream("./contain2.properties");
		
		pop.load(fin);
		
		Thread.sleep(5000);
		
		return pop.getProperty(keyvalue);
		 
	 }

	 public static String GetPropertyKey(String keyvalue, String Popertiesfilelocationpath) throws Exception
	 {
		Properties pop = new Properties();
		
		FileInputStream fin = new FileInputStream(Popertiesfilelocationpath);
		
		pop.load(fin);
		
		Thread.sleep(5000);
		
		return pop.getProperty(keyvalue);
		 
	 }
	 
	 
	 public static String GetPropertyKey(String keyvalue, String Popertiesfilename , int sleepAmount) throws Exception
	 {
		Properties pop = new Properties();
		
		FileInputStream fin = new FileInputStream("./"+Popertiesfilename+".properties");
		
		pop.load(fin);
		
		Thread.sleep(sleepAmount);
		
		return pop.getProperty(keyvalue);
		 
	 }
	 
	 public String ReadDataFromxlsFormat(String filePath ,String SheetNAme ,int ColumnValue , int RowValue) throws Exception
	 {
		
		    File file = new File(filePath);
	    	FileInputStream fin = new FileInputStream(file);
	    	Workbook sheet = Workbook.getWorkbook(fin);
	    	Sheet dd = sheet.getSheet(SheetNAme);
	    	   	
	    	String XlsData = dd.getCell(ColumnValue, RowValue).getContents();
	    	
	    	return XlsData ;    	
		 
	 }

   public void ExplictWaitElementClickable(WebDriver dr, int time , String Xpath)
   {
	
	   WebDriverWait d = new WebDriverWait(dr,time);
	   
	   d.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath(Xpath))));
   }
}

