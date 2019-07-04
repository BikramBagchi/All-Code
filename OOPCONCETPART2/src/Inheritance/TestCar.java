package Inheritance;

public class TestCar extends Bmw {

	public static void main(String[] args) {
		
		//object of Bmw class
		
		Bmw obj = new Bmw();
		
		System.out.println("Start of Bmw");
		
		System.out.println(obj.cross(20, 30));
		
		obj.start();
		
		/* Here we have a vital concept and that is 
		 
		 start method is both in Bmw class and in Car class
		 so it will take the Bmw class start methods as java compiler 
		 will say to Bmw class that when you have your own start method then
		 why to inherit from your parent class Car class.
		 
		 This whole process is called as method overriding
		 
		 i.e when same methods name is presents in parent class 
		 as well as in child class with the same number of
		 argument is called method overriding
		 
		 */
		
		/*
		 Static Polymorphism or compile time Polymorphism
		 
		 In Static Polymorphism when we call a method it will decide 
		 which method to take from which class
	 			 
		*/
		 
		
		obj.stop();
		
		obj.refule();
		
		obj.safty();
		
		obj.engine();
		
		obj.sum(650, 850);
		
		obj.sum(10, 20, 30);
		
		System.out.println("Finish of Bmw");
		
		System.out.println("Start of Car");
		
		
		
		//Object of Car class
		
		Car obj2 = new Car();
		
		obj2.start();
		
		obj2.stop();
		
		obj2.refule();
		
		obj2.engine();
		
		obj2.sum(100, 200, 300);
		
	    /*obj2.safty();
			
		 Now this above line statement will give an error 
		 because a child class(Bmw Class) can access all parent class(Car Class)
		 Method but a parent class(Car Class) can't access child class(Bmw Class)
		 method. 	
				
		*/
		
		System.out.println("Finish of Car");
		
		
		
		Car obj3 = new Bmw(); //This is also called Top Casting
		/*
		 The above statement is called dynamic polymporphism or RunTime polymporphism
		 
		 When we a child class object referred by a parent class variable 
		 */
		
		System.out.println("Method calling via child class object referred by a parent class variable  ");
	
	     obj3.start();
	     obj3.stop();
	     obj3.refule();
	     obj3.sum(30, 40, 50);
	     
	     /*
	      Now we can't do obj3.safty(); because only common method
	      or over ridden methods and parent class method (Car Class)
	      by by dynamic polymorphism
	      
	      dynamic polymorphism - Child class object can be refered by 
	      parent interface reference variable
	      */
	
	      
	     
	     //Down casting
	     
	    /* Bmw obj4  = (Bmw)new Car(); It will give a
	      Exception as ClassCastException
	      So down casting is not possible 
	     */
	
	     System.out.println("********************************  ");
	
	     
}

}
