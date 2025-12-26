package ZSeleniumProject.PracticeMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
PageFactory.initElements(driver, this);
This line initializes the all the web elements defined in your Page Object class using the Selenium @FindBy annotations.
PageFactory is a class in Selenium that supports the Page Object Model design pattern.

initElements(driver, this) takes: driver: the WebDriver instance.

this: refers to the current page object class.

When this line runs, it looks at all the @FindBy annotated fields in your class and finds those elements on the
page using the driver and initializes the web elements defined in your Page Object class using the Selenium @FindBy annotation

 */
public class POM_PageFactory {
    WebDriver driver = new ChromeDriver();
	//Declaration
	@FindBy(xpath = "//input[contains(text(),'Login')]")   // no semicolon
	WebElement login;
	
	@FindBy(xpath = "//input[contains(text(),'Password')]")    // no semicolon
	WebElement password;
	
	private By user = By.xpath("//input[contains(text(),'Login')]");
	
	//Inilizations
	public POM_PageFactory()
	{
		//This line initializes the web elements defined in your Page Object class using the Selenium @FindBy annotations.
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterUsername()
	{   //PageFactory
		login.isDisplayed();
		login.sendKeys("Test");
	}
	
	public void enterPassword()
	{
		login.sendKeys("Test");
	}
	//POM
	public boolean VerfiyUserName()
	{
		return driver.findElement(user).isDisplayed();
	}

 public static void main(String[] args) {
	
}
}
