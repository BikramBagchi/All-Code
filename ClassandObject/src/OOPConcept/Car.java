package OOPConcept;

public class Car {

	int gear = 10; //Class var or global variable
	int wheel = 20 ; //Class var or global variable
	int valuetobeassign1;
	int valuetobeassign2;
	public static void main(String[] args) {
		
		Car a = new Car();
		
		//Creation of Object
		/*
		 new Car() = Object
		 a = Object Reference  
		*/		
		
		//We will create two more object and reference 
		Car b = new Car();
		Car c = new Car();
		
		//we will assign a value to a Global variable.
		
		System.out.println("Before assign the reference");
		
		a.valuetobeassign1 = 30;
		a.valuetobeassign2 = 40;
		
		System.out.println(a.valuetobeassign1);
		System.out.println(a.valuetobeassign2);
		System.out.println(a.gear);
		System.out.println(a.wheel);
		
		b.valuetobeassign1 = 50;
		b.valuetobeassign2 = 60;
		
		System.out.println(b.valuetobeassign1);
		System.out.println(b.valuetobeassign2);
		System.out.println(b.gear);
		System.out.println(b.wheel);
		
		
		c.valuetobeassign1 = 70;
		c.valuetobeassign2 = 80;
		
		System.out.println(c.valuetobeassign1);
		System.out.println(c.valuetobeassign2);
		System.out.println(c.gear);
		System.out.println(c.wheel);
		
		System.out.println("After assign the reference");
		
		a=b;
		b=c;
		c=a;
		
		a.gear = 100;
		
		System.out.println(a.gear);//100
		
		c.gear = 200;
		
		System.out.println(a.gear);//200
		
		b.gear = 300;
		 
		System.out.println(c.gear);//200 
		System.out.println(b.gear);//300
		

		/* The avbove perform operation is
		   called as shifting of object reference from 
		   one object to another
		*/
		

}
	
}

	
	
