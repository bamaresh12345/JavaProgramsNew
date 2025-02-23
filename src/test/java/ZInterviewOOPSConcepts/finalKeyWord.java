package ZInterviewOOPSConcepts;

//public final class finalKeyWord {  // if final class then can to extended
	public  class finalKeyWord {
	
	final int speedLimit =90;
	int j=12;
	final String companyName = "ICE";
	
	//Cannot override Final methods , but can be overloaded
	public final void method1()
	{
		System.out.println("am final method");
		//speedLimit=120;  //Cannot assign a value to final variable 'speedLimit'
	}
	//speedLimit=120;  //Cannot assign a value to final variable 'speedLimit'

	static class  test1
	{
		int i=10;
		//speedLimit =90;  //Non-static field 'speedLimit' cannot be referenced from a static context
	}


	public static void main(String[] args) {
		
		
		finalKeyWord obj = new finalKeyWord();
		//obj.i=112; // ERROR The final field finalKeyWord.i cannot be assigned
		obj.j = 1;
		//obj.companyName = "Test";  //he final field finalKeyWord.companyName cannot be assigned
		obj.method1();
	}
	

}
