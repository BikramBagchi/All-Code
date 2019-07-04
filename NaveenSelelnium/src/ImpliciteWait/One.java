package ImpliciteWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		/*
	     implicitly wait
	     
	     implicitly wait is a dynamic wait 
	     
		 */
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);// this is global wait
		
		/*
		 Here 50 is seconds and we define it in TimeUnit.SECONDS
		 
		 if the page is fully load in 20 second themn it will ignore 
		 the rest 30 second
		 */
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);// this is also global wait
		
		/*
		 implicitlyWait is for all the element present in the web page
		 
		 Suppose there is a submit button but it took some time to load
		 for that we have to use the implicitlyWait wait but is the element 
		 is viable by 20 seconds then it will not wai for next 30 seconds
		 
		 */
		
		/*
		
		 Two dynamic wait 
		 1) pageLoadTimeout
		 2) implicitlyWait
		
	     */
		
		
	}

}
