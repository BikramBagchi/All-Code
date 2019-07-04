package SikliTest1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Test01 {

	public static void main(String[] args) throws Exception
	
	{
		Test01.DragAndDropUsingSikuli("https://jqueryui.com/droppable/", "ScreenshotForSikuli\\DragNDropSource", "ScreenshotForSikuli\\DragNDropTarget");
		
		
	}
	
	private static void  method1() throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Screen screen = new Screen();
		
		Pattern tt = new Pattern("./ScreenshotForSikuli\\UserName.png");
		
		screen.type(tt, "bikram");
		
		
		//driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("bikram");
		
		
	//	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("25269348");
		//driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		Pattern mm = new Pattern("./ScreenshotForSikuli\\Untitled.png");
		
		screen.type(mm, "25269348");
			
		
		Pattern pattern = new Pattern("./ScreenshotForSikuli\\login.png");
		screen.click(pattern);
	
		String currentURl = driver.getCurrentUrl();// to get the current URL 
		
		System.out.println(currentURl);
	}

	public static void DragAndDropUsingSikuli(String URL, String SourceName , String TargetName ) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Screen screen = new Screen();
						
		Pattern Source = new Pattern("./"+SourceName+".PNG");
					
		Pattern Target = new Pattern("./"+TargetName+".PNG");
				
		screen.dragDrop(Source, Target);
		
		
		
	}
	
	public static void DragAndDropUsingSikulitwo(String URL, String SourceName , String TargetName ) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Screen screen = new Screen();
						
		Pattern Source = new Pattern("./"+SourceName+".PNG");
		
		screen.wait(Source, 10);
		
		Pattern Target = new Pattern("./"+TargetName+".PNG");
		
		screen.wait(Target, 10);
		
		screen.dragDrop(Source, Target);
		
		System.out.println(" Source File Name = "+Source.getFilename());
		
		System.out.println(" Target File Name = "+Target.getFilename());
		
		
	}
	
}
