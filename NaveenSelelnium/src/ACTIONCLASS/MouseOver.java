package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Actions action = new Actions(driver);
		
		WebElement Elelment1 = driver.findElement(By.xpath("//li[@id=\"header-addons\"]//a[@id=\"highlight-addons\"]"));
		
		/*
		 Some time we don't need to just move the mouse
		 to a particular element to get the menu list 
		 now we can't click the element 
		 
		 so for that we are using action.moveToElement
		 
		 just to move the mouse point to that particular 
		 element
		 */
		action.moveToElement(Elelment1).build().perform();
		
		
		/*
		 * Thread.sleep(10000);
		 * 
		 * driver.findElement(By.xpath("//a[@href=\"SpiceLounge.aspx\"]")).click();
		 */
		/*
		 When we use build method 
		 
		In your scenario it wont make a difference using both. The difference 
		occurs at place when you have multiple actions to be performed like:

        Actions builder = new Actions(driver); 
        builder.clickAndHold(element1)
        .clickAndHold(element2)
        .click()
        .build()
        .perform();
         in the above code we are performing more than one operations so we 
         have to use build() to compile all the actions into a single step. 
         Thus build() method is used compile all the listed actions into a 
         single step. We use build() when we are performing sequence of operations 
         and no need to use if we are performing single action.
		 */
		
		
	}

}
