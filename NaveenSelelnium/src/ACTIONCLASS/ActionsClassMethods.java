package ACTIONCLASS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/keyboard-mouse-events-files-webdriver.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		action.contextClick(driver.findElement
		(By.xpath("//ul[@class=\"menuside\"]//li//a[contains(text(),'7) Forms & Webdriver')]")))
		.perform();
		/*
		 contextClick method is use for Right Click  Mouse Action
		 
		  we did't use build() method because here we are doing only
		  one Actions 
		
		 */
		
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build().perform();
		
		/*
		 Here we are using this build(0 method because we are performing 
		 more than one operation 
		 */
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		driver.navigate().back();
		
		/*
		 driver.navigate().back(); is use for back in web page 
		 as we do back operation 
		 so to automate the back operation we have to do 
		 driver.navigate().back();
		 
		 */
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).build().perform();
		
		/*
		 keyDown() method is use for press a key and keyUp() method to realease the key 
		 
		 when we need to send a single key like "A" then we have to use a method 
		 call as chord() method
		 
		 */
		
		/*
		 Same way we can use the double click
		 */
		
	}

}
