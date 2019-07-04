package ExceptionalHaNdel;

public class TryCatch {

	int s = 0;
	
	public static void main(String[] args) {
		try{
			int a = 9/0;
		}
		catch(ArithmeticException e)//Write Ar then press Ctrl+Space 
		
		{
			e.printStackTrace();
			/*It will tell the user about what kind of
			  exceptional is comming but will continue the code
			  with out this method all the output will come
			  but with this the exceptional type message will come in
			  consol part (Output section)
			 */
	
			System.out.println(e.getMessage());
			/*
			 It will give you actual error message like / by zero
			 */
			System.out.println("Catch Perdonal message");
			
			//This portion of catch is called reporting
		}
		 
		System.out.println("Try Catch is complete");
		
		/*
		 In java we can't divided by zero but it will not
		 give any error message immediately until we run
		 the program this type of exceptional is called uncaught 
		 exception
		 */

		 try { TryCatch obj = new TryCatch();
		
		  obj= null;//Reference cancellation 
				
		  System.out.println(obj.s);
		 }
		 catch(Throwable e)
		 /*
		  Here using NullPointerException is a perfect choice 
		  but I have select Throwable e because it is the super class
		  of all exceptional or error handling
		  Now why we if any where we don't know it will give us an 
		  error or exceptional we will this Throwable because it 
		  is the super class both exceptional and error class
		  */
		 {
			 System.out.println(e.getMessage());
			 System.out.println("By throwable");
		 }
		
		 /*
		  If we need to handle error the we will use
		  catch(Error e)
		  {
		  
		  }
		  But I use Throwable everywhere because it help to reduce the '
		  work because which type exceptional or error we don't need to 
		  think
		  */
		 
		 try{
				int m = 5/0;
			}
			catch(Exception e)
		 /*
		  Here we will use the Exceptional in place of ArithmeticException
		  because all the exceptional have super class Exception that why 
		  we can use exception
		  */
		 {
				System.out.println(e.getMessage());
				System.out.println("Exceptional handel");
		 }
		
		 /*
		  Object class is the super class of Throwable class
		  and Throwable class is the super class of 
		  both Error and Exceptional
		  So we can also write 
		  try
		  {
		    body of the code
		  }
		  catch(Object e)
		  {
		    System.out.println(e.getMessage());
		  }
		  and we don't need to worry about exceptional or 
		  error because Object is super class of Throwable
		  class
		  */
	}

}
