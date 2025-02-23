package ZInterviewOOPSConcepts;

// Method overload : If a class has multiple methods with same name but different in parameters, it is known as Method Overloading.
//Can achive method overloading by same nubmer of parmamters with differnt data types or by differnt nubmer of parmanteres with same 
//datatype
//Advantage of Method overloading is it increases the readability of the program.
public class MethodOverLoading {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int add(int a, int b, int c)
	{
		
		return a+b+c;
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading obj = new MethodOverLoading();
		System.out.println(obj.add(2, 3));
		System.out.println(obj.add(2, 3,8));
		System.out.println(obj.add(1.1,2.2));

	}

}
