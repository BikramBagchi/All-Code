package OrangeHRM;

import org.openqa.selenium.WebDriver;

public class MR {

	static WebDriver driver;
	
       public static void OpenOrangeHRM()
       {
    	   Util.OpenURL(driver, "https://opensource-demo.orangehrmlive.com", 10);
       }
	
       public static void closechrome(WebDriver d)
       {
    	   d.close();
       }
}
