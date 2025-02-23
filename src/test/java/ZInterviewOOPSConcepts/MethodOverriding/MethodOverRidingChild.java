package ZInterviewOOPSConcepts.MethodOverriding;


import ZInterviewOOPSConcepts.MethodOverRidingMain;

public class MethodOverRidingChild extends MethodOverRidingMain {

	
	////If two methods have the same method name in both parent class and child class it is known as method overriding in Java.
	
		//Usage of Java Method Overriding
		
		//Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
		//Method overriding is used for runtime polymorphism
		
		//Rules for Java Method Overriding
		
		//The method must have the same name as in the parent class
		//The method must have the same parameter as in the parent class.
		//There must be an IS-A relationship (inheritance).
	
	public void Method1Override(int a, int b) {
		int c = a+b + 10; // 12 as bonus
		
		System.out.println(" am in child calss with specific implementation :  " + c);
		
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverRidingChild obj = new MethodOverRidingChild();
		obj.Method1Override(2, 2);
		
		System.out.println("*********************");
		MethodOverRidingMain obj2 = new MethodOverRidingMain();
		obj2.Method1Override(2, 2);

	}

}

