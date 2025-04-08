package ZSeleniumProject.PracticeMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class headlessANDSSLandAdBlockANDEXTENSIONSTesitng {

	@Test
	public void Headlesstesting() {

		ChromeOptions options = new ChromeOptions(); // IMP***  selenium 4 ,in s3 its desireCapabilites()
		options.addArguments("--headless=new"); // IMP***
		WebDriver driver = new ChromeDriver(options); // IMP***

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement dropdwon = driver.findElement(By.xpath("//select[@id='country']"));

		Select drpCountry = new Select(dropdwon);
		drpCountry.selectByVisibleText("France");
		// drpCountry.deselectByVisibleText("France"); //You may only deselect options
		// of a multi-select
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		drpCountry.selectByValue("japan");

	}
	
	@Test
	public void SSLcertificate() {
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); // IMP***
		WebDriver driver = new ChromeDriver(options); // IMP***

		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void IncognitiveModeRunTest() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito"); // IMP***
		WebDriver driver = new ChromeDriver(options); // IMP***

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void RemoveAutomationRunByRemovepopup() {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"}); // IMP***
		WebDriver driver = new ChromeDriver(options); // IMP***

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
}
