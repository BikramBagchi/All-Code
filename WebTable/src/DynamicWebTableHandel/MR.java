package DynamicWebTableHandel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MR

{

	public WebDriver driver ;
	
	public void WebTableByList()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		
		String Search_name = "Airi Satou";
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr/td[1]"));
		
		int list_size = list.size();
		
		for (int i = 0; i<list_size;i++)
		{
			WebElement ele = list.get(i);
			
			String Name = ele.getText();
			
			if(Name.equals(Search_name))
			{
				int y = i+1;
				
				WebElement elemen2 = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+y+"]/td[3]"));
				
				String office = elemen2.getText();
				
				System.out.println("name of the employee "+Name+" from office "+office);
			}
			
			
		}
		
		driver.quit();
	}
	
	public void Webtable_Handel_By_loop()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		
		String Search_name = "Airi Satou";
		
		for(int i = 1 ; i<= 10; i++)
		{
			String name = driver.findElement(By.xpath(" //*[@id=\"example\"]/tbody/tr["+i+"]/td[1]")).getText();
	        
			String Office = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+i+"]/td[3]")).getText();
			
			System.out.println("name of the employee "+name+" from office "+Office);
		}
	   
		driver.quit();
	
	}
	
	public void WebTable_Handel_By_DynamicXpath()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.teachmeselenium.com/automation-practice-webtable/");
		
	     driver.findElement(By.xpath("//strong[contains(text(),\"India\")]/parent::td/preceding-sibling::td/input")).click();
		
	     driver.quit();
		
		
		
	}
}
