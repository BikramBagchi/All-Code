package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {
	
	
	public static void Property()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	}
	
	
	
	public static void OpenChrome()
	{
		WebDriver driver = new ChromeDriver();
	}
	
	
	
	public static void OpenURL(WebDriver d , String URL , int timeout)
	{
	  d.get(URL);
	  d.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
	  
	}

}
