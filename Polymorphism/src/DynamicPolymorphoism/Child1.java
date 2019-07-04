package DynamicPolymorphoism;

public class Child1 extends Parent  {

	@Override
	public void test2(int m)
	{
		 System.out.println("Value of m = "+m);
	}
	 
	public void notcallmewthod()
	{
		 System.out.println("Gapjal");
	}
	
	public void notcallmewthod(int m, int n)
	{
		 System.out.println("Gapjal m = "+m+" Gapjal n = "+n);
	}
	
}
