package InterviewOOPSConcepts.Polymorpizm;

public class InterfaceCallClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterviewOOPSConcepts.Polymorpizm.BankOfAmericaClass b = new InterviewOOPSConcepts.Polymorpizm.BankOfAmericaClass();
		System.out.println("SBI Rate of Interest: "+b.getIntrestRate());  
		
		
		WellsForgoImplementsClass wf = new WellsForgoImplementsClass();
		System.out.println("SBI Rate of Interest: "+wf.getIntrestRate());  
		

	}

}
