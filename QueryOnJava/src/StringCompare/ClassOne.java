package StringCompare;

public class ClassOne {

	public static void main(String[] args) {
		
		String one = "Sachin";
		String two = "SACHINE";
		String three = "Sachin";
		String four = "Saurav";
		/*
		 Three ways we can compare it
		 1) By equals() method
         2) By = = operator
       
		 */
		
		System.out.println("Equal Condition 1");
		
		// String one equal String two
		
		if (one.equals(two))
		{
			 System.out.println("Well done - Condition 1");
		}
		
		else
		{
			System.out.println("FAke - Condition 1");
		}
		
        System.out.println("Equal Condition 2");
        
        // String one equal String three
		
		if (one.equals(three))
		{
			 System.out.println("Well done - Condition 2");
		}
		
		else
		{
			System.out.println("FAke - Condition 2");
		}
		
		System.out.println("equalsIgnoreCase Condition 1");
		
		// String one equal String two
		
		if (one.equalsIgnoreCase(two))
		{
			 System.out.println("Well done - equalsIgnoreCase Condition 1");
		}
		
		else
		{
			System.out.println("FAke - equalsIgnoreCase Condition 1");
		}
		
		System.out.println("equalsIgnoreCase Condition 2");
		
		// String one equal String three
		
		if (one.equalsIgnoreCase(three))
		{
			 System.out.println("Well done - equalsIgnoreCase Condition 2");
		}
		
		else
		{
			System.out.println("FAke - equalsIgnoreCase Condition 2");
		}
		
         System.out.println("== Condition 1");
		
		// String one equal String two
		
		if (one==two)
		{
			 System.out.println("Well done - == Condition 1");
		}
		
		else
		{
			System.out.println("FAke - == Condition 1");
		}
		
		System.out.println("== Condition 2");
		
		// String one equal String three
		
		if (one==three)
		{
			 System.out.println("Well done - == Condition 2");
		}
		
		else
		{
			System.out.println("FAke - == Condition 2");
		}
		
		  System.out.println("Compare to 1");
			
	
	}  

}
