package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Report 

{

	MR ref = new MR();

	@BeforeMethod
	public void Beforemethod()
	{
		ref.Property();
	}
	
	@Test(priority = 0 , enabled = true , description = "Verify PIM > Report module launching.")
	public void TC_019() throws Exception
	{
		ref.Reportmodulelaunching();
	}
	
	@Test(priority = 1 , enabled = true , description = "Verify PIM > Report module launching.")
	public void TC_020() throws Exception
	{
		ref.Verify_Report_add_functionality();
	}
	
	@Test(priority = 2 , enabled = true , description = "Verify Report delete functionality.")
	public void TC_021() throws Exception
	{
		ref.Verify_Report_delete_functionality();
	}
	
	@AfterMethod
	public void closebrowser() throws Exception
	{
		ref.closebrowser();
	}
}
