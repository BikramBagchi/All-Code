package MemoryManagemen;

public class Test {

	public static void main(String[] args) {
		
		// This is complete JRE java runtime environment
		/*
		 Java Memory is divided into four part first one is 
		 Heap Memory, Permanent generation  and other one is stack memory
		 */
		
		/*
		 Heap memory is divided in three parts and they are 
		 1)Young generation
		   
		   It have three part 
		   1) Eden Memory - All the object that we create are kept 
		      in this eden memory.
		      So when we have to test a big application normally 
		      lots of objects will be made and all of them can't 
		      stay inside the eden memory as it also have some 
		      specify space or the space is filled up.Then Garbage 
		      collector will be called and the garbage collector is 
		      called as Minor GC will be performed automatically. It 
		      shifted some object to Survivor Memory S0 and once 
		      Survivor Memory S0 is filled then it will send to 
		      Survivor Memory S1.
		      		   
		   2) Survivor Memory S0
		   3) Survivor Memory S1
		   
		    
		 2)Old generation
		   
		   When Survivor Memory S0 and Survivor Memory S1 is filled
		   then all the new object are kept in old generation and when 
		   old generation is filled then Major garbage collection is 
		   called and it took long time.
		   Some time some web site give us time out error it is 
		   because of major garbage collection.
		   
		 3) Memory pool 
		    it is used to store all immutable objects String Class and 
		    String pool at run time and it will be define at the run time
		    by JVM Memory management. In simple word it store all
		    the string class object and string pool    
		    
		    Heap Memory in sort 
		    1) Store objects
		    2) JRE class
		    3) Garbage collection runs on heap memory only to free some 
		       memory by destroying some object which don't have any referance
		       
		        class ref = new class();
		        ref = null;
		        This object will be deleted as the object is without
		        the reference.
		    4) Heap memory is large than stack memory in term of 
		       size    
		*/
		
		
		/*
		 Stack memory 
		 
		 1)Used to execute thread 
		 2)Store method specified values 
		   Public void tset()
		   {
		     int i = 12;
		   }
		   this will be store in stack memory 
		 3)Object reference are used to store.Object are store 
		   in heap memory and their reference are store in stack.
		 4)In stack memory it follow LIFO (Last In First Out)
		 5) It size is less than heap memory
		 
		 Permanent generation 
		  
		  Meta data store here that is what kind of class and 
		  what kind of method are their.It will generated at 
		  the run time.
		  
		   We have method area in Permanent generation and it is
		   used to store complete class structure, all static 
		   variable , constant 
		   
		   Run time constant pool is a part of method area and which is
		    use to store static variable and constant pool
		   
		 */
		
	//The above all is called java memory management
	
	}

}
