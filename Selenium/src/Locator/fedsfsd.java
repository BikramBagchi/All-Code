package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumUtilPakage.SeleniumUtilClass;

public class fedsfsd {

	public static void main(String[] args)
	
	{

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		SeleniumUtilClass.URL(driver, "https://www.google.com/", 10);

	}

}
