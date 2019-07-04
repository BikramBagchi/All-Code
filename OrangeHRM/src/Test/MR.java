package Test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MR extends Util

{
	public WebDriver driver ;
	
	Util ref = new Util();
	
	public void Property()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		ref.OpenURl(driver, "https://opensource-demo.orangehrmlive.com", 20);
		
	}
	
	public void Validlogin() throws Exception
	{
		
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		Thread.sleep(5000);
		String Expected = "OrangeHRM";
		String Actual = driver.getTitle();
		//Assert.assertEquals(Actual, Expected);
		Assert.assertTrue(Actual.equals(Expected));
}

	public void closebrowser() throws Exception
	{
		Thread.sleep(1000);
		driver.close();
	}
	
	public void invalidlogin() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin1");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("InvalidPassword"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		String Expected = "Invalid credentials";
		String Actual = driver.findElement(By.xpath("//span[@id=\"spanMessage\"]")).getAttribute("innerHTML");
		
		Assert.assertTrue(Actual.equals(Expected), "Pass");
	}
	
	public void WithoutUserName()
	{
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		String Expected = "Username cannot be empty";
		String Actual = driver.findElement(By.xpath("//span[@id=\"spanMessage\"]")).getAttribute("innerHTML");
		
		Assert.assertTrue(Actual.equals(Expected));
		
	}
	
	public void adminmodule() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		
		ref.MoveToElement(driver, "//b[text()='Admin']");
	}
	
	public void AddAdminUser() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(5000);
		
		ref.MoveToElement(driver, "//b[text()='Admin']");
		ref.MoveToElement(driver, "//a[contains(text(),'User Management')]");
		//Click on User
		driver.findElement(By.xpath("//a[text()='Users']")).click();
		//Click on Add button
		ref.click(driver, "//input[@value=\"Add\"]");
		//User Role 
		ref.SelectClass(driver, "//select[@id=\"systemUser_userType\"]", "Admin");
		Thread.sleep(5000);
		//Employee Name
		ref.SendKeys(driver, "//input[@id=\"systemUser_employeeName_empName\"]", ref.ReadPropertyFiles("EmployeeName"));
		//Username 
		ref.SendKeys(driver, "//input[@id=\"systemUser_userName\"]", ref.ReadPropertyFiles("Username"));
		//Status 
		//ref.SelectClass(driver, "//select[@id=\"systemUser_status\"]", "Enabled");
		Thread.sleep(5000);
		//Password
		ref.SendKeys(driver, "//input[@id=\"systemUser_password\"]", ref.ReadPropertyFiles("Passwordaaa"));
		//Confirm Password
		ref.SendKeys(driver, "//input[@id=\"systemUser_confirmPassword\"]", ref.ReadPropertyFiles("Passwordaaa"));
		//Click on Save 
		Thread.sleep(5000);
		ref.click(driver, "//input[@value=\"Save\"]");
		Thread.sleep(5000);
		
		
	}
	
	public void deleteUSer() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(5000);
		
		ref.MoveToElement(driver, "//b[text()='Admin']");
		ref.MoveToElement(driver, "//a[contains(text(),'User Management')]");
		//Click on User
		driver.findElement(By.xpath("//a[text()='Users']")).click();
		//click on checkbox of that user
		
		String UserName = ref.ReadPropertyFiles("Username");
		
		WebElement Element = driver.findElement(By.xpath("//a[text()='"+UserName+"']/parent::td/parent::tr/td/input"));
				
		//click on User Checkbox
		ref.click(driver, "//a[text()='"+UserName+"']/parent::td/parent::tr/td/input");
		
		if(Element.isSelected())
		{
			ref.click(driver, "//input[@id=\"btnDelete\"]");
			
			WebDriverWait wait = new WebDriverWait(driver , 10);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id=\"dialogDeleteBtn\"]"))));
			
			ref.click(driver, "//input[@id=\"dialogDeleteBtn\"]");
			
			
		}
		else 
		{
			System.out.println("The given user is not deleted");
		}
				
	}
	
	public void VerifyJobTotle() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()='Admin']");
		//Move to element Job
		ref.MoveToElement(driver, "//a[text()='Job']");
		
		ref.click(driver, "//a[contains(text(),'Job Titles')]");
		
		String Expected = "Job Titles";
		
		WebElement element = driver.findElement(By.tagName("h1"));
		
		String Actual = element.getText();
		
		Assert.assertTrue(Actual.equals(Expected));
		
	}
	
	public void TitleAddFunctionality() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()='Admin']");
		//Move to element Job
		ref.MoveToElement(driver, "//a[text()='Job']");
		
		//Click n Job Title
		ref.click(driver, "//a[contains(text(),'Job Titles')]");
		//Click on Add
		ref.click(driver, "//input[@name=\"btnAdd\"]");
		//Send data to field JobTitle		
		ref.SendKeys(driver, "//input[@name=\"jobTitle[jobTitle]\"]", ref.ReadPropertyFiles("JobTitle"));
		//Send data to field JobDescription 
		ref.SendKeys(driver, "//textarea[@name=\"jobTitle[jobDescription]\"]", ref.ReadPropertyFiles("JobDescription"));
		
		//ref.click(driver, "//input[@name=\"jobTitle[jobSpec]\"]");
		
		Thread.sleep(5000);
		//Handel the window based popup
		//Runtime.getRuntime().exec("./AutoItEXE/JobTitleOrangeHRM.exe");
				
		Thread.sleep(5000);
		//Send data to filed Notes
		ref.SendKeys(driver, "//textarea[@id=\"jobTitle_note\"]", "For Test purpose");
		//click on save button 
		ref.click(driver, "//input[@name=\"btnSave\"]");
		
	}
	
	public void deleteTitleJob() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()='Admin']");
		//Move to element Job
		ref.MoveToElement(driver, "//a[text()='Job']");
		
		//Click n Job Title
		ref.click(driver, "//a[contains(text(),'Job Titles')]");
		
		WebElement Element = driver.findElement(By.xpath("//a[contains(text(),'"+ref.ReadPropertyFiles("JobTitle")+"')]//parent::td/parent::tr/td/input"));
		
		if(Element.isSelected())
		{
			ref.click(driver, "//input[@id=\"btnDelete\"]");
			
			WebDriverWait wait = new WebDriverWait(driver , 10);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id=\"dialogDeleteBtn\"]"))));
			
			ref.click(driver, "//input[@id=\"dialogDeleteBtn\"]");
			
			
		}
		else 
		{
			System.out.println("The given user is not deleted");
		}
		
				
		
	}
	
	public void EmploymentStatusmodulelaunching() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()='Admin']");
		//Move to element Job
		ref.MoveToElement(driver, "//a[text()='Job']");
		
		ref.click(driver, "//a[contains(text(),'Employment Status')]");
		
		Thread.sleep(5000);
		
		String Expected = "Employment Status";
        
		WebElement element = driver.findElement(By.xpath("//div[@id=\"search-results\"]/div/h1"));
		
		String Actual = element.getAttribute("innerHTML");
						
		Assert.assertTrue(Actual.equals(Expected));
		
		
	}
	
	public void Verify_Employment_Status_add_functionality() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()='Admin']");
		//Move to element Job
		ref.MoveToElement(driver, "//a[text()='Job']");
		
		ref.click(driver, "//a[contains(text(),'Employment Status')]");
		
		ref.click(driver, "//input[@name=\"btnAdd\"]");
		
		ref.SendKeys(driver, "//input[@name=\"empStatus[name]\"]", ref.ReadPropertyFiles("Add_Employment_Status"));
		
		ref.click(driver, "//input[@value=\"Save\"]");
		
		
	}
  
	public void Verify_Employment_Status_delete_functionality() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()='Admin']");
		//Move to element Job
		ref.MoveToElement(driver, "//a[text()='Job']");
		
		ref.click(driver, "//a[contains(text(),'Employment Status')]");
		
WebElement Element = driver.findElement(By.xpath("//a[contains(text(),'"+ref.ReadPropertyFiles("Add_Employment_Status")+"')]//parent::td/parent::tr/td/input"));
		
		if(Element.isSelected())
		{
			ref.click(driver, "//input[@id=\"btnDelete\"]");
			
			WebDriverWait wait = new WebDriverWait(driver , 10);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id=\"dialogDeleteBtn\"]"))));
			
			ref.click(driver, "//input[@id=\"dialogDeleteBtn\"]");
			
			
		}
		else 
		{
			System.out.println("The given user is not deleted");
		}
		
	}
	
	
	public void Skills_Status_module_launchin() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()='Admin']");
		ref.MoveToElement(driver, "//a[text()=\"Qualifications\"]");
		ref.click(driver, "//a[text()='Skills']");
		Thread.sleep(5000);
		
		WebElement Element = driver.findElement(By.xpath("//div[@id=\"recordsListDiv\"]/div/h1"));
		
		String Actual = Element.getAttribute("innerHTML");
		String Expected = "Skills";
		
		SoftAssert a = new SoftAssert();
		
		a.assertTrue(Actual.equals(Expected));
		
		a.assertAll();
		
		
	}

   public void Verify_Skills_add_functionality() throws Exception
   {
	   driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()='Admin']");
		ref.MoveToElement(driver, "//a[text()=\"Qualifications\"]");
		ref.click(driver, "//a[text()='Skills']");
		ref.click(driver, "//input[@id=\"btnAdd\"]");
		ref.SendKeys(driver, "//input[@id=\"skill_name\"]", ref.ReadPropertyFiles("Add_Skill"));
		ref.SendKeys(driver, "//textarea[@name=\"skill[description]\"]", "Add_Skill_Description");
		ref.click(driver, "//input[@name=\"btnSave\"]");
   }

   public void Verify_Skills_delete_functionality() throws Exception
   {
	   driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()='Admin']");
		ref.MoveToElement(driver, "//a[text()=\"Qualifications\"]");
		ref.click(driver, "//a[text()='Skills']");
		
        WebElement Element = driver.findElement(By.xpath("//a[contains(text(),'"+ref.ReadPropertyFiles("Add_Skill")+"')]//parent::td/parent::tr/td/input"));
		
        Element.click();
        
        Thread.sleep(5000);
        
		if(Element.isSelected())
		{
			ref.click(driver, "//input[@value=\"Delete\"]");
			
				
		}
		else 
		{
			System.out.println("The given user is not deleted");
		}
		
		
   }
   
   public void Employee_List_module_launching() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()=\"PIM\"]");
		ref.click(driver, "//a[contains(text(),\"Employee List\")]");
		
     }

   public void Employee_List_add_functionality() throws Exception
  	{
	   driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
 		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
 		ref.click(driver, "//input[@id=\"btnLogin\"]");
 		
 		Thread.sleep(1000);
 		
 		//Move to element Admin
 		ref.MoveToElement(driver, "//b[text()=\"PIM\"]");
 		ref.click(driver, "//a[contains(text(),\"Employee List\")]");
  		ref.click(driver, "//input[@name=\"btnAdd\"]");
  		Thread.sleep(1000);
  		//First Name 
  		ref.SendKeys(driver, "//input[@name=\"firstName\"]", ref.ReadPropertyFiles("Full_Name"));
  		//Middle Name 
  		ref.SendKeys(driver, "//input[@name=\"middleName\"]", ref.ReadPropertyFiles("Middle_Name"));
  		//Last Name
  		ref.SendKeys(driver, "//input[@name=\"lastName\"]", ref.ReadPropertyFiles("Last_Name"));
  		//Create loging chcekbox
  		ref.click(driver, "//input[@id=\"chkLogin\"]");
  		//User Name
  		ref.SendKeys(driver, "name=\"user_name\"", ref.ReadPropertyFiles("Employee_User_name"));
  		//Password
  		ref.SendKeys(driver, "//input[@id=\"user_password\"]", ref.ReadPropertyFiles("Passwordaaa"));
  		//Conformn Password
  		ref.SendKeys(driver, "//input[@name=\"re_password\"]", ref.ReadPropertyFiles("Passwordaaa"));
  		//Status
  		ref.SelectClass(driver, "//select[@class=\"formInputText valid\"]", "Enabled");
  		//Click on save 
  		ref.click(driver, "//input[@id=\"btnSave\"]");
  	
       }
   
   public void Verify_employee_delete_functionality() throws Exception
   {
	   driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
 		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
 		ref.click(driver, "//input[@id=\"btnLogin\"]");
 		
 		Thread.sleep(1000);
 		
 		//Move to element Admin
 		ref.MoveToElement(driver, "//b[text()=\"PIM\"]");
 		ref.click(driver, "//a[contains(text(),\"Employee List\")]");
 		
 		WebElement Element = driver.findElement(By.xpath("//a[text()='"+ref.ReadPropertyFiles("Last_Name")+"']//parent::td/parent::tr/td/input"));
 		
 		 Element.click();
         
         Thread.sleep(5000);
         
 		if(Element.isSelected())
 		{
 			ref.click(driver, "//input[@value=\"Delete\"]");
 			Thread.sleep(5000);
            ref.click(driver, "//input[@id=\"dialogDeleteBtn\"]"); 				
 		}
 		else 
 		{
 			System.out.println("The given user is not deleted");
 		}
 		
 		
   }
   
   public void Reportmodulelaunching() throws Exception
   {
	   driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()=\"PIM\"]");
		
		Thread.sleep(1000);
		
		ref.click(driver, "//a[@id=\"menu_core_viewDefinedPredefinedReports\"]");
		
   }
   
   public void Verify_Report_add_functionality() throws Exception
   {
	   driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()=\"PIM\"]");
		
		Thread.sleep(1000);
		
		ref.click(driver, "//a[@id=\"menu_core_viewDefinedPredefinedReports\"]");
		
		Thread.sleep(1000);
		
		ref.click(driver, "//input[@name=\"btnAdd\"]");
		
		Thread.sleep(1000);
		
		ref.SendKeys(driver, "//input[@name=\"report[report_name]\"]", ref.ReadPropertyFiles("Report_Name"));
		
		ref.click(driver, "//a[@id=\"btnAddDisplayField\"]");
		
		ref.click(driver, "//input[@id=\"display_group_1\"]");
		
		ref.click(driver, "//input[@id=\"btnSave\"]");
		
   }
   
   
   public void Verify_Report_delete_functionality() throws Exception
   {
	   driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		//Move to element Admin
		ref.MoveToElement(driver, "//b[text()=\"PIM\"]");
		
		Thread.sleep(1000);
		
		ref.click(driver, "//a[@id=\"menu_core_viewDefinedPredefinedReports\"]");
		
		WebElement Element = driver.findElement(By.xpath("//td[contains(text(),\'"+ref.ReadPropertyFiles("Report_Name")+"')]/parent::tr/td/input"));
		
		Element.click();
		
		ref.click(driver, "//input[@name=\"btnDelete\"]");
		
		ref.click(driver, "//input[@id=\"dialogDeleteBtn\"]");
		
		
		
    }
   
   public void Verify_Recruitment_Candidates_module_launching() throws Exception
   {

	    driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		ref.MoveToElement(driver, "//a[@id=\"menu_recruitment_viewRecruitmentModule\"]");
		
		ref.click(driver, "//a[text()='Candidates']");
		
		
   }
   
   public void Verify_Candidate_add_functionality() throws Exception
   {

	    driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		ref.MoveToElement(driver, "//a[@id=\"menu_recruitment_viewRecruitmentModule\"]");
		
		ref.click(driver, "//a[text()='Candidates']");
		
		ref.click(driver, "//input[@id=\"btnAdd\"]");
		
		ref.SendKeys(driver, "//input[@name=\"addCandidate[firstName]\"]", ref.ReadPropertyFiles("Last_Name"));
		
		ref.SendKeys(driver, "//input[@name=\"addCandidate[middleName]\"]", ref.ReadPropertyFiles("Middle_Name"));
		
		ref.SendKeys(driver, "//input[@name=\"addCandidate[lastName]\"]", ref.ReadPropertyFiles("Full_Name"));
		
		ref.SendKeys(driver, "//input[@name=\"addCandidate[email]\"]", ref.ReadPropertyFiles("Email"));
		
		ref.SendKeys(driver, "//input[@name=\"addCandidate[contactNo]\"]", ref.ReadPropertyFiles("Contact_No"));
		
		ref.click(driver, "//input[@id=\"btnSave\"]");
		
		
   }
   
   public void Verify_Candidate_delete_functionality() throws Exception
   {

	    driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		ref.SendKeys(driver, "//input[@name=\"txtPassword\"]", ref.ReadPropertyFiles("Password"));
		ref.click(driver, "//input[@id=\"btnLogin\"]");
		
		Thread.sleep(1000);
		
		ref.MoveToElement(driver, "//a[@id=\"menu_recruitment_viewRecruitmentModule\"]");
		
		ref.click(driver, "//a[text()='Candidates']");
		
		String Candidate = ref.ReadPropertyFiles("Last_Name")+" "+ref.ReadPropertyFiles("Middle_Name")+" "+ref.ReadPropertyFiles("Full_Name")+"";

		WebElement Element = driver.findElement(By.xpath("//input[@id=\"ohrmList_chkSelectRecord_2_\"]"));
		
		Element.click();
		
		ref.click(driver, "//input[@id=\"btnDelete\"]");

        ref.click(driver, "//input[@id=\"dialogDeleteBtn\"]");
   }
   
}   



