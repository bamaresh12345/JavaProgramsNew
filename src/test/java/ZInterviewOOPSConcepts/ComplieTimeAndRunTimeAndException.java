package ZInterviewOOPSConcepts;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ComplieTimeAndRunTimeAndException {

	
	//Types of Java Exceptions
	//There are mainly two types of exceptions: checked and unchecked. An error is considered as the unchecked exception. However, 
	//according to Oracle, there are three types of exceptions namely:

	//Checked Exception eg : IOException, FileNotFoundException , SQLException etc. also know as compile time exception

	//Unchecked Exception  eg : ArithmeticException , NullPointerException , NumberFormatException ,ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException
	//Error --> eg : stackOverflow, OutOfMemoryError, VirtualMachineError, AssertionError
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int a=2;
		int b=0;
		
		//Run time Exception
		int c = a/b;
		System.out.println(c);   // java.lang.ArithmeticException: / by zero is run time exception
		
		//Compile time Exception
		File file = new File("C:\\Users\\bamar\\OneDrive\\Documents\\Text2.txt");
		Scanner sc = new Scanner(file);
		
				
		

	}

}
