package InterviewOOPSConcepts.Polymorpizm;

public class PolimorpisemMain extends Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b;  
		b=new BankOfAmerica();  //// Static key word is Very IMP else it will fail in object declaration
		System.out.println("SBI Rate of Interest: "+b.getIntrestRate());  
		
		b=new WellsForge();  // Static key word is Very IMP else it will fail in object declaration
		System.out.println("ICICI Rate of Interest: "+b.getIntrestRate());  
		
		

	}

}
