package com.orange.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory

{
	
	static WebDriver driver;

	
	public static void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\POM\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
}
