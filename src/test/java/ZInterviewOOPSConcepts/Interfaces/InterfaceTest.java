package ZInterviewOOPSConcepts.Interfaces;

//An interface in Java is a blueprint of a class. It has static constants and abstract methods.

//It cannot be instantiated just like the abstract class.
//Java Interface also represents the IS-A relationship.
//An interface is declared by using the interface keyword. It provides total abstraction; means all the methods 
//in an interface are declared with the empty body, and all the fields are public, static and final by default.


public interface InterfaceTest {
	
	int i=10;  // by default variable declared in inteface is public, static and final by default. , cant change the value
	
	public int bank();   // buy default al methods are public, abstract , and final by default
	public static void staticMethod() {
		System.out.println("this static method");
	}
	
	

}
