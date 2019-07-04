package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Concept1 {

	public static <E> void main(String[] args) {
		
		//We can call it as dynamic array
		
		/*Property
		  1) Duplicate value
		  2) Maintain insertion order
		  3) It is not synchronize that is why it is slow
		  4)it allow random access to fetch any element on
		     the basis of indexing 
		*/
		
		//This Array list is non generic
		//because we can give any type of data 
		//String , int , char any kind of data we can assign
		ArrayList test = new ArrayList();
		test.add(5, 6546554);// add via index it wil going to add on that index
		test.add(10); 
		test.add("Ram");
		test.add(30.4654);
				
		System.out.println(test.size());//To get the size or the length
				
		test.add('A');
		test.add(true);
		test.add("Aplha65465");
		
		test.remove(10);// remove by the value 
		test.remove(4);// remove by index of that value
		test.indexOf('A');// It will give us the index of that value
		test.contains(10);//it will check weather Array list contain 10 or not
		
		System.out.println(test.size());
		
		System.out.println(test.get(4)); //to get the value we are using get method
		
		//if you want to print all values of array list
		
		/*for (int i=0;i<=test.size();i++)
		{
			System.out.println("Array list value = "+test.get(i));
		}
				
	
		//Non generic vs generic 
		
		//This Array List is generic
		//We will only assign the genric data typoe value here it is Integer
		
		ArrayList<Integer> test1 = new ArrayList<Integer>();
		
		test1.add(20);
		
		/*test1.add("Selenium");This will give error 
		because in generic we have declare that this 
		arraylist is for interger only */
		
		//Array List generic for string
		
		ArrayList<String> test2 = new ArrayList<String>();
		
		test2.add("Selenium");
		test2.add("aPPDATA");
		
		 	
		ArrayList<E> test3 = new ArrayList<E>();//Not clear 
		

		//TestClass object
		
		TestClass obj = new TestClass("test",27,"QA");
		TestClass obj1 = new TestClass("rest",27,"QA");
		TestClass obj2 = new TestClass("west",27,"QA");
		
		//Create a Array List
		
		ArrayList<TestClass> test4 = new ArrayList<TestClass>();
		
		test4.add(obj);
		test4.add(obj1);
		test4.add(obj2);
		
		//iteator to traverse - need to under stand
		
		Iterator<TestClass> it =test4.iterator();
		while(it.hasNext()){
			
			TestClass obj6 = it.next();
			System.out.println(obj6.name);
			System.out.println(obj6.deprt);
			System.out.println(obj6.age);
					
		}
		
		
		 ArrayList<String> test10 = new ArrayList<String>();
			
			test10.add("10Selenium");
			test10.add("10aPPDATA");
			test10.add("Temp");
			
		ArrayList<String> test11 = new ArrayList<String>();
				
			test11.add("hi all");
			test11.add("why ");
			test11.add("me ");
		
		// when i want to add test11 to add in test10
			
			test10.addAll(test11);
			
			 for (int j = 0; j<test10.size();j++)
			 {
				 System.out.println("ADD"+test.get(j));
			 }
		
			 
			 //Remove all
			 
			 test10.removeAll(test11);
			 for (int j = 0; j<test10.size();j++)
			 {
				 System.out.println("Remove"+test.get(j));
			 }
		
			 //Retain All
			 
			 ArrayList<String> test12 = new ArrayList<String>();
				
				test12.add("Selenium");
				test12.add("aPPDATA");
				test12.add("Temp");
				
			ArrayList<String> test13 = new ArrayList<String>();
					
				test13.add("Selenium");
				test13.add("why ");
				test13.add("me "); 
			 
			
				test12.retainAll(test13);
				
				for (int j = 0; j<test12.size();j++)
				 {
					 System.out.println("Retain"+test.get(j));
				 }
				
	
	}
			
}

		

	
	
	