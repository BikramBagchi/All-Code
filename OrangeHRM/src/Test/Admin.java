package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Admin
{
	MR ref = new MR();

	@BeforeMethod
	public void Beforemethod()
	{
		ref.Property();
	}
	
	@Test(priority = 0 , enabled = true , description = "Verify Admin module launching.")
	public void TC_004() throws Exception
	{
		ref.adminmodule();
	}
	
	@Test(priority = 1 , enabled = true , dependsOnMethods = "TC_004" , description = "Verify user add functionlity.")
	public void TC_005() throws Exception
	{
		ref.AddAdminUser();
	}
	
	@Test(priority = 2 , enabled = true , dependsOnMethods = "TC_005" , description = "Verify user delete functionlity.")
	public void TC_006() throws Exception
	{
		ref.deleteUSer();
	}
	
	@Test(priority = 3 , enabled = true ,description = "Verify Admin > Job > Job Title module launching.")
	public void TC_007() throws Exception
	{
		ref.VerifyJobTotle();
	}
	
	@Test(priority = 4 , enabled = true,dependsOnMethods = "TC_007" ,description = "Verify Job Title add functionality.")
	public void TC_008() throws Exception
	{
		ref.TitleAddFunctionality();
	}
	
	@Test(priority = 5 , enabled = true,dependsOnMethods = "TC_008" ,description = "Verify Job Title delete functionality.")
	public void TC_009() throws Exception
	{
		ref.deleteTitleJob();
	}
	
	@Test(priority = 6 , enabled = true,description = "Verify Admin > Job > Employment Status module launching.")
	public void TC_010() throws Exception
	{
		ref.EmploymentStatusmodulelaunching();
	}
	
	@Test(priority = 7 , enabled = true,dependsOnMethods = "TC_010",description = "Verify Employment Status add functionality.")
	public void TC_011() throws Exception
	{
		ref.Verify_Employment_Status_add_functionality();
	}
	
	@Test(priority = 8 , enabled = true,dependsOnMethods = "TC_011",description = "Verify Employment Status delete functionality.")
	public void TC_012() throws Exception
	{
		ref.Verify_Employment_Status_delete_functionality();
	}
	
	@Test(priority = 9 , enabled = true,description = "Verify Admin > Qualification > Skills Status module launching.")
	public void TC_013() throws Exception
	{
		ref.Skills_Status_module_launchin();
	}
	
	@Test(priority = 10 , enabled = true,dependsOnMethods = "TC_013",description = "Verify Skills add functionality.ion > Skills Status module launching.")
	public void TC_014() throws Exception
	{
		ref.Skills_Status_module_launchin();
	}
	
	@Test(priority = 11 , enabled = true,dependsOnMethods = "TC_014",description = "Verify Skills delete functionality.")
	public void TC_015() throws Exception
	{
		ref.Verify_Skills_delete_functionality();
	}
	
	
	
	@AfterMethod
	public void close() throws Exception
	{
		ref.closebrowser();
	}
}
