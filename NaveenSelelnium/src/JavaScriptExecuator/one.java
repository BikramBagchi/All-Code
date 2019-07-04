package JavaScriptExecuator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://freecrm.com/");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 WebElement element = driver.findElement(By.xpath("//a[@href=\"https://ui.freecrm.com\"]"));
		
		 //To get the current background color
		 String BackGroundColour = element.getCssValue("backgroundColor");
		 
		 System.out.println(BackGroundColour);
		 
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		 //Highlight particular element
		
		  js.executeScript("arguments[0].style.backgroundColor = 'rgb(0, 200, 0)'"
		  ,element); //here arguments[0] because their is only one element
		  
		  Thread.sleep(5000);
		  
		  //Back to previous condition
		  js.executeScript("arguments[0].style.backgroundColor = '"+BackGroundColour+
		  "'",element);
		  
		  Thread.sleep(5000);
		  
		  //To create border around an element
		  js.executeScript("arguments[0].style.border = '3px solid red'", element);
		  
		  Thread.sleep(5000);
		
		  js.executeScript("window.scrollBy(0,1000)");
		  
		  Thread.sleep(5000);
		 
		 
		 //To click on a element 
		 js.executeScript("arguments[0].click();", element);
		 
		 //Scroll to a particular element currently no9t working
		 		 
		 WebElement Element10 = driver.findElement(By.xpath("//span[contains(text(),\"Register now\")]//parent::a")); 
		 
		 js.executeScript("arguments[0].scrollIntoView();",Element10 );
		 
		// js.executeScript("arguments[0].click();", Element10);
		 
		 System.out.println("Done");
		 
		
		 
	}

}
