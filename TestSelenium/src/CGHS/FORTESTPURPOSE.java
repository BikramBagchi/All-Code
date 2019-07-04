package CGHS;

import java.util.Calendar;

public class FORTESTPURPOSE extends test2 {

	public static void main(String[] args) {

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
       

	}

}
