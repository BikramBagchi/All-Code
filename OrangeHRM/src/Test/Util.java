package Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Util {

	
	
	
	
	public void OpenURl(WebDriver d ,String URL , int time)
	{
		d.get(URL);
		d.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}
	
	
	public String ReadPropertyFiles(String Key) throws Exception
	{
		Properties p = new Properties();
		FileInputStream fin = new FileInputStream("./data.properties");
		p.load(fin);
		return p.getProperty(Key);
	}
	
	public void SendKeys(WebDriver d, String xpath , String SendKeysValue)
	{
		  d.findElement(By.xpath(xpath)).sendKeys(SendKeysValue);

	}
	
	public void click(WebDriver d , String Xpath)
	{
		WebElement element = d.findElement(By.xpath(Xpath));
		WebDriverWait a = new WebDriverWait(d , 10);
		a.until(ExpectedConditions.elementToBeClickable(element));
		
		if(element.isDisplayed())
		{
			if(element.isEnabled())
			{
				element.click();
			}
		}
	}
		
		
	
	public void MoveToElement(WebDriver d, String Xpath)
	{
		Actions a = new Actions(d);
		WebElement element = d.findElement(By.xpath(Xpath));
		a.moveToElement(element).perform();
	}

	public void SelectClass(WebDriver d , String Xpath , String VisiableText)
	{
		Select seclect = new Select(d.findElement(By.xpath(Xpath)));
		seclect.selectByVisibleText(VisiableText);
	}
	
	/*
	 * public WebElement DeleteElementXpath(WebDriver d , String PropertyFileKey)
	 * throws Exception { WebElement Element =
	 * d.findElement(By.xpath("//a[contains(text(),'"+ref.ReadPropertyFiles(
	 * PropertyFileKey)+"')]//parent::td/parent::tr/td/input"));
	 * 
	 * return Element ; }
	 */
	
	public void ExplictWait(WebDriver dr , String Xpath , int time)
	{
		WebDriverWait d = new WebDriverWait(dr,time);
		d.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath(Xpath))));
	}
	
	public void WaitUntilelemetVisiable(WebDriver d , String Xpath , int time )
	{
		WebDriverWait wait = new WebDriverWait(d , time);
		wait.until(ExpectedConditions.presenceOfElementLocated((By) d.findElement(By.xpath(Xpath))));
		
		
	}
}
