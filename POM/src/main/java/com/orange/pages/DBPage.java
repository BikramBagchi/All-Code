package com.orange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DBPage
{

	WebDriver driver;
	
	String ExpectedTitle = "OrangeHRM";
	
	public DBPage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	public Boolean PageTitle()
	{
		
		WebDriverWait wait = new WebDriverWait(driver , 20);
		wait.until(ExpectedConditions.titleContains(ExpectedTitle));
				
		String Actual = driver.getTitle();
		
		if (Actual.equals(ExpectedTitle))
			
			return true;
		else
			
			return false;
		
	}
}
