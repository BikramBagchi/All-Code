package Forloops;

public class forlooping {

	public static void main(String[] args) {
		
	
	for (int i=10;i>=0;i-- ) //for(intilization ; condition ; incremnent/decrement)
	{
		System.out.println(i);
				
	}
	
	//Here we will do the intilization part first
	//Then we set the condition 
	//then increment or decrement 
	
	System.out.println("************************************");
	
	int a = 10;
	
	System.out.println("First a = "+a);
	//a = 10
	// now a will be 11
	
	int b = a++; // post increment
	
	// now a value is assign to b AND AS b = a++
	// as b is equal to 10+1 =11
	// b = 10
	
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("*******************************");
	
	//preincreament 
 	
	int c = 10;
	int d = ++c;
	
	System.out.println(c);
	System.out.println(d);
	}

}
