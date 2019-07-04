package CallByValueAndCallByReference;

public class CallByValueAndCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		
		int x= 40;
		int y = 50;
		
		obj.p = 700;
		
		System.out.println("p = "+obj.p);
		
		obj.q = 800;
		
		System.out.println("q = "+obj.q);
		
		
		
		System.out.println(obj.testsum(10, 20));//This is called call by value or pass by value
		//where we will pass the value at the time of method calling
		
		obj.swap(obj); //we will call it call by reference 
		//Here we pass the object reference at the time of method calling	
		
		
		System.out.println("After Swaping");
		System.out.println("p = "+obj.p);
		System.out.println("q = "+obj.q);
	
	}


	public int testsum(int a, int b)
	{
		 //a = 60;//if we uncomment them the it will go with this value
		 //b = 70;
		
		int c  = a+b;
		return c;
				
	}

	
	//This is the syntax of value by reference and that is 
	//we need to provide the class name as did below.
   public void swap(CallByValueAndCallByReference t) 
   {
	   //This method is use for data swapping
	   
	  int temp =t.p; //here temp will become 700
	  
	  t.p=t.q; //Now t,p will become 800
	  
	  t.q = temp; // Now t.q will bw 700
	   
   }

}

