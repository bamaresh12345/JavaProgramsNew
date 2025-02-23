package ZInterviewOOPSConcepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EncapsulationTest {

	//Encapsulation : a process of wrapping code and data together into a single unit, for example, a capsule which is
	//mixed of several medicines.
	
	//We can create a fully encapsulated class in Java by making all the data members of the class private.
	//we can use setter and getter methods to set and get the data in it.
	
	//By providing only a setter or getter method, you can make the class read-only or write-only.
	//It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only,
	//you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement uname;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void setUserName(String name) {
		uname.sendKeys(name);
		
	}
	
	public void setPassword(String password) {
		uname.sendKeys(password);
		
	}
	
	//OR
		
	private String fristname;
	private int age;
	private String companyName;
	
	public String getFristname() {
		return fristname;
	}

	private void setFristname(String fristname) {
		this.fristname = fristname;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		if(age>18)
			this.age=age;
		else
			System.out.println("Invalid age");
	}

	private String getCompanyName() {
		return companyName;
	}

	private void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
	private static void main(String[] args) {
		
		EncapsulationTest obj = new EncapsulationTest();
		obj.fristname = "Amar";
		obj.age = 5;
		System.out.println(obj.age);
		System.out.println(obj.getCompanyName());
		
	}
}
