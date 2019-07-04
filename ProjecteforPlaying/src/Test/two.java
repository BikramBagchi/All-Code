package Test;

import java.lang.reflect.Method;

public class two 
{
  
	public void sss()
	{
	   int x= 10;
	}
	
	public  void print()
	{
		
		
		System.out.println("at");
		
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();

	      System.out.println(methodName);
			
	}
}
