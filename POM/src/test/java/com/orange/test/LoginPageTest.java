package com.orange.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.pages.DBPage;
import com.orange.pages.LoginPage;
import com.orange.util.BrowserFactory;

public class LoginPageTest 
{

	WebDriver driver ;
	
	LoginPage loginPage;
	
	DBPage DashboardPage;
	
	BrowserFactory browserFactory;
	
	@BeforeMethod
	public void BrowserOpen()
	{
		browserFactory.OpenBrowser();
		
	}	
	
	@Test(enabled = true)
	public void login()
	{
		
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.UserNameEnter();
		
		loginPage.UsePasswordEnter();
		
		loginPage.LoginButton();
		
		DashboardPage = PageFactory.initElements(driver, DBPage.class);
		
		DashboardPage.PageTitle();
		
		
	}
	

	
	
	
}
