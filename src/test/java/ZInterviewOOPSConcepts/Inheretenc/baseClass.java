package ZInterviewOOPSConcepts.Inheretenc;

import org.openqa.selenium.WebElement;
/*
in Java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, Inheritance means
 creating new classes  based on existing ones. A class that inherits from another class can reuse the methods and fields of that
   class.
 "inheritance concept" into two categories:

superclass (parent) - the class being inherited from
subclass (child) - the class that inherits from another class

To inherit from a class, use the extends keyword.

Why Use Inheritance in Java?
Code Reusability: The code written in the Superclass is common to all subclasses. Child classes can directly use the
 parent class code.
Method Overriding: Method Overriding is achievable only through Inheritance. It is one of the ways by which Java achieves
 Run Time Polymorphism.
Abstraction: The concept of abstraction where we do not have to provide all details, is achieved through inheritance.
 Abstraction only shows the functionality to the user.
that Organizes classes in a structured manner, improving readability and maintainability.
 */
public class baseClass {

    public static String color = "blue";

    final int speedLimit =90;

    public static void SelectValue_StaticMethod(WebElement ele,String value) // static methods can access directly in extended class
    {
        System.out.println("SelectValue" + value);
    }

    public void SelectDropdownValue(WebElement ele,int value) // Method Overriding
    {
        System.out.println("SelectValue : " + value);
    }

    public void SelectDropdownValue(WebElement ele,String value)  // Method Overriding
    {
        System.out.println("SelectValue : " + value);
    }


}
