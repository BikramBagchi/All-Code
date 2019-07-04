package ArrayIntilazation;

public class arrayintialization {

	public static void main(String[] args) {
		
	//1.integer array 
		
	int i[]	= new int[4]; // this is the step to intiliaze the array in java 
	// we are using this [] to concert a integer to an array	
	// lowest index will be 0 
	// Higest index will be 3
	// size of the array is n then Highest index will be n-1
	
	i[0]=10;
	int m = i[1]= 20;
	i[2]=20;
	i[3]=30;
	
		
	System.out.println("Value of i[1]  "+m);
	
	// it will print the value of i[1]
	
	System.out.println("Value of i[2]  "+i[2]);
	
	// it will print the value of i[2]
	
	//System.out.println(i[4]);
	// for this we will get an error as array index out of bound 
	// important for interview 
	
	
	System.out.println("Array size using length method  "+i.length);//length is a method 
	//Here length method will help us to find the size of array
	
	
	// Print all the values of i by using for loop
	
	 for (int k = 0;k<i.length;k++)
	 {
		 
		 System.out.println(i[k]); 
	 }
		 
	 //2.Double array
	 //Simple to store the 10.36 value we use this double 
	 
	 
	 double d[] = new double [3];
	 d[0]=10.36;
	 d[1]=25.63;
	 d[2]=96321.54654;
	 
	 //3.Char array
	 // To store only one character or special character or anything we use this
	 
	 char c[]=new char[3];
	 c[0]='a';
	 c[1]='1';
	 c[2]='@';
	 
	 //4.Boolean array 
	 
	 boolean b1[]= new boolean[3];
	 b1[0]=true;
	 b1[1]=false;
					 
	//5.String Array
	//To store string we use this 
	//String is class not a data type
	//that why String starts with cap letter
	// We will use "" in case of this ''
	 
	String s2[] = new String[3];
	s2[0]="latu";
	s2[1]= "Bikram";
	s2[2]="Bagchi";
	
			 
	
	}

}
