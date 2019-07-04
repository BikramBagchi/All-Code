package Question1Answer;

public class Question9and {

	public static void main(String[] args) {
		
	// Question 9 answer
		
		//Statement 1
		
		int i = 10;
		
		System.out.println("Value of i when for 1 statement " +i);
		
		//Statement 2		
		
		int j = i++;
		
		System.out.println("Value of i when for 2 statement " +i);
		System.out.println("Value of j when for 2 statement " +j);
		
		//Statement 3
		int z = ++i;
		
		System.out.println("Value of i when for 3 statement " +i);
		System.out.println("Value of j when for 3 statement " +j);
		System.out.println("Value of z when for 3 statement " +z);
		
		
		//Question 8 .size and .length difference
		
		/*.length
		 length is constant which is used to find out the array
		  storing capacity not the number of elements in the array
		 */
		 
		  int array[] = new int[5];
		  int arrayLength = array.length;
		  System.out.println("Array length "+arrayLength);
		  
		  
		  /* .size
		   number of elements in the array is called size
		   */
		  
		  array[0]=10;
		  array[1]=20;
		  
		  //For size it will show 2 as [0] and [1]
		  
		    
		
	}

}
