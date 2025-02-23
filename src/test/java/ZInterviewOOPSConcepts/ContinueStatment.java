package ZInterviewOOPSConcepts;

public class ContinueStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=10; i++)
		{
			if(i == 4 || i==5)
			{
				continue; // it will skip 5 and 6
			}
			
			System.out.print(i+ " ");
		}
		
		System.out.println("\n******************* BREAK statment **************");
		for(int i=10; i<=20; i++)
		{
			if(i == 14 )
			{
				break; // it will break the loop and exit the loop at 14
			}
			
			System.out.print(i+ " ");
		}


	}

}
