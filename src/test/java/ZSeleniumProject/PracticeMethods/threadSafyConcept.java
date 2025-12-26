package ZSeleniumProject.PracticeMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Objects;

/*
Why Use ThreadLocal in Selenium?
ThreadLocal is class in selenium , used for
Thread Safety: Ensures that each thread gets a separate WebDriver instance, avoiding conflicts.
Parallel Test Execution: Helps execute tests concurrently without issues.
Avoid Global Variables: Prevents using a static WebDriver instance that may cause synchronization issues.
How ThreadLocal Works in Java
ThreadLocal<T> creates a separate instance of an object (WebDriver) for each thread, ensuring that each test thread
works independently.

Advantages of ThreadLocal calss in selenium are
Benefits:
✅ Thread Safety: Each test thread uses its own WebDriver.
✅ Parallel Execution: No interference between threads.
✅ Cleaner Code: Centralized WebDriver management.

 ThreadLocal class is prevents conflicts between multiple tests running concurrently.

  1. first declare ThreadLocal WebDriver instance -->private static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>()
  2. create  WebDriver driver; variable
  3. there are 3 methods in Threadlocal class ,get(),set() and remove() method
  4. create two setter and getter methods . setDriver() and getDriver()
  5. Initally call the setDriver and pass driver instance and
      repalce all other driver instnace with getDriver() methods.
      eg :  driver.get()   with --> getDriver().get
      eg :  driver.findEllment(xpath)   with --> getDriver().findElement(xpath)

   */
public class threadSafyConcept {

    private  static  ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

    WebDriver driver;



    public static WebDriver getDriver()
    {
        return tdriver.get();
    }

    //public static void setDriver(WebDriver driver)
    public void setDriver(WebDriver driver)
    {
        tdriver.set(this.driver);
    }

    public static void closeBrowser(WebDriver driver)
    {
        getDriver().close();
        tdriver.remove();
    }

    @Test
    public void myTest1()
    {
      driver = new ChromeDriver();
      setDriver(driver);   // calling setDriver and passing driver parametr,so that other tests wont use this instnce
      //driver.get("https://www.google.com/");
        getDriver().get("https://www.google.com/");  // updated driver with getDriver() method
        //System.out.println(driver.getTitle());
        System.out.println(getDriver().getTitle());  // updated driver with getDriver() method
        //driver.quit();
        getDriver().quit(); // updated driver with getDriver() method

    }

    @Test
    public void myTest2()
    {
        driver = new EdgeDriver();
        setDriver(driver);   // calling setDriver and passing driver parameter , so that other tests wont use this instnce
        //driver.get("https://www.google.com/");
        getDriver().get("https://www.yahoo.com/");  // updated driver with getDriver() method
        //System.out.println(driver.getTitle());
        System.out.println(getDriver().getTitle());  // updated driver with getDriver() method
        //driver.quit();
        getDriver().quit(); // updated driver with getDriver() method

    }

}
