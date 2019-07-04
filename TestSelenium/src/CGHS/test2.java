package CGHS;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class test2 {

	
	//to get the current month and to concat it according
	public String monthname() {
		
		String[] monthName = {"January", "February",
                "March", "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December"};
		Calendar cal = Calendar.getInstance();
        String month = monthName[cal.get(Calendar.MONTH)];
        System.out.println("Month name: " + month);
        String mointhcon =" 2019";
        
        String endmonth = month+mointhcon;
        
        System.out.println("Month name: " + endmonth);
       
       
        return endmonth;
	}

	//Available list number
	public String AvialbleList()
	{
	  
	  String availablenoString ;
		
	  availablenoString = JOptionPane.showInputDialog("Enter the number beside Available");
	  
	  	  
	  return availablenoString;
		
	}
	
	//not needed
	public String Availablexpathconcat()
	{
		
		test2 test2ref = new test2();
		
		String store = test2ref.AvialbleList();
		
		String Available = "Available ()" ;
		
		String m = "10";
		
		return m;
	}
	}
	
	

	

