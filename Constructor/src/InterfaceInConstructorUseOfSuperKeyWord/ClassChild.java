package InterfaceInConstructorUseOfSuperKeyWord;

public class ClassChild extends ClassPArent {

	public static void main(String[] args) 
	{
		ClassChild obj1 =  new ClassChild();
		
		/*
		 This will going to call the both the class(child and parent
		 default constructor means constructor without any parameter
		 passing
		 */
		
		/*
		  Now how to call the those constructor with passing parameters
		  For this we use super keyword
		 */
	   
		/*
		  A parent class constructor should be call inside the child
		  class constructor  
		*/
	    
		/*
		 We need to specify the parent class constructor or
		 which constructor should be define by super keyword
		 otherwise it will take the default constructor 
		 
		 */
	}

	public ClassChild() {//Child class constructor
		
		super(10,20);
		
		//super(50); At a time we can call only one constructor
		//inside a constructor we cannot have two super keyword
		
		/*This will going to call the parent class
		 constructor with parameter passing 
		*/
		System.out.println("Child class ladkhor ami kiucchu hbe na ");
				
	}
	
	public ClassChild(int m , int n )
	{
		super(10,20);
		System.out.println(m);
		System.out.println(n);
	}
	}
