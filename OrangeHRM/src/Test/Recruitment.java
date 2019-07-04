package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Recruitment 

{

	MR ref = new MR();

	@BeforeMethod
	public void Beforemethod()
	{
		ref.Property();
	}
	
	
	@Test(priority = 0 , enabled = true , description = "Verify Recruitment > Candidates module launching.")
	public void TC_022() throws Exception
	{
		ref.Verify_Recruitment_Candidates_module_launching();
	}
	
	
	@Test(priority = 1 , enabled = true , description = "Verify Recruitment > Candidates module launching.")
	public void TC_023() throws Exception
	{
		ref.Verify_Candidate_add_functionality();
	}
	
	
	@Test(priority = 2 , enabled = true , description = "Verify Recruitment > Candidates module launching.")
	public void TC_024() throws Exception
	{
		ref.Verify_Candidate_delete_functionality();
	}
	
	@AfterMethod
	public void closebrowser() throws Exception
	{
		ref.closebrowser();
	}
}
