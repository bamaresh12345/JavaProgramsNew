package ZInterviewOOPSConcepts;
/*
The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable
(impossible to inherit or override).

final keyword can be applied on
1. variable  --> Vairavle  cant be changed, else it will give compiler error
2. on method  --> method  cant be overridden, else it will give compiler error
3. on class  --> calss cant be extended, else it will give compiler error

The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
 */

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

	//Can overload Final methods wwith differnt paramanters
	public  void method1(int x)
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
