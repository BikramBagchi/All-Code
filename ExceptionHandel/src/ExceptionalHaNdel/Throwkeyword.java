package ExceptionalHaNdel;

public class Throwkeyword {

	public static void main(String[] args) {
		
		/*
		 What is throw key word
		 */
	    /*
	     What is the difference between throws and throw
	     important interview questrion
	    */
		/*
		 When we need to create our own exceptional we use 
		 throw keyword
		 */
		System.out.println("Test001");
		try {
			
		
		throw new Exception("Bikram Exception"); 
		
		//System.out.println("Hobe ki hbe na "); // can't add anything after throw
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Test002");
		
	}

}
