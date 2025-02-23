package ZInterviewOOPSConcepts.Interfaces;

public class WellsForgo implements InterfaceTest {

	@Override
	public int bank() {
		
		return 5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//b.i=12;  //ERROR b cannot be resolved to a variable
		
		BankOfAmerica b = new BankOfAmerica();
		System.out.println("Bank of America interest rate : " +b.bank());
		System.out.println("Interfacec i static fineal variable : " +b.i);
		
		WellsForgo w = new WellsForgo();
		System.out.println("WellsForgo interest rate : " +w.bank());

	}

	

}
