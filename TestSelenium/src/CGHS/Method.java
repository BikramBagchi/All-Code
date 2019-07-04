package CGHS;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Method extends test2{

	//This Methos is for single click
	public void  SingleClick(WebDriver a , String b)
	{
				
		a.findElement(By.xpath(b)).click();
			
	}
	
	
	//This method is for sending inpute
	public void  ToSendInput(WebDriver a , String c , String d)
	{
				
		a.findElement(By.xpath(d)).sendKeys(c);
			
	}

     // To create input box
	
	public String InputBoxCreation()
	{
		 //to create the inputbox
		 
    	 String OTP;
		 //Inputbox create line 
		 OTP= JOptionPane.showInputDialog("Please prove the OTP ");
		 System.out.println("OTP --  "+OTP);
		 
		 return OTP;
		
	}
	
	public String DoctorlistSelection()
	{
		 //to create the inputbox
		 
    	 String DoctorName ;
		 //Inputbox create line 
    	 DoctorName= JOptionPane.showInputDialog("Please enter doctor no. name from list"
    	 		+ "10.ARNAB SARKAR "
    	 		+ "20.DR K K CHOUDHURY"
    	 		+ "30.NAVIN KUMAR DUBEY"
    	 		+ "40.R MADULI"
    	 		+ "50.SUMAN MALLICK"
    	 		+ "60.SUMITA CHATTOPADHYAY");
    			 
    
    	 		
		 System.out.println("Selected Doctor Name  --  "+DoctorName);
		 
		 return DoctorName;
		
	}
	
     public void DoctorNameSelection(WebDriver a)
     {
    	 Method ref1 = new Method();
    	 
    	 String DoctorNumber = ref1.DoctorlistSelection();
    	 
    	 if(DoctorNumber.equals("10"))
    	 {
    		 Select test1 = new Select(a.findElement(By.xpath("//select[@name=\"spec_name\"]")));
    			test1.selectByValue("arnab02");
    	 }
    	 else if(DoctorNumber.equals("20"))
    	 {
    		 Select test1 = new Select(a.findElement(By.xpath("//select[@name=\"spec_name\"]")));
 			test1.selectByValue("choudhury1");
    	 }
     
    	 else if(DoctorNumber.equals("30"))
    	 {
    		 Select test1 = new Select(a.findElement(By.xpath("//select[@name=\"spec_name\"]")));
 			test1.selectByValue("navin");
    	 }
     
    	 else if(DoctorNumber.equals("40"))
    	 {
    		 Select test1 = new Select(a.findElement(By.xpath("//select[@name=\"spec_name\"]")));
 			test1.selectByValue("rmaduli");
    	 }
    	 else if(DoctorNumber.equals("50"))
    	 {
    		 Select test1 = new Select(a.findElement(By.xpath("//select[@name=\"spec_name\"]")));
 			test1.selectByValue("suman2016");
    	 }
    	 else if(DoctorNumber.equals("60"))
    	 {
    		 Select test1 = new Select(a.findElement(By.xpath("//select[@name=\"spec_name\"]")));
 			test1.selectByValue("sumita3");
    	 }
    
      
     
     
     
     
     }
     
     
   //to create the inputbox
    	
	public String timetorecord()
	{
		String Time;
		 //Inputbox create line 
		 Time= JOptionPane.showInputDialog("Please enter your preference time ");
		 System.out.println("OTP --  "+Time);
		 
		 return Time;
	}
	
	}


