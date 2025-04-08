package ZInterviewOOPSConcepts;

/*
Constructors in Java
In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created.
 At the time of calling constructor, memory for the object is allocated in the memory.

Types of constructors
Default Constructor
Parameterized Constructor

It is a special type of method which is used to initialize the object.

Every time an object is created using the new keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a
 default constructor by default.

Rules for Creating Java Constructor
There are following rules for defining a constructor:

Constructor name must be the same as its class name.
A Constructor must have no explicit return type.
A Java constructor cannot be abstract, static, final, and synchronized.



 */
public class Constructors {
	
	public Constructors() {
	
		System.out.println("am 1st Cons");
	}
	
    public Constructors(int i)
    {
    	this();
    	System.out.println("ams param cons" + i);
    }
	
    
    public Constructors(String s, int i)
    {
    	this(i);
    	System.out.println("am String cons" + s + " and " + i);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructors cons = new Constructors();
		Constructors cons2 = new Constructors("Test", 10);

	}

}
