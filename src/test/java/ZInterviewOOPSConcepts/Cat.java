package ZInterviewOOPSConcepts;



public class Cat  extends InheritanceAnimal{
	
	public Cat()
	{
		super(); //Calling parent construction
		System.out.println("Am Cat child  consturctor");
		
	}
	String color = "black";
	public void eating()
	{


		eat(); // this also works , will be ambugity when we have same method in class
		super.eat();  // calling parent method in child class
		System.out.println("default anumal color: " + super.color);  // calling parent variable in child class
		System.out.println("cat color : " + color);   //// calling instant variable in child class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat c = new Cat();
		c.eating();  // calling child method
		System.out.println("******************");
		c.eat();     // calling parent method

	}

}
