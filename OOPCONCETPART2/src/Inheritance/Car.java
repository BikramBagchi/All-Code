package Inheritance;

public class Car extends Vechile {

	/*This calss is only use for having the 
	 methods that why main method is not needed
	*/
	
	//Method 1
	public void start()
	{
		System.out.println("Start the car");
		
	}
	
	//Method 2
	
	public void stop()
	{
		System.out.println("Stop the car");
	}
	
	//Method 3

	public void refule()
	{
		System.out.println("car refule");
	}
	
public int sum(int x, int y, int z) {
		
		int c = x+y+z;
		
		return c;
}
}
