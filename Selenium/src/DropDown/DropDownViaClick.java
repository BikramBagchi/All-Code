package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownViaClick {

	public static void main(String[] args) throws Throwable {
		
		System.out.println("First Coide");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		         //click on passenger dropdown
				Thread.sleep(5000);
				
			//	try {
				driver.findElement(By.xpath("//div[contains(@class,\"row1 adult-infant-child\")]"
						+ "")).click();
				//WebElement ramclick = 
			//	}
		/*
		 * catch(Throwable e) { e.printStackTrace(); System.out.println(e.getMessage());
		 * }
		 */				
		/*
		 * //driver.findElement(By.xpath("//div[contains(text(),\"1 Adult\")]")).click()
		 * ;
		 * 
		 * Actions ram = new Actions(driver);
		 * 
		 * ram.moveToElement(ramclick).click().perform();
		 */		
				System.out.println("000");
								
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


