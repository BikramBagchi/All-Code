package ACTIONCLASS;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OffsetMOveToElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  driver.manage().deleteAllCookies();
		  driver.get("https://www.spicejet.com/");
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  WebElement e = driver.findElement(By.xpath(
		  "//li[@id=\"header-hamburger-menu\"]//a[@id=\"highlight-addons\"]"));
		  
		  Actions a = new Actions(driver);
		  
		  //a.moveByOffset(10000, -300).perform();
		  
          String offsetTop = e.getAttribute("offsetTop");
		  
		  System.out.println(offsetTop);
		  
		  String OffsetLeft = e.getAttribute("OffsetLeft");
		  
		  System.out.println(OffsetLeft);
		  
		  
		}

}
