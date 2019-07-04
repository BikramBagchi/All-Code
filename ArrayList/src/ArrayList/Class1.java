package ArrayList;

import java.util.ArrayList;

public class Class1 {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(20);
		ar.add(30);
		ar.add(40);
		
	//to find the length or size of ArrayList we need to do this 
	 	
	  System.out.println(ar.size());
	  
	    ar.add(50);
	    ar.add(60);
        ar.add(50);//It can have duplicate value or elements
        
	   System.out.println(ar.size());  
	   
	   //In array List we will not define the size of the array
	   //It maintain insertion order means 0,1,2,etc
	   //ArrayList is slow because it is not synchronize 
	   /*It allow random access to fetch the element because 
	    it store the value on the basics of index
	    */
        
	   System.out.println(ar.get(4));//This is used to retrieve the array
	   
	   
		
	}

}
