package test0255;

public class Robot {
	
	static int m = 10;

	int h = 20;
	
	
	
	public static void main(String[] args) {
		
		
				
		System.out.println(Robot.m);
		
		int p = 20;
		
		System.out.println(p);
		
		int n = Robot.m;
		
		System.out.println(n);
		
		Robot.name();
		
		Robot e = new Robot();
		
		e.name();
		
		e.name(20);
		
		Parent t = new Child();
		
		t.xxx();
		
		
	}
    
	@overloaded 
	public static void name()
	{
		System.out.println("FailToFind");
		
		int k = Robot.m;
		
		System.out.println(k);
		
		Robot e = new Robot();
			
	}
	
	@overloaded 
	
	public static void name(int l)
	{
		System.out.println("FailToFind");
		
		int k = Robot.m;
		
		int p = l*k;
		
		System.out.println(p);
		
		Robot e = new Robot();
			
	}
	
	
	
}
