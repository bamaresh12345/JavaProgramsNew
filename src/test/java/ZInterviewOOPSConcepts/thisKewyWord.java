package ZInterviewOOPSConcepts;
/*
The this keyword refers to the current object in a method or constructor.

The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the
same name

this can also be used to:
1. To refer to current class instance variable --> When local and instance variables have the same name:
2. Invoke current class method ---> this.display()
3. Invoke current class constructor --> this();
4. Return the current class object  --> return this;
5. Pass an argument in the method call --> method(this);

 */
public class thisKewyWord {
	
	String s;
	public thisKewyWord()
	{
		System.out.println("am default cons");
	}
	
	public thisKewyWord(String s)
	{
		this();
		this.s=s; //To refer to current class instance variable,When local and instance variables have the same name:
		System.out.println("am Parmatirized cons");

	}
	
	
	public void Method1() {
		System.out.println("am in Method 1 " + s);
		
	}

	public void Method2() {
		this.Method1();   //Invoke current class method
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
