package ACTIONCLASS;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToGetOffSetOfAnElement {

	public static void main(String[] args) throws Exception {
		
   		  System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		  
   		  WebDriver driver=new ChromeDriver(); 
		  
   		  driver.manage().window().maximize(); 
		  
   		  driver.manage().deleteAllCookies();
		  
   		  driver.get("https://www.spicejet.com/");
		  
   		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  
   		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		    WebElement Image = driver.findElement(By.xpath("//li[@id=\"header-addons\"]//a[@id=\"highlight-addons\"]"));
	       //Used points class to get x and y coordinates of element.
	      
		    Point classname = Image.getLocation();
	        
		    int xcordi = classname.getX();
	        
		    System.out.println("Element's Position from left side "+xcordi +" pixels.");
	        
		    int ycordi = classname.getY();
	       
		    System.out.println("Element's Position from top "+ycordi +" pixels.");
	        
	        Actions a = new Actions(driver);
	        
	        a.moveByOffset(xcordi, ycordi).perform();
	        
	        Thread.sleep(5000);
	        
	    	        
	        a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'MENU')]"))).perform();
	        
	        Thread.sleep(5000);
		
		  WebElement book = driver.findElement(By.xpath("//a[text()='Book']"));
		  
		  Thread.sleep(5000);
		  
		  a.moveToElement(book, 300, ycordi).perform();
		 
	        
	        
	        
	        
		
		
	}

}
