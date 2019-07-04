package com.orange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	WebDriver driver;

	@FindBy(name ="txtUsername")
	WebElement Username;
	
	@FindBy(name ="txtPassword")
	WebElement Password;
	
	@FindBy(name ="Submit")
	WebElement LoginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	/**
	 * Done by Bikram
	 * Login page user name 
	 */
	public void UserNameEnter()
	{
		Username.sendKeys("Admin");
				 
	}
	/**
	 * Done By Bikram
	 * Login User Password
	 */
	
	public void UsePasswordEnter()
	{
		Password.sendKeys("admin123");
				 
	}
	/**
	 * DOne By Bikram
	 */
	public void LoginButton()
	{
		LoginButton.click();
	}
}
