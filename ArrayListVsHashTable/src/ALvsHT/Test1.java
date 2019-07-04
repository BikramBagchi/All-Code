package ALvsHT;

import java.util.Hashtable;

public class Test1 {

	public static void main(String[] args) {
		
		//HashTable concept
		
		Hashtable obj = new Hashtable();
		
		obj.put("A","test" );
		obj.put("B","test2" );
		obj.put("C","test3" );
		
		System.out.println("Size = "+obj.size());
		System.out.println(obj.get("C"));
		
		Hashtable<Integer,Integer> obj1 = new Hashtable<Integer,Integer>();
        
		obj1.put(1, 101);
		obj1.put(2, 102);
		obj1.put(1, 103);
		

		
		
		
	}

}
