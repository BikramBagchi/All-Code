package DynamicPolymorphoism;

public class maincallclass {

	public static void main(String[] args) {

		System.out.println("For test");
		
		Parent ref = new Child1(); // uppercasting
		
		ref.test1();
		
		ref.test2(20);
		
		//ref.notcallmewthod();

		/*
		 Here we have to understand that object is been created 
		 as new Child1() with reference as ref
		 
		 here we will have the access for all method of 
		 parent class but we will have no access to any method
		 child class until and unless the method is override. 
		 
		 */
		
		
	}

}
