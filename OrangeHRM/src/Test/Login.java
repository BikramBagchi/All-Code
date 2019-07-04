package Test;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends MR

{
	
	
	MR ref = new MR();
	
	@BeforeMethod
	public void test()
	{
		ref.Property();
		
	}
	
	@Test(priority = 0 , enabled = true ,groups = "Positive", description = "Verify valid login." )
	public void TC_001() throws Exception
	{
		ref. Validlogin();
	}
	
	@Test(priority = 1 , enabled = true ,groups = "Negative",dependsOnMethods = "TC_001", description = "Verify invalid login.")
	public void TC_002() throws Exception
	{
		ref.invalidlogin();
	}
	
	@Test(priority = 3 , enabled = true ,groups = "Negative",dependsOnMethods = "TC_001", description = "Verify login functionality without credential.")
	public void TC_003()
	{
		ref.WithoutUserName();
	}
	
	@AfterMethod
	public void closebrowser() throws Exception
	{
		ref.closebrowser();
	}
	

}
