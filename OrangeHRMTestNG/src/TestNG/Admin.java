package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Admin {

	

MR ref = new MR();
	
	
	@BeforeMethod
	public void test()
	{
		ref.Property();
		
	}
	
	/*
	 * @Test(priority = 0 , enabled = true ,groups = "Positive", description
	 * ="Verify Admin module launching.") public void TC_004() throws Exception {
	 * 
	 * ref.adminmodule(); }
	 * 
	 * @Test(priority = 1 , enabled = true ,groups = "Positive",dependsOnMethods
	 * ="TC_004", description = "Verify user add functionlity.")
	 * 
	 * public void TC_005() throws Exception { ref.AddAdminUser(); }
	 * 
	 * @Test(priority = 3 , enabled = true , groups = "Positive", dependsOnMethods
	 * ="TC_005", description = "Verify user delete functionlity." )
	 * 
	 * public void TC_006() throws Exception { ref.deleteUSer(); }
	 */
	
	/*
	 * @Test(priority = 0 , enabled = true , groups = "Positive", description
	 * ="Verify Admin > Job > Job Title module launching.") public void TC_007()
	 * throws Exception { ref.VerifyJobTotle(); }
	 * 
	 * @Test(priority = 1 , enabled = true,description =
	 * "Verify Job Title add functionality.")
	 * 
	 * public void TC_008() throws Exception { ref.TitleAddFunctionality(); }
	 * 
	 * @Test(priority = 2 , enabled = true , description =
	 * "Verify Job Title delete functionality.")
	 * 
	 * public void TC_009() throws Exception { ref.deleteTitleJob(); }
	 */
	
	@Test(priority = 0 , enabled = true , description = "Employment Status module launching." )
	
	public void TC_010() throws Exception
	{
		ref.EmploymentStatusmodulelaunching();
	}
	
	
	@Test(priority = 1 , enabled = true ,dependsOnMethods = "TC_010", description ="Verify Employment Status add functionality.")	
	
	public void TC_011() throws Exception
	{
		ref.Verify_Employment_Status_add_functionality();
	}
	
	@Test(priority = 2 , enabled = true , dependsOnMethods = "TC_011", description = "Verify Employment Status delete functionality.")
	
	public void TC_012() throws Exception
	
	{
		ref.Verify_Employment_Status_delete_functionality();
	}
	
	@AfterMethod
	public void closebrowser() throws Exception
	{
		ref.closebrowser();
	}


}
