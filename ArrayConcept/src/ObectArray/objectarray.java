package ObectArray;

public class objectarray {

	public static void main(String[] args) {
		
	// Creation of object class
	//Object is the super of all class
	/*
	We use Object class to over come the 2nd disadvantage
	of array
	Now to know the second disadvantage please go to 
	ArrayTheory pakage */
		
	Object i[] = new Object[6];
	i[0]="10.023";
	i[1]="Laltu";
	i[2]="23";
	i[3]="22/4/1994";
	i[4]="m";
	i[5]="@";
	
	System.out.println(i[5]);
	
	int length = i.length;
	
	System.out.println(length);
	
	for (int k = 0;k<i.length;k++)
	 {
		 
		 System.out.println(i[k]); 
	 }

}
}