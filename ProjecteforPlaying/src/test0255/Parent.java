package test0255;

public class Parent {
	
	static int a;
	public static void xxx()
	{
		System.out.println("123456789");
	}
	
	
	static //Static block start
	{
		int a = 10;
		
		System.out.println("Static block start");
	} // Static block end
	
	static //multiple static block it will executed as per written
	{
		
		System.out.println("Static block start1111");
	} // Static block end
	
	
	public Parent()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) 
	{
	
	//	System.out.println(Parent.a);
	
		Parent t = new Parent();
		Parent pt = new Parent();
		
			
	}
}

	


