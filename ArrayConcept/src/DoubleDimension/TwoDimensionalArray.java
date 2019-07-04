package DoubleDimension;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		
		/*
 		 The outer loop can be considered as the starting of a month.
         The inner loop can be considered as the days if that month.
         When a month starts i.e. the outer loop is read by the system, 
         the control enters the inner loop. It executes it completely
         ( i.e. for all 31 days). It then goes back to the outer loop.
         For me, the outer loop marked the starting of January, followed
         by the happenings of all the 31 days(inner loop). Then the month
         was changed to February(control goes back to outer loop)
         Following this approach the above example can be understood 
         precisely.
		 */

		String twodarray[][] = new String[2][3];
		
        //Below one will give me the total number of rows
		
		System.out.println(twodarray.length);
		
		//Below one will give me the total number of columns
		
		System.out.println(twodarray[0].length);
		
		//1st row
		
		twodarray[0][0]="a";
		twodarray[0][1]="b";
		twodarray[0][2]="C";
		
		//2nd Row
		
		twodarray[1][0]="d";
		twodarray[1][1]="e";
		twodarray[1][2]="f";

		/*Print all the values of 2D array by for loop
	      we will use 2 loop*/	
		
		for (int row = 0; row<twodarray.length;row++)	
		{ 
			System.out.println("Row = "+row );
          
			for(int col = 0; col<twodarray[0].length;col++)
        	  
				//System.out.println("Column = " );
          {
		System.out.println("for "+row+ ""+col+"="+ twodarray[row][col]);
		   
          }

}
	
	}
}

		
	/*  *
	    **
	    ***
	    ****
	    ***** 
	
	 int testpatternrow = 5;

     for(int i = 1; i <= testpatternrow; ++i) {
    	 System.out.println(i);
         for(int j = 1; j <= i; ++j) {
        System.out.println(j);
             System.out.print("* ");
         }
         System.out.println();
}
      
     
      1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
      
      
	
	int testpatternrowtwo = 5;

    for(int i = 1; i <= testpatternrow; i++) {
    	 
    	System.out.println(i);
    	
        for(int j = 1; j <= i; j++) {
        	
        	System.out.println("Value of j");
        	   
        	System.out.println(j);
        	
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
}

*/