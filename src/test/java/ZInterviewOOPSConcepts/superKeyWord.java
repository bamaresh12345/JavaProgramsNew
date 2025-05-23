package ZInterviewOOPSConcepts;
/*
The super keyword in Java is a reference variable that is used to refer to parent class

Static keyword can be applied for
super is used to call a parent constructor:
super is used to call a parent method:
super is used to access a parent field:
super must be the first statement in a constructor:
super cannot be used in a static context:

 */
//static public  class staticKeyWord { // outsode class cannot be static as its not dependent on other class
public  class superKeyWord {

	static int count=0; // Static variable
	int nonStaticCounbt=0;
	
	static  //Static block will be executed first , and it will run only once ,when class is loaded 1st time
	{
		System.out.println("am Static only block");
	}
	
	public void CountMethod()
	{   count=3;
		count++;
		System.out.println("Count val :  am non-static " +count);
		//System.out.println("Count val : " +nonStaticCounb); // no static vairable cant be called in non static methods
	}
	
	public static void CountMethodTest()
	{
		//nonStaticCounb           //non static vaiable cant be called  
		 count++;                 // Static methods can call static vairables
		System.out.println("am Static Method : "+ count);
	}

	static class TestStatic{   // innser calsss can have static

		String name;
		public TestStatic(String name)
		{
			this.name=name;
		}
	}

	public void greetings()
	{
		System.out.println("greetings");
	}

	static void fun()
	{
		//greeting(); // cant call because its non-static method
		//System.out.println(nonStaticCounbt);  // cant use becase, its non-static variable
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		superKeyWord obj = new superKeyWord();
		obj.CountMethod();
		obj.CountMethod();
		obj.CountMethod();
		obj.CountMethodTest();
		System.out.println("***************");
		superKeyWord.CountMethodTest(); // static method can be called directly or with classname ,
		CountMethodTest();   // static method can be called directly or with classname

		//inner static class

		TestStatic a= new TestStatic("test"); // if its not static one ly


		// greetings();  // this is non static method belongs to an object, so cant call directly in main static method



	}

}
