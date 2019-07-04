package ALERT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEBASEPOPUP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//click on Go
		
		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		
		//to handel web based popup we use this ALERT
		Alert a = driver.switchTo().alert();
		
		/*
		 When ever we have a popup and while inspect on that OK or cancel button
		 then no x path will come that means it have to handel by ALERT. 
		 */
		
		String Popup_Title = a.getText();//getText() is for get the content of popup
		
		System.out.println(Popup_Title);
		
		//this will perform click on ok 
		a.accept();/*
		we need to do .accept because we have no x path that why to click on OK
		will do the work for us.
		*/
		
		a.dismiss();//to click on cancel
		
		a.sendKeys("Gapja");//this is use for send text to text box under the popup 
		
	
		
		
		
		
		
		
		
	}

}
