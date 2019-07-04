package LinkList;

import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		
		LinkedList<String> obj = new LinkedList<String>();
	    
		obj.add("Lalatu");
		obj.add("RPA");
		obj.add("RAM");
		obj.add("Selenium");
		obj.add("pERFORMANCE tESTING");
		
		//Print
		
		System.out.println("Conctext of LinkedList"+obj);
		
		//To add any element on first position
		
		obj.addFirst("First");
		System.out.println("Conctext of LinkedList"+obj);
		
		//To add any element on last position
		
		obj.addLast("Last");
		System.out.println("Conctext of LinkedList"+obj);
		
		//To set any particular position for a element
		 
		obj.set(0, "Test001");
		System.out.println("First element "+obj.get(0));
		
		//To Remkove
		obj.removeFirst();
		obj.removeLast();
		System.out.println("Conctext of LinkedList"+obj);
		
		//To remove element from any position
		obj.remove(2);
		System.out.println("Conctext of LinkedList"+obj);
		
		int m = obj.size();
		
		for (int i = 0;i<=m;i++)
		{
			System.out.println("Conctext of LinkedList"+obj.get(i));
			
		}
		
	
		
		
	}

}
