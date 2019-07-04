package ConstructorPakage;

public class ConstrucotClass {
	
	//Class instance variables
	
	String name ;
	int age ;
	
	public ConstrucotClass()//Constructor with 0 parameter
	{
		System.out.println("Puro gapjal");
	}

	public ConstrucotClass(int i) // Constructor Overload
	{//Constructor with 1 parameter
		System.out.println("Puro gapjal");
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		
		// 1) Constructor will never return a value
	    // 2) Same name as class
		// 3) Same a s function or method
		// 4) We can overloaded the constructor same like method
		
		//call constructor
		
		ConstrucotClass obj = new ConstrucotClass();
		/* It will call the constructor
		 without any parameter passing*/
		ConstrucotClass obj1 = new ConstrucotClass(10);
		/* It will call the constructor
		 with one parameter passing*/
		ConstrucotClass obj2 = new ConstrucotClass(30,40);
		/* It will call the constructor
		 with two parameter passing*/
		ConstrucotClass obj3 = new ConstrucotClass("Ram",50,"Sam",60);
		
		ConstrucotClass obj4 = new ConstrucotClass(100);
		/*
		 Obj4 and obj1 is same so we can call a same constructor 
		 different time with different call by value
		 */
		System.out.println(obj3.age);
		System.out.println(obj3.name);
		/*
		 Call class variable reference.variable name as 
		 bacause it is not static
		 */
	} 

	public ConstrucotClass(int i , int j)// Constructor Overload
	{//Constructor with 2 parameter
		System.out.println("Puro gapjal");
		System.out.println(i);
		System.out.println(j);
	}
	
	public ConstrucotClass(String name,int age ,String name1,int age1)
	{//Constructor with 4 parameter
		this.name= name;  // this.classvariable = local variable
		this.age = age ; // this.classvariable = local variable
		/*
		 to initialized class variable to local variable we use 
		  this  		
		 */
	
     /*For name1 and age1 we do not need to do this keyword
		because of different name so when we have both class
		 variable and local variable having same name then only
		 we will use this keyword
    	*/ 
	}

}
