package ZInterviewOOPSConcepts;

public class thisKewyWord {
	
	String s;
	public thisKewyWord()
	{
		System.out.println("am default cons");
	}
	
	public thisKewyWord(String s)
	{
		this();
		System.out.println("am Parmatirized cons");
		this.s=s;
	}
	
	
	public void Method1() {
		System.out.println("am in Method 1 " + s);
		
	}

	public void Method2() {
		this.Method1();
		System.out.println("am in Method 2");
		System.out.println("am in Method 2 " + s);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisKewyWord obj = new thisKewyWord();
		
		System.out.println("***************************");
		thisKewyWord obj2 = new thisKewyWord("Test");
		
		obj2.Method1();
		obj2.Method2();
	}

}
