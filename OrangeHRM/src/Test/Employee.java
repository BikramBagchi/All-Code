package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Employee

{
	MR ref = new MR();

	@BeforeMethod
	public void Beforemethod()
	{
		ref.Property();
	}

	@Test(priority = 12 , enabled = true,description = "Verify PIM > Employee List module launching.")
	public void TC_016() throws Exception
	{
		ref.Employee_List_module_launching();
		
	}
	
	@Test(priority = 13 , enabled = true,dependsOnMethods = "TC_016",description = "Verify employee add functionality.")
	public void TC_017() throws Exception
	{
		ref.Employee_List_add_functionality();
		
	}
	@Test(priority = 14 , enabled = true,dependsOnMethods = "TC_017",description = "Verify employee delete functionality.")
	public void TC_018() throws Exception
	{
		ref.Verify_employee_delete_functionality();
		
	}
	
	
	
	@AfterMethod
	public void closebrowser() throws Exception
	{
		ref.closebrowser();
	}
}
