package TestFirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent {
	
	public static void main(String[] args) throws InterruptedException {
		parent parentobj = new parent();
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		parentobj.test(driver, "//a[text()='Sign in']");
	}

	public void  test(WebDriver a , String b)
	{
				
		a.findElement(By.xpath(b)).click();
			
	}

}
