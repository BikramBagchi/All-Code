package WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		
		//Here we will study about data conversation
		/*
		 
		 That is we can convert the String value to 
		 Integer.
		 		  
		 */
		
		String k = "200";
		System.out.println(k+200); 
		/* Here the output will be 200200
		 as it is done by concat
		*/
	   //Now we will convert string to integer
		
		int i = Integer.parseInt(k);
		System.out.println(i+200);
		
		/*
		 Here we have use the Integer wrapper Class and parsInt 
		 Method to convert String to int.
		 */
		
		String l = "20.20";
		System.out.println(l+200);
		double d= Double.parseDouble(l);
		System.out.println(d+200);
		
        /*
          Here we have convert string to double        
          Same could be done for int to String as well
          for other
         */
	 	
		String m = "100A";
		System.out.println(m);
		int f = Integer.parseInt(m);
		
		/*
		 Here it will give us a Exception as
		 java.lang.NumberFormatException: because in String
		 we have 100A now A can't be convert to integer. 
		  */
		 
				
		
	}

}
