package Inheritance;

// Here Extends will work for relation between paren and child
//child class extends parent class
public class Bmw extends Car{//This is called has a relationship
	
	//Method 1
	
	public void start() //This is Over Ridden method
	{
		System.out.println("BMW ----- stsrt");
		
	}

	//Method 2
	
	public void safty()
	{
		System.out.println("BMW ----- safty");
		
	}
	
	public int sum(int x, int y) {
		
		int c = x+y;
		
		return c;
		
	}
	
public int cross(int s, int t) {
		
		Car obj45 = new Car();
		
	int total = obj45.sum(10, 20, 30);
		int d = 100;
		
		int m = d + total + s + t;
	   
		return m;
		
	}
}
