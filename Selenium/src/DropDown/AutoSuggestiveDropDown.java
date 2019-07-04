package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("First Coide");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		/*
		 Auto Suggestive Drop down is where we will
		 provide some value in the test box and according
		 to that it will provide the drop down option
		*/

		
		//Create the Webelement of from input box
	    WebElement FROM =  driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));
	    
	    //Click on from from input box
		
	    FROM.click();
	    
	    //To clear the input box from
		
	    FROM.clear();
	    
	    //To send Am in the input box
	    
	    FROM.sendKeys("kol");
	    
	    // One Down key to point on Ahmedabad (AMD) 
	    
	    FROM.sendKeys(Keys.ARROW_DOWN);
	    
	    //Enter to select Ahmedabad (AMD)
	    
	    FROM.sendKeys(Keys.ENTER);
	}
}
