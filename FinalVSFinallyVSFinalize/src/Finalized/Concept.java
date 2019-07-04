package Finalized;

public class Concept {
	
	/*
	 Just before the garbage operator we have to call
	 just to clean up processing of the object
	 */

	public static void main(String[] args) {
		
		Concept f1 = new Concept();
		Concept f2 = new Concept();
		
		f1=null;
		/*when f1 become null the object is without reference
		   so when a object is without reference then it will 
		   get destroyed by garbage collection
		*/
		
		System.gc(); //it call garbage collector  
	}

	public void finalize()
	{
		System.out.println("Calling of finalise");
	}
}
