package WebCalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PickTodayDate {

	public static void main(String[] args) throws Exception {
		
		
		
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  
		  //Getting current date Calendar cal = Calendar.getInstance();
		  
		  Calendar cal  = Calendar.getInstance();
		  
		  
		  System.out.println(cal);
		  
		  //Displaying current date in the desired format String Current_Date =
		  sdf.format(cal.getTime());
		  
		 
		  
		  //Number of Days to add cal.add(Calendar.DAY_OF_MONTH, 10);
		  
		  String New_Date = sdf.format(cal.getTime());
		  
		  System.out.println(New_Date);
		  
		  
		  String[] s = New_Date.split("-");
		  
		  System.out.println(s);
		  
		  String Manual_Enter_Date = "03/06/2019";
		  
		  cal.setTime(sdf.parse(Manual_Enter_Date));
		  
		  cal.add(Calendar.DAY_OF_MONTH, 7);
		  
		  String tt = sdf.format(cal.getTime());
		  
		  System.out.println(tt);
		 
        
		
		   String Date = "20/2/2019";
		    cal.setTime(sdf.parse(Date));
		    cal.add(Calendar.DAY_OF_MONTH, 10);
		    String Date_Afetr_ADD = sdf.format(cal.getTime());
		    System.out.println(Date_Afetr_ADD);
		
		
		
		   
		
		
		

	}

}
