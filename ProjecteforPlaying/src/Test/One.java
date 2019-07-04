package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One extends two {

	
	
	public static void main(String[] args) throws InterruptedException, Exception 
	
	{
	    WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		
		Thread.sleep(5000);
		
		TakesScreenshot shot = ((TakesScreenshot)driver);
		File scrfile = shot.getScreenshotAs(OutputType.FILE);
		File des = new File(",/ProjecteforPlaying/Excel/sss.png");
		FileUtils.copyFile(scrfile, des);
		
	}

	
	
	
}
