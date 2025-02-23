package InterviewOOPSConcepts.Polymorpizm;

public class Bank {
	int getIntrestRate()
	{
		return 0;
	}

	static class BankOfAmerica extends Bank {  // Static key word is Very IMP else it will fail in object declaration
		int getIntrestRate()
		{
			return 3;
		}
	}
	
	 static class WellsForge extends Bank  // Static key word is Very IMP else it will fail in object declaration
	{
		int getIntrestRate()
		{
			return 4;
		}
		
	}
	
	
}
