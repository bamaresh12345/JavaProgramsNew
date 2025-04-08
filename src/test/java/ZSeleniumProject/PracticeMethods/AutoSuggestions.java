package ZSeleniumProject.PracticeMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestions {
	
	@Test
	public void AutoSuggestionsGoogleSearch() 
	{
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	  
	  // XPATH is crusial --> find common xpath for all lists
	  List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox'  and @class='G43f7e']//li//div[@role='option']"));
	  
	  for(WebElement li : list)
	  {
		  System.out.println(li.getText());
	  }
	  
	}

}
