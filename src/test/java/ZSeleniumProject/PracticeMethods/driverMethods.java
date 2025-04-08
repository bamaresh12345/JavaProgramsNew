package ZSeleniumProject.PracticeMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class driverMethods {
	
	
	@Test
	public static void validateFrames() throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		
		System.out.println( "Current URL " + driver.getCurrentUrl());
		System.out.println( "getTitle " + driver.getTitle());
		//System.out.println( "Current URL " + driver.getPageSource());
		
		
		System.out.println( "getWindowHandle " + driver.getWindowHandle());
		System.out.println( "Current URL " + driver.manage().getCookies());
		
		driver.manage().deleteAllCookies();
	
				
		//==========================================================================
		//HADELING WINDOWS AND FRAMES
		String parentWindow = driver.getWindowHandle();
		
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.id("query")).sendKeys("TCS" + Keys.ENTER);
		
		Set <String> windows =  driver.getWindowHandles();
		
		for(String win : windows)
		{
			if(!win.equals(parentWindow))
			{
				driver.switchTo().window(win);
				System.out.println("Test : " + driver.getTitle());
				 System.out.println("Test : " + driver.findElement(By.id("ltpid")).getText());
			}
		}
		
		driver.close();
		
		
	}

}

