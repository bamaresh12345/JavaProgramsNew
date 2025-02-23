package ZInterviewOOPSConcepts;

public  class staticKeyWord {

	static int count=0; // Static variable
	int nonStaticCounbt=0;
	
	static  //Static block will be executed first
	{
		System.out.println("am Static block");
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		staticKeyWord obj = new staticKeyWord();
		obj.CountMethod();
		obj.CountMethod();
		obj.CountMethod();
		obj.CountMethodTest();
		System.out.println("***************");
		staticKeyWord.CountMethodTest(); // static method can be called directly or with classname , 
		CountMethodTest();   // static method can be called directly or with classname
		
	}

}
