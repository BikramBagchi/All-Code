package OOPConcept;

public class FunctionInJava2 {

	public static void main(String[] args) {
		// Main Method is static
		//Here main is a method to create another method in this 
		//you will get error as 
		//Illegal modifier for parameter method; only final is permitted
	    // Main method is starting excaution point
		//Java compiler will check is method is their or not if their then it will go forward
		//If nothing is inside the main method then nothing will 
		//happen
		
		//Creating a object of FunctionInJava2
		
		
		FunctionInJava2 obj1 = new FunctionInJava2();
			
		int result = obj1.division(10, 2);
		
		//here obj1 is object variable
		
		System.out.println(result);
		
		System.out.println(obj1.Method2());
		
		obj1.Method1();
		
	}
	
	//This class is for NonStatic method
	
	//Method creation
	
	//reutrn type = void
	
	public void Method1() //Here Method1() meand method name
	{
		System.out.println();
	}
	
	//This method will give as a output
	//reutrn type = int
	public int ReturnMethod()
	
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;//we will mselect the data type according to c 
		//i.e what c is returng so here it is returing in int that why
		//int
	}

	//For void we doesnot need to return any value
	//that means for Method1 the reutrn type is void
	// and void does not return any value
	
	public String Method2()
	{
		String s = "abc";
		
		return s;
	}

   //x and y called as input parameter / argument
	public int division(int x , int y)
	{
		int d = x/y;
		
		return d;
				
	}
	
 
}



