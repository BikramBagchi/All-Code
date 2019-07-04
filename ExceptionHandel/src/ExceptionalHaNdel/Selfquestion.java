package ExceptionalHaNdel;

public class Selfquestion {

	

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Hobe ki hbe na ");
			
			int i = 1/0;
			
			System.out.println("Hobe ki hbe na ");
			
			int j = 5;
			
			System.out.println("Hobe ki hbe na ");
			
			throw new Exception("bal");
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
			System.out.println(e.getStackTrace());
			
			e.printStackTrace();
		}

	}

}
