package DynamicWebTableHandel;

public class Main extends MR

{
   
	/*
	 We can handle webtable by two way and they are 
	 1) BY using loop
	   1.1) One by list 
	   1.2) One by loop
	 2) By using the dynamic xpath
	 */
	
	
	public static void main(String[] args) 
	{
		MR ref = new MR();
		
		ref.WebTableByList();
		
		ref.Webtable_Handel_By_loop();
		
		ref.WebTable_Handel_By_DynamicXpath();
	}

}
