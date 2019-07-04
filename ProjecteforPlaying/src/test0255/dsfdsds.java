package test0255;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dsfdsds {

	public static void main(String[] args) {
		
	System.out.println("Uploaded photo using AutoIt for imgbb.com");
   	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
 	WebDriver driver = new ChromeDriver();
 	
 	driver.get("https://www.google.com/");
 	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 	driver.manage().window().maximize();
 	driver.findElement(By.name("q")).sendKeys();
 	
 	

	}

}
