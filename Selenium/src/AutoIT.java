import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
		 Robot r = new Robot();
		 
		 r.keyPress(KeyEvent.VK_CONTROL);
		 
		 r.keyPress(KeyEvent.VK_P);
		 
		 
		 
		 

	}

}
