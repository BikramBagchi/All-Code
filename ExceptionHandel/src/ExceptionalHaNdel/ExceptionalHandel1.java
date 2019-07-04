package ExceptionalHaNdel;

public class ExceptionalHandel1 {

	int b = 20;
	
	public static void main(String[] args) {
		
		//Any thing that going to terminate the program is called exception
		
		//int a =9/0;
		/*
		 It will not give me any immediately error and we call it\
		 uncaught exceptional so we will not understand until we
		 run the code
		 */
		//Thread.sleep(2000);
		/*
		 Now when we will remove the comment out from 
		 Thread.sleep(2000)it will give us an error 
		 now this kind of exception is called
		 caught exception
		 */
		
		
		//It will give us a null pointer exception
		//ExceptionalHandel1 obj = new ExceptionalHandel1();
		
		//obj= null;//Reference cancellation 
		
		//System.out.println(obj.b);
		
	    /*
	      Three different type of exceptional handling
	      1) Try Catch
	         Format is that 
	         try{
	             The exceptional generate part of the code
	            } 
	         catch(type of exceptional e)
	         {
	         }
	         Further continue code
	            
      	     It is also at point of reporting part
      	     
      	   2) Throws Key words
      	      detail in ThrowsKeyWords class
      	   3) throw key word
      	      
      	       
	     */
	
	  
		
	}

}
