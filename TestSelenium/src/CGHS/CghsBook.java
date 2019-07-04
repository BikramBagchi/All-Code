package CGHS;

import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CghsBook extends Method {

	public static void main(String[] args) throws InterruptedException {
		Method MethodClassRef = new Method();
		System.out.println("First Coide");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cghs.nic.in/");
		driver.manage().window().maximize();
		
		//To check the title
		String Title = driver.getTitle();
		
		//To print the title
		System.out.println("Web Page title is--  "+Title);
		
		//For Log in 
		MethodClassRef.SingleClick(driver, "//a[@class=\"active\"]/b");
		
		//To click in signout
		MethodClassRef.SingleClick(driver, "//input[@name=\"signout\"]");
		
		//to click on Book Appointment
		MethodClassRef.SingleClick(driver, "//b[text()='Book Appointment']");
		
		// It will return the parent window name as a String
		String mainWindow=driver.getWindowHandle();
		System.out.println("Parent window name --  "+mainWindow);
		
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		 Set<String> set =driver.getWindowHandles();
		
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext()){
		 String childWindow=itr.next();
		 if(!mainWindow.equals(childWindow)){
		 driver.switchTo().window(childWindow);
		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		
		
		 //driver.close();*/
		 
		 //Wait time 
		 Thread.sleep(5000);
		 
		 //To enter the BENEFICIARY ID
		 MethodClassRef.ToSendInput(driver,"5663540", "//input[contains(@placeholder,\"Enter Beneficiary Id\")]");
		 
		 //Click on generated OTP
		 MethodClassRef.SingleClick(driver, "//input[@name=\"otpBut\"]");
		 
		/*
		 This line will create input box for OTP and will 
		  return the OTP values
		*/
		 String OTPvalue = MethodClassRef.InputBoxCreation();
		 		 
		 Thread.sleep(20000);
		 
		 /* 
		  
		  This method will be use for send the OTP
		  the we will give in INPUTBOX
		 
		  */
		 MethodClassRef.ToSendInput(driver,OTPvalue,"//input[@name=\"otp\"]");
		
		//Clicking on Proceed
		MethodClassRef.SingleClick(driver, "//input[@value=\"Proceed \"]");
		
		Thread.sleep(5000);
		
		//Clicking on Proceed for next page 
		MethodClassRef.SingleClick(driver, "//input[@name=\"continue\"]");
		
		Thread.sleep(5000);
		
		//Inputbox for doctor list and selection from drop dwon
		
		/*Select test1 = new Select(driver.findElement(By.xpath("//select[@name=\"spec_name\"]")));
		test1.selectByValue("arnab02");
		*/
		
		/*
		 This method will select the doctor list
		 as provided in the inputbox
		 */
		MethodClassRef.DoctorNameSelection(driver);
		
		Thread.sleep(10000);
		
		//Click on Proceed
		MethodClassRef.SingleClick(driver, "//input[@value=\"PROCEED\"]");
		
		Thread.sleep(10000);
		
		WebElement webpagemonthname = driver.findElement(By.xpath("//div[@class=\"fc-center\"]/h2"));
		
		String stringwebpagemonthname = 
				webpagemonthname.getAttribute("innerHTML");
		
		System.out.println("curr - "+stringwebpagemonthname);
		
		String Currentmonthname = MethodClassRef.monthname();
		
		System.out.println("web - "+stringwebpagemonthname);
		
		if(stringwebpagemonthname.contentEquals(Currentmonthname))
		{
			System.out.println("agk =  "+stringwebpagemonthname);
		}
		
		else
		{
			System.out.println("Gapjal");
		}
		
		//To get the value of available 
		String AvialbleList123 = MethodClassRef.AvialbleList();
				
		// click on available by taking the value of input box
        MethodClassRef.SingleClick(driver, "//span[contains(text(),'Available ("+AvialbleList123+")')]");
		
		//WebElement Appoimentdate = driver.findElement(By.xpath("//span[text()='//span']//parent::div/span[2]"));
		
		//String stringAppoimentdate = Appoimentdate.getAttribute("innerHTML");
		
	//	System.out.println(stringAppoimentdate);
		
	     String a = MethodClassRef.timetorecord();
		
		float InputboxvalueinInterger = Float.parseFloat(a);	
		
		if (InputboxvalueinInterger == 7.30)
		{
			MethodClassRef.SingleClick(driver, "//a[text()='07:30 AM']/h4");
			
		}
		
		else if(InputboxvalueinInterger == 8.00)
		{
			MethodClassRef.SingleClick(driver, "//a[text()='08:00 AM']/h4");
		}
		
		else if (InputboxvalueinInterger == 8.30)
			
		{
			MethodClassRef.SingleClick(driver, "//a[text()='08:30 AM']/h4");
		}
		 
		else if (InputboxvalueinInterger == 9.00)
		{
			MethodClassRef.SingleClick(driver, "//a[text()='09:00 AM']/h4");
		}
	
		else if (InputboxvalueinInterger == 9.30)
		{
			MethodClassRef.SingleClick(driver, "//a[text()='09:30 AM']/h4");
		}
		else if(InputboxvalueinInterger == 10.00)
		{
			MethodClassRef.SingleClick(driver, "//a[text()='10:00 AM']/h4");
		}
		else if (InputboxvalueinInterger == 10.30)
		{
			MethodClassRef.SingleClick(driver, "//a[text()='10:30 AM']/h4");
		}
		else if (InputboxvalueinInterger == 11.00)
		{
			MethodClassRef.SingleClick(driver, "//a[text()='11:00 AM']/h4");
		}
		else if (InputboxvalueinInterger  == 11.30)
		{
			MethodClassRef.SingleClick(driver, "//a[text()='11:30 AM']/h4");
		}
		else if (InputboxvalueinInterger  == 12.00) 
		{
			MethodClassRef.SingleClick(driver, "//a[text()='12:00 AM']/h4");
		}
		 
		else if (InputboxvalueinInterger == 12.30) 
		{
			MethodClassRef.SingleClick(driver, "//a[text()='12:30 AM']/h4");
		}
		
		else if (InputboxvalueinInterger == 1.00) 
		{
			MethodClassRef.SingleClick(driver, "//a[text()='13:00 AM']/h4");
		}
		
		else
		{
			System.out.println("Enter a correct time");
		}
		 
		 }
}
		 
	}
	
}



		 
