package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)
	
	{
		
		//DragAndDrop.draganddropbymethodone();
		
		DragAndDrop.draganddropbymethodtwo();
		
	}
	
	public static void draganddropbymethodone()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				
		WebElement Elelment1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		
		driver.switchTo().frame(Elelment1);
		
		Actions action = new Actions(driver);
		
		WebElement Traget = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		/*
		 Traget  = is the element that we need to drag and drop
		 */
		
		WebElement Source = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		/*
		 Source = Destination where need to drop the element
		 */
		
		action.clickAndHold(Traget).moveToElement(Source).release().build().perform();
		
		/*
		 clickAndHold will help in click and hold the element
		 
		 when we move to that element the we need to release that 
		 element so for that we will use release() method.
		 */
		
		driver.quit();
	}

	public static void draganddropbymethodtwo()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				
		WebElement Elelment1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		
		driver.switchTo().frame(Elelment1);
		
		Actions action = new Actions(driver);
		
		WebElement Traget = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		/*
		 Traget  = is the element that we need to drag and drop
		 */
		
		WebElement Source = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		/*
		 Source = Destination where need to drop the element
		 */
		
		
		action.dragAndDrop(Traget, Source).build().perform();
		/*
		 Here we will use a direct method to drag and drop a particuler element
		 by Actions class 
		 */
	}
}
