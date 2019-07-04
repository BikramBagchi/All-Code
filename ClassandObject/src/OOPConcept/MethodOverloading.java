package OOPConcept;

public class MethodOverloading {
	
	//we can't create a method inside a method
	//We can't create duplicate methods
			
	/*We can create another main method with different 
	inpute parameter i.e main method can be overload */
			
			
	/*Method overloading is when the method name is same 
	with different argument or input parameters within
	the same class */
	
	//Method overloading is need to done inside a same class
			

	public static void main(String[] args) {
	
		MethodOverloading obj1 = new MethodOverloading();
		/*
		  Here new MethodOverloading() is the object and 
		 obj1 is reference
		 
		 */
		
		obj1.sum();
		obj1.sum(15.22);
		obj1.sum(10);
		obj1.sum(100, 'c');
		obj1.sum(1000, '@', 589.25);
		
				
	}
	
	public void sum() // 0 inpute parameter
	{
		System.out.println("Sum method with 0 input parameters");
	}
	
	public void sum(int k) // 1 inpute parameter
	{
		System.out.println("Sum method with 1 input parameters");
		System.out.println(k);
	}
	
	
	public void sum(double s) // 1 inpute parameter
	//Here (double s) is count as one argument 
	{
		System.out.println("Sum method with 1 input parameters");
		System.out.println(s);
	}
	
	public void sum(int p , char c) // 2 inpute parameter
	
	//Here we will have two argument
	
	{
		System.out.println("Sum method with 2 input parameters");
		System.out.println(p);
		System.out.println(c);
	}
	
	public void sum(int p , char c , double d) // 3 inpute parameter
	
	//Here we will have 3 argument
	
	{
		System.out.println("Sum method with 3 input parameters");
		System.out.println(p);
		System.out.println(c);
		System.out.println(d);
	}

	/*
	 This method will give us an error because 
	 We can't create duplicate methods
	 
	 public void sum(int k) // 1 inpute parameter
	{
		System.out.println("Sem method with 1 input parameters");
		System.out.println(k);
	}
	 
	 */
	public void sum(int p , int q)
	{
		
	}

}

