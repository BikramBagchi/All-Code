package WebCalender;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebCalendar {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/?gclid=EAIaIQobChMI39fap-_c4gIVWB0rCh1daQnPEAAYASAAEgIyVfD_BwE");
		
		String title = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
				
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(title));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DAY_OF_MONTH, 10);
		
		String today_plus_10 = sdf.format(cal.getTime());
		
		String todayArray[] = today_plus_10.split("/");
		
		String day = todayArray[0];
		
		System.out.println(day);
		
		 driver.findElement(By.xpath( "//input[@name=\"ctl00$mainContent$view_date1\"]/parent::div/button")).click();
		  
		 Boolean flag = false ;
		 
		 for (int i = 3; i<=6 ; i++) 
		  
		  { for (int y = 1; y<=7 ;y++) 
		  
		    { 
			  WebElement element = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr["+i+"]/td["+y+"]/a"));
		      String date = element.getText(); 
		      		      		      
		      System.out.println(date); 
		      
		      if(date.contentEquals(day))
		      {
		    	  element.click();
		    	  flag = true;
		    	  break;
		      }
		    } 
		    
		   if(flag == true)
		   {
			   break;
		   }
		  }
		 

	}

}
