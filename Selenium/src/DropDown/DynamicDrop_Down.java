package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDrop_Down {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("First Coide");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		/*
		 Until you made a click on from input box
		 you can't select any of the option.
		 we will use dynamic dropdown for this kind of 
		 dropdown
		*/
		
		//Create the Webelement of from input box
	    WebElement FROM =  driver.findElement(By.xpath("//div[@class=\"left1\"]//child::input[@value=\"Departure City\" and @name=\"ctl00_mainContent_ddl_originStation1_CTXT\"]"));
	    
	    //Click on from from input box
		
	    FROM.click();
	    
	    //To clear the input box from
		
	    FROM.clear();
	    
	    //Click on kolkata
	    
	    driver.findElement(By.xpath("//a[contains(text(),' Kolkata (CCU)')]")).click();
		
		
		
		

	}

}
