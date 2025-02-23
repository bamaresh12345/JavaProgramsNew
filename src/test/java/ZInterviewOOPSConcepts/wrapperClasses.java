package ZInterviewOOPSConcepts;


public class wrapperClasses {

	//The wrapper class in Java provides the mechanism to convert 
	//primitive datatypes into object and or object into primitive datatypes
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =100;
		Integer b = a;  // autoboxing , compiler will write Integer.valueof(i) internally
		
		int c = b;   // //unboxing, now compiler will write a.intValue() internally
		
		Integer d=Integer.valueOf(c);//boxing compiler will write Integer.valueof(i) explicitly
		
		int e = d.intValue();  //unboxing, now compiler will write d.intValue() explicitly
		
		
		

	}

}
