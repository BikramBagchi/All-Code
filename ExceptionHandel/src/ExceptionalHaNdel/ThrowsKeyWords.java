package ExceptionalHaNdel;

public class ThrowsKeyWords {
  
	/*
	 JVM will play the catch portion but throws will terminate the program
	 and we need to put throws ever where we are call this method directly 
	 or indirectly still it will terminate 
	 */
	/*
	 So for at least for one method ar in main class we neeed do perform the 
	 try and catch
	 Remove all method comment out throws ArithmeticException and comment out
	 the try catch part for better understanding 
	 */
	/*
	 We can handel it by provide the try catch in callinfg method as we 
	 did here 
	 */
	public static void main(String[] args) //throws ArithmeticException 
	{
		
		ThrowsKeyWords obj = new ThrowsKeyWords();
		 
		obj.sum();
		/*
		 It will give us an exceptional error
		 */
		
	}

	public void sum() //throws ArithmeticException
	{
		try
		{div();
		
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

    public void div()throws ArithmeticException
    {
    	int a = 9/0;
    	/*
    	 This situation we handle it by try catch
    	 but suppose we have 100000 lines of code and 
    	 we will face exception for 4000 lines of code
    	 for for all those 400 lines of codes it is 
    	 not possible to wirte the try catch that 
    	 why we will use throws to avoid writing
    	 more lines of code.  
    	 */
    	System.out.println("throws  is complete");
    }
}
