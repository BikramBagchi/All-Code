package Pakagefortestr;

public class FinalConcept {

	public static void main(String[] args) {
		
		final int i = 10; //we can't modify the value of i
		
		//i = 20; it will give us an error because 
		//we use final and we can't change the value of i
		
		//like 
		
		int j = 20;
		j= 30;
		j= 40;// this will be updated value 
		
		System.out.println(j);
		
		/*
		 When we use final the we can't change the value 
		 so for i we can't change the vlaue but for j we did 
		 it for two times
		 */
	
        /*
         To prevent	inherantance we use final 
         */ 
	}

}
