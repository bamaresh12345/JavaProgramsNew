package ZInterviewOOPSConcepts.Abstraction;


/* Abstraction : is a process of hiding the implementation details and showing only functionality to the user.

Ways to achieve Abstraction
There are two ways to achieve abstraction in java

1. Abstract class (0 to 100%)
2. Interface (100%)

Abstract class  :A class which is declared with the abstract keyword is known as an abstract class in Java.
It can have abstract and non-abstract methods (method with the body).
 1. abstract method cannot have the body

bastract class cannot be instiscated, can be insitated by child class

 */



public abstract class abstractClass {

	int i=100;
	public abstract void method1();    // abstract method cannot have the body
	public abstract void method2();    // abstract method cannot have the body
	
	public void nonAbstractMethod1() {   // non abstract method can have body
		System.out.println("am non abstract method");
		
	}
	
	public static void nonAbstractStaticMethod() {   // static methods can have body
		System.out.println("am static and non abstract method");
		
	}

	abstractClass()  // abstract class can have constructors
	{
		System.out.println("abastract can have constructoer");
	}
	
	

}
