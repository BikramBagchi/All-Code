package LocalAndGlobalVariable;

public class LocalAndGlobalVariable {
	
	//This are called Global Variable or class Variable 
	//It called class variable because it just come after the class
	
	int age =10;
	String name = "Tom"; //We write string as cap because it is a class 
	
	/*Global variable can be use any where just by creating 
	  an object of that particuler class.
	  So for Global variable we just need to assign it.
	  
	  Local variable are those variable which are assign inside
	  the main method or any other method and it scope is 
	  limited to that particuler class only.
	
	*/

	public static void main(String[] args) {
		
		int i = 20;//his are called local variable for main method
		System.out.println(i);
		
	/*To access a global variable then first we have to 
	 * create a object of that perticuler class
	 */
	LocalAndGlobalVariable obj1 = new LocalAndGlobalVariable();
		
	System.out.println(obj1.age);
	System.out.println(obj1.name);	
	
	int sum = i + obj1.age;
	System.out.println("Sum Result - "+sum);	
	
	
	}


public void test()
{
	
	
	
	int i = 20;//This are called local variable for sum method
	System.out.println("testmethod"+i);	
		
	int j = 30;
	System.out.println("testmethod"+j);	
	
	String m = "JAM";
	System.out.println("testmethod"+m);	
	
	LocalAndGlobalVariable obj2 = new LocalAndGlobalVariable();
	
	System.out.println("Printing the age in a separated method"+obj2.age);
	System.out.println("Printing the name in a separated method"+obj2.name);
	
	
	
	
}

    


}
