package SpicejetAutomation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class frggdfg {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 System.out.println(date1);
		 
		 String aa[] = date1.split("/");
		 
		 System.out.println(aa[0]);
		 System.out.println(aa[1]);
		 System.out.println(aa[2]);

	}

}
