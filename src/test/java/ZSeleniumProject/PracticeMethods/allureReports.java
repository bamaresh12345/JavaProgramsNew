package ZSeleniumProject.PracticeMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class allureReports {

    WebDriver driver;

    @Test
    public void myTest1()
    {
        Assert.assertEquals("Hello","Hello");
        System.out.println("Test case passed printing");
    }

    @Test
    public void myTest2()
    {
        Assert.assertEquals("Hello","Fail");
        System.out.println("Test case failed printing");


    }

}
