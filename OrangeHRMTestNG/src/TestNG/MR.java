package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class MR {

	
WebDriver driver ;
	
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
		
		Thread.sleep(5000);
		
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
		
		String Expected = "Employment Status";
        
		WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'Employment Status')]"));
		
		String Actual = element.getText();
		
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
		
		WebElement Element = ref.DeleteElementXpath(driver, "Add_Employment_Status");
		
		Element.click();
		
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
	
	
}
