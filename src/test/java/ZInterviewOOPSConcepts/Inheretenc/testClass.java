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
        SelectDropdownValue(ele,1);
        SelectDropdownValue(ele,"visibleText");

        //Method Overriding  (Accessing methods the helper calss thru base class)
        HelperClass hc = new HelperClass();
        hc.SelectDropdownValue(ele,"visibleText"); // *** Method Overriding

        HelperClass.SelectValue_StaticMethod(ele,"String");

        //Access the valiable from the base class
        System.out.println("base class variable color : " + color);

        //Access the valiable final from the base class
        System.out.println("base class variable color : " + speedLimit);



        driver.quit();
    }

}
