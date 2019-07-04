package ALERT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasePopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//to click on choose file 
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\abikram2\\Desktop");
		
		
		
		

	}

}
