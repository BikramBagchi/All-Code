package Abstraction;

public abstract class AbstractClass {
	
	//to define the class abstract we use abstract after public
	/*
	 Mandatory
	 
	 In abstract at least one method should be their 
	 as abstract in nature
	 
	 /*
	  Abstract class can have abstract method and 
	  normal or half partially method
	    
	 */
	
	/*
	 Difference between Abstract class and Interface
	 
	 1) We will use extend for abstract and implements for 
	    interface.
	    
	 2) We can have method where body is not define and
	    also normal method as well as for abstraction 
	    class.
	    We can't define the method in interface       
	 
	 3) We can't made the object of abstract class 
	    and also same go for Interface 
	    
	 4) Static , non static and final variable we can 
	    in Abstract class
	    But in interface face we can only define only
	    Final and static 
	       
	    
	    Understand dynamic polymerphism
	    
	    
	 */
	
	public abstract void abstractmethod();//This is a abstract method
	
	public void nonabstractmethod1()
	{
		 System.out.println("abstractmethod1");
		 
	}
	
	public void nonabstractmethod2()
	{
		 System.out.println("abstractmethod1");
		 
	}
	
    
}