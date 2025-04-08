package ZSeleniumProject.PracticeMethods;

import ZSeleniumProject.BaseClass.baseClass;
import org.testng.Assert;
import org.testng.annotations.Test;



public class dataDrivernLoginTest extends baseClass {
	
/*
	  @Test(dataProvider = "LoginData",dataProviderClass = dataProviderClass.class) 
	  public void Validate_Login(String uname,String password)
	  
	  {
	  try {
	  //MainPage
	  MainPage mp = new MainPage(driver);
	  mp.clickOOnformAuthenticationLink();
	  
	  //LoginPage
	  LoginPage lp = new LoginPage(driver); 
	  lp.setUserName(uname);
	  lp.setPassword(password); 
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
	  }
	  catch (Exception e) {
		System.out.println("ERROR" +e.getMessage());
	}

} */
	  
}
