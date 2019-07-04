package PropertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) throws Exception {
	
	/*
	 
	 Properties file is like a bucket where we can store our data as per require 
	 same as excel but Properties file mainly use for small data storage require
	  
	 */
	
	/*
	 
	 How to create a properties file
	 
	 Right click on Package 
	 click on other 
	 click on general 
	 click on file 
	 click on next 
	 give the properties file name as filename.properties
	 click on save 
	 	 
	 */
	
		Properties p = new Properties();
		FileInputStream fin = new FileInputStream("D:\\Workspace\\NaveenSelelnium\\src\\PropertiesFiles\\filename.properties");
		
		p.load(fin);
		
		String gg = p.getProperty("str");

		System.out.println(gg);
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(p.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

}
