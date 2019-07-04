package Interface;

public class TestBankJava {

	public static void main(String[] args) {
		
		
		HSBCBank HSBCBank = new HSBCBank();
		
		System.out.println("Making a object of HSBCBank class "); 
		
		HSBCBank.credit();
		HSBCBank.debit();
		HSBCBank.transfermoney();
		HSBCBank.EducationLoan();
		HSBCBank.CarLoan();
		HSBCBank.mutualfund();
		HSBCBank.test();
		
		System.out.println("---------------------------------- "); 
		
		/* 
		  dynamic polymorphism - Child class object can be refered by 
	      parent interface reference variable
	       	
		*/
		
		System.out.println("DynamivPolymerphism to call USBANK interface");
		
		USBANK DynamicPolymerphism = new HSBCBank();
		DynamicPolymerphism.credit();
		DynamicPolymerphism.debit();
		DynamicPolymerphism.transfermoney();
		
		System.out.println("---------------------------------- ");
		
		
		
		System.out.println("All the variable in INterface are static so by static we call the variable"+USBANK.min_bal); 
		
		System.out.println("---------------------------------- ");
		
		System.out.println("DynamivPolymerphism to call BrazileBAnkobj interface");
		
		BrazileBAnk BrazileBAnkobj = new HSBCBank();//Dynamic Polymerphism or top casting
		BrazileBAnkobj.mutualfund();
		
	
	}

}
