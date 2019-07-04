package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubjenduAssigment {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String Title = "Web Table Elements";
		
		String Search_Name = "YES Bank Ltd.";
		
		WebDriverWait wait  = new  WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(Title));
		
	try {
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]/a"));
						
		int list_size = list.size();
		
		System.out.println("The size of the list is  "+list_size);
		
		for (int i = 0 ; i<list_size ; i++)
		{
			WebElement element = list.get(i);
			//String list_String = element.getAttribute("innerHTML");
			String list_String = element.getText();
			if(Search_Name.equals(list_String))
			{
				int y = i+1;
				
				WebElement element2 = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+y+"]/td[4]"));
							
				String Value = element2.getText();
				
				System.out.println("Current Price for "+list_String+" is "+Value);
								
				break;
				
			}
			
			   else 
			   { 
				   System.out.println(" Company = "+Search_Name+ " not found");
			   }
				 
					
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	
}
