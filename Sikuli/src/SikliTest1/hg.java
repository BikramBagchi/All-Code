package SikliTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilPakage.SeleniumUtilMethod;

public class hg {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

		  SeleniumUtilMethod.URL(driver, "https://imgur.com/upload", 10);
		  driver.findElement(By.xpath("//label")).click();
		  Thread.sleep(5000);
		  
		  Runtime.getRuntime().exec("./AutoItexeFile/withoutusecontrolfocus.exe");
		  
		  Thread.sleep(5000);
		
	}

}
