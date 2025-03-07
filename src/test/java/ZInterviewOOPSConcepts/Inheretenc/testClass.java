package ZInterviewOOPSConcepts.Inheretenc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testClass extends baseClass{

    @Test
    public void test1()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement ele = driver.findElement(By.id("APjFqb"));

        //callsing static Method by extending the class
        SelectValue_StaticMethod(ele,"static");

        //Method OverLoading (Accessing methods the base class)
        SelectValue_Non_StaticMethod(ele,1);
        SelectValue_Non_StaticMethod(ele,"visibleText");

        //Method Overriding  (Accessing methods the helper calss thru base class)
        HelperClass.SelectValue_StaticMethod(ele,"String");
        HelperClass hc = new HelperClass();
        hc.SelectValue_Non_StaticMethod(ele,"visibleText"); // *** Method Overriding

        //Access the valiable from the base class
        System.out.println("base class variable color : " + color);

        //Access the valiable final from the base class
        System.out.println("base class variable color : " + speedLimit);

        driver.quit();
    }

}
