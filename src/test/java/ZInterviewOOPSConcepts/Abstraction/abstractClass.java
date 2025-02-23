package ZInterviewOOPSConcepts.Abstraction;


//Abstraction is a process of hiding the implementation details and showing only functionality to the user.

//A class which is declared with the abstract keyword is known as an abstract class in Java. It can have 
//abstract and non-abstract methods (method with the body).

//Ways to achieve Abstraction
//There are two ways to achieve abstraction in java

//Abstract class (0 to 100%)
//Interface (100%)

public abstract class abstractClass {

	int i=100;
	public abstract void method1();    //ERROR Abstract methods do not specify a body while adding body to abstract class
	public abstract void method2();    //ERROR Abstract methods do not specify a body while adding body to abstract class
	
	public void nonAbstractMethod1() {   // non abstract method cn have body
		System.out.println("am non abstract method");
		
	}
	
	public static void nonAbstractStaticMethod() {   // static methods can have body
		System.out.println("am static and non abstract method");
		
	}
	
	

}
