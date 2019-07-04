package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws Throwable {
		
		//It is also called drop down by select class
		
		System.out.println("First Coide");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//For the drop down CURRENCY we will use the select class
		/*
		 if the element have select and all the option under it 
		 then we will use this select class
		 
		 we will provide the x path of select 
		 */
		
		Select currencydropdown = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"))); 
        
		/*
		 We will use deselect only when we can select more than one 
		 option at a time, so that we can deselect one of them
				 
		currencydropdown.deselectByIndex(0);
		*/
		
		/*
		 we will going to call the method which will going to 
		 select the value by index
		 */
		Thread.sleep(2000);
		currencydropdown.selectByIndex(1);
		
		/*
		 we will going to call the method which will going to 
		 select the value by value
		 */
		Thread.sleep(2000);
		
		currencydropdown.selectByValue("AED");
		
		/*
		 we will going to call the method which will going to 
		 select the value by visable (innerHTML)
		 */
		Thread.sleep(2000);
		
		currencydropdown.selectByVisibleText("USD");
		
		//Dropdown for PASSENGERS
		/*
		 For PASSENGERS here we have to first click on the  down arrow
		 then we have to click on number of child , adult or on 
		 infant to get the result
		*/
		//click on passenger dropdown
		Thread.sleep(2000);
		
		
		/*
		 For this kind of drop down we need to click on adult for 
		 4 time to select adult
		 so by using click four times is waste of time though
		 the process is correct
		 to save time we will use the for loop 
		 */
		for (int i =0; i>10 ; i++)
		
		{
		 driver.findElement(By.xpath("//span[@id=\"spanAudlt\"]//parent::div//child::span[3]"));
		 
		 //To click on + of Adult 
		 WebElement adultvalue = driver.findElement(By.className("paxinfo"));
		 
		 String stringadultvalue = adultvalue.getText();
		 
		 //To check that adult is equal to 4 or not
		 if (stringadultvalue == "4 Adult")
		 {
			//Click on Done
			driver.findElement(By.xpath("//input[@value=\"Done\"]")).click();
		 }
				 
		 
		}

	
	}

}
