package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	
	WebDriver driver;
	
	@BeforeClass
	public void SetProperty()
	{
		Util.Property();
	}
	
	@BeforeMethod
	public void openbrowser()
	
	{
		Util.OpenChrome();
	}
	
	@Test(priority = 0 , enabled = true , description = "Verify valid login." )
	public void TC_001()
	{
		MR.OpenOrangeHRM();
	}
	
	@AfterMethod
	public void close()
	{
		MR.closechrome(driver);
	}
	

}
