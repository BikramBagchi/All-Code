package StaticAndNonStaticMethod;

public class StaticAndNonStaticMethod {

	int age = 25; //Non static global variable
	static int year = 2019; // Static global variable
	
	public static void main(String[] args) {
		
	//Now how to call static method
		
	//1) by the help of class name
		
		
		StaticAndNonStaticMethod.staticMethod();
	
   // 2) by only write the particular method name
		
		staticMethod();
		
	//Now how to call static variable 
		
	 // 1) By the help of class name
		
		System.out.println(StaticAndNonStaticMethod.year);
		
	  // 2) by only write the particular variable name 
		
		
		System.out.println(year);
		
	// How to call an non ststic method 
		
		StaticAndNonStaticMethod obj = new StaticAndNonStaticMethod();
		
		obj.nonstaticMethod();
		
	// How to call non static variable 	
		
		System.out.println(obj.age);
		
	//Question
		
		//Can I access static method by Using the object reference

	//Answer
		
	    //Yes we can byt java will show an waring
		
		obj.staticMethod();

  //Difference between static and non static method or variable
		
  /* non static - here obj is the reference of object  new StaticAndNonStaticMethod()
  	so all the non static variable and method will giving to the particular 
  	object (ew StaticAndNonStaticMethod() here). So to access this 
  	 Methods or variable we need to call the reference (obj here) of that object 
  	 first 	
	*/	
		
/* static method or variable - Will not given to object. For static method or variable 
 * will get a common memory allocation inside the java that why kit diest't need 
 * any reference because it is not store inside the object like non static
 
  	
 */
	
	}

	
	
	public void nonstaticMethod() //This is Non Static Method
	{
		
		System.out.println("Non Static method");
		
	}
	
	public static void staticMethod()  //This is static method
	{
		
		System.out.println("Static method");
		
	}
	
}

