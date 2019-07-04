package upcasting;

public class OneClass {

	public static void main(String[] args) {
		
		
		Child w = new Child();
		
		/*
		 
		 This will going to create an object of new child class
		 where reference is w of Child class
		 
		 
		 */
		
		w.address();
		w.Section();
		w.name();
		
		/*
		 Via we can call all the method of Child and Parent class
		 as Child extends Parent
		 */
		
		Parent e = (Parent)w;//Type casting(Upcasting)
		
		/*
		 This will change the caste of reference w to Parent class
		 means now w will change to reference of parent e
		 */
		
		e.name();
		
		
		Parent u = new Child();
		
		/*
		 This is also upcasting and u==e both are same 
		 but we can do it by two different way
		 second way is much popular than the 
		 */
		
		/*
		 Parent e = (Parent)w; and Parent e = (Parent)w;
		 are called dynamic polymerphism or run time 
		 polumerphism
		 
		 */
		
		u.name();//Method override
		
		/*
		 ****************IMP************
		 using u or e we can only access the method of parent class
		 as when java find the object as child class but the 
		 Reference is of parent class then it will only have the 
		 Access to all the method of parent class not to the child 
		 class
		 
		 */
		/*
		 We can only perform upcating only when two class have relation 
		 among them either by extends or by implements
		 */
		
		
	}

}
