package ZSeleniumProject.PageObjects;

import ZSeleniumProject.BaseClass.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends baseClass {
	
	WebDriver driver;

	public HomePage(WebDriver driver)
	{
		
		//super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}
	
	
	
	@FindBy(xpath="//a[@class='btn btn-link navbar-btn']")
	private WebElement lnkLogin;
	
	@FindBy(xpath ="//a[@class='btn btn-black navbar-btn']")
	private WebElement lnkRegister;
	
	
	public void clickOnRegisterLink()
	{
		lnkRegister.click();
	}
	
	public void clickOnLoginLink()
	{
		lnkLogin.click();
	}
	
	
}
