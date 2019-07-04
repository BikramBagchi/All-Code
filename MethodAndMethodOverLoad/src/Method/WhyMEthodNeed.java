package Method;

public class WhyMEthodNeed {

	public static void main(String[] args) {
		
		//We can't create a method in another method
        //Main is method
		//We can't create any function in main method
	    /*
	     Main method is void because in main method 
	     we never return any statement aS PER JAVA DESIGN
	     */
	   
		WhyMEthodNeed obj = new WhyMEthodNeed();
		
		obj.test();
		obj.test1();
		obj.test2(100000, 456456);
		
	}

	
	//three type of function are their
	
	//1) no input no output
	public void test()
	{
		System.out.println("no inpute no output");
	}
	
	//2) No input but some output
	public int test1()
	{
		int a = 10;
		int b = 20;
		int c =  a +  b;
		System.out.println("No input but some output "+c);
		return c;
		
	}
	
	//3) Some input but some output
	
	public int test2(int a , int b)
	{
		
		int c =  a +  b;
		System.out.println("No input but some output "+c);
		return c;
		
	}
	
}   
