package Interface;

public class HSBCBank implements USBANK, BrazileBAnk {
	
	public void credit() 
	{
		System.out.println("HSBC-----Credit");
	}
	
       public void debit()
       {
    	   System.out.println("HSBC-----Debit");   
       }
	
       public void transfermoney()
       {
    	   System.out.println("HSBC-----transfermoney");   
       }
       
       public void CarLoan()
       {
    	   System.out.println("HSBC-----CarLoan");   
       }
       
       public void EducationLoan()
       {
    	   System.out.println("HSBC-----EducationLoan");   
       }

       public void mutualfund()
       {
    	   System.out.println("HSBC-----mutualfund");
       }
       
       public void test()
       {
    	   System.out.println("test");
       }
}
