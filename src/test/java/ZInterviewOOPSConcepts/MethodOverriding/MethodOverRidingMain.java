package ZInterviewOOPSConcepts.MethodOverriding;

public class MethodOverRidingMain {
	
	//If two methods have the same method name in both parent class and child class it is known as method overriding in Java.
	
	//Usage of Java Method Overriding
	
	//Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
	//Method overriding is used for runtime polymorphism
	
	//Rules for Java Method Overriding
	
	//The method must have the same name as in the parent class
	//The method must have the same parameter as in the parent class.
	//There must be an IS-A relationship (inheritance).
	
	public void Method1OverrideSalary(int hours, int rate)
	{
		int c = hours+rate;
	  System.out.println("am in parent Method1Override " + c );	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
