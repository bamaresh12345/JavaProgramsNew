package ZInterviewOOPSConcepts;

//public class finalKeywordExtend extends final  { // Can extend becase of final class
	
	
public class finalKeywordExtend  extends finalKeyWord { // Can extend becase of final class

	
	/*
	 * public void method1() //ERROR : Cannot override the final method from
	 * finalKeyWord
	 * {
	 * System.out.println("Cant override final method" + i); //can access i , but
	 * cant modify it
	 * }
	 */
	 
	

	
	public static void main(String[] args) {
	
		finalKeywordExtend obj = new finalKeywordExtend();
		obj.method1();
		//obj.i =12; // cant modify final variable
			}

}
