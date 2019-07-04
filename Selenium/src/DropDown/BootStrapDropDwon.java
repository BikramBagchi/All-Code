package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDwon {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("First Coide");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		String vrify = "New Delhi, India";
		
		//Create the Webelement of from input box
	    WebElement FROM =  driver.findElement(By.xpath("//input[@id=\"hp-widget__sfrom\"]"));
	      
	    // First we have to click on menu item then only dropdown items will display
	    
	      FROM.click();
	      
	      FROM.clear();
	      
	            
	    // Dropdown items are coming in <a> tag so below xpath will get all
	    
	       // elements and findElements will return list of WebElements
	 
	       List<WebElement> list =  driver.findElements(By.xpath("//div//p//child::span[@class=\"autoCompleteItem__label\"]"));
	       
	       int listsize = list.size();
	       
	       System.out.println(listsize);
	       
	       for(int i=0 ; i<listsize ;i++)
	    
	    	   	   
	       {
	    	   System.out.println(i);	   
	    	  
	    	   WebElement ele = list.get(i);
	    	   
	    	   String strele = ele.getAttribute("innerHTML");
	    	   
	    	   System.out.println(strele);
	    	   
	    	     if (strele.contentEquals(vrify))
	    	    	{		 
	    			 
	    		      ele.click();
	    		     
	    	    	}
	    	          else
 		              {
	    	    	     System.out.println("Wrong Attempt");
 		               }
	    		    
	     }
	       
	
	}


}
