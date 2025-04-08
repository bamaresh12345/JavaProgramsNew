package ZSeleniumProject.PageObjects;

import ZSeleniumProject.BaseClass.baseClass;
import groovy.xml.StreamingDOMBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountRegistration extends baseClass {

	WebDriver driver;

	public AccountRegistration(WebDriver driver) {

		// super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFristName;

	@FindBy(xpath = "//input[id='input-lastname']")
	private WebElement txtLastName;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-country']")
	private WebElement dpCountry;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg hidden-xs']")
	private WebElement btnRegistration;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement msgConfrimation;
	
	

	public void setFirstName(String fname) {
		try {

			txtFristName.sendKeys(fname);
		} catch (Exception e) {
			System.out.println("not able to enter text" + e.getMessage());
		}
	}
	
	public void setLastName(String lName)
	{  try {
		txtLastName.sendKeys(lName);
	} catch (Exception e) {
		System.out.println("not selected " + e.getMessage());
	}
	}
	
	public void setEmailId(String Email)
	{
		txtEmail.sendKeys(Email);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setCountry(String country)
	{
		dpCountry.sendKeys(country);
	}
	
	public void clickRegistration()
	{
		btnRegistration.click();
	}
	
	public String getConfrimaitonMessage()
	{
		String msg = msgConfrimation.getText();
		return msg;
	}

}
