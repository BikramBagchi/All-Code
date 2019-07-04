package Typecasting;

public class Overview {

	public static void main(String[] args) {


		/*
		 Type casting is of two type
		 1)Implicate 
		 2) Explicit
		 
		 we use type casting just to change the cast of
		 variable or reference
		 	 
		 */
	
	   	   
	   int s = 100;
	   
	   double b = s;
	   
	   System.out.println(b);
	   
	   /*
	    here we are getting the value of b as 100.0 where as in int we 
	    have gave s = 100
	    
	    this change we call it as implicit casting 
	    where runtime will going to perform casting but it will work only
	    when we put small in large like integer is smaller than double 
	    that why it is working.
	    */
	   
	   double w = 46546.46;
	   
	   int e = (int)w;// Explicit type casting
	   
	   System.out.println(e);
	   
	/*
	 This is called Explicit type casting as it will going to change 
	 the value of  double to integer
	 
	 and format is given above
	 
     here we will cast smaller in larger opposite of implicit casting 
	 */
	   
	
	   char g = 'A';
    
	   Object r = (int)g;
	   
	   //Object is the super class of all the class
	   
	
	}

}
