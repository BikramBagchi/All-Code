package TestFirstSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot  {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	
				TakesScreenshot tk = (TakesScreenshot)driver;
					
					File org = tk.getScreenshotAs(OutputType.FILE);
					
					File des = new File("./Screenshot/screenshotname.png");
					
					FileUtils.copyFile(org, des);
			
		               System.out.println("Done");
		
		
		/*
		 * File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); try {
		 * // now copy the screenshot to desired location using copyFile //method
		 * FileUtils.copyFile(src, new File("C:/selenium/error.png")); }
		 * 
		 * catch (IOException e) { System.out.println(e.getMessage());
		 * 
		 * }
		 */
	}

}
