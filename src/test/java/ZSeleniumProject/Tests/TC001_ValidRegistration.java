package ZSeleniumProject.Tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import ZSeleniumProject.BaseClass.baseClass;
import ZSeleniumProject.PageObjects.AccountRegistration;
import ZSeleniumProject.PageObjects.HomePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TC001_ValidRegistration extends baseClass {

	
//public WebDriver driver;
//FAILED: testCases.TC001_ValidRegistration.ValidateRegistration
//java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.SearchContext.findElement(org.openqa.selenium.By)" because "this.searchContext" is null



	
	  @Test public void ValidateRegistration()
	  
	  {
	  
	  HomePage hp = new HomePage(driver);
	  hp.clickOnRegisterLink();
	  
	  AccountRegistration ar = new AccountRegistration(driver);
	  
	  ar.setFirstName(randomString().toUpperCase()); ar.setLastName("Boli");
	  ar.setEmailId("bamaresh2012@gmail.com"); ar.setCountry("India");
	  ar.setPassword("Amar12345$"); ar.clickRegistration();
	  
	  System.out.println("randomAlphaNumeric()" + randomAlphaNumeric());
	  System.out.println("randomAlphaNumeric()" + randomString().toUpperCase());
	  System.out.println("randomAlphaNumeric()" + randomNumber()); }
	 
	
	
	/*  @Test public void Validate_Login()
	  
	  {
	  try {
	  //MainPage
	  MainPage mp = new MainPage(driver); 
	  mp.clickOOnformAuthenticationLink();
	  
	  //LoginPage
	  LoginPage lp = new LoginPage(driver); 
	  lp.setUserName("tomsmith");
	  lp.setPassword("SuperSecretPassword!"); 
	  lp.clikcOnLoginButton();
	  
	  //SecurePage
	  SecureAreaPage sp = new SecureAreaPage(driver);
	  String str = sp.getMessage();
	  System.out.println("str  " + str);
	  boolean b = sp.checkLogoutButtonDisplayed();
	 // assert.assertTrue(b);
	  
	   Assert.assertTrue(b, "Lout button not dispalyed");   //Assert CAPITAL letter is IMP **Assert
	   Assert.assertEquals(str+ "sdf", " Welcome to the Secure Area. When you are done click logout below.");
	   
	  System.out.println("b--> " + b);
	  
	  
	  sp.clickOnLogoutButton();
	  Thread.sleep(30);
	  }
	  catch (Exception e) {
		System.out.println("ERROR" +e.getMessage());
	}

	  
	  
	  
	  }  */
	 
	
}
