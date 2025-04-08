package ZSeleniumProject.ZParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Using ThreadLocal WebDriver for Parallel Execution
If multiple threads share the same WebDriver instance, conflicts may occur. ThreadLocal WebDriver ensures
each test gets a separate browser session.

Implement Thread-Safe WebDriver for that Create a WebDriverManager class

parallel="methods" → Runs test methods in parallel.
thread-count="3" → Runs up to 3 tests at the same time.
parallel="classes" → Runs test classes in parallel instead of methods.


Ensure each test initializes its own WebDriver instance to avoid conflicts.
Each test method runs in a separate thread with its own WebDriver instance.

Using ThreadLocal WebDriver for Parallel Execution
If multiple threads share the same WebDriver instance, conflicts may occur. ThreadLocal WebDriver ensures each
 test gets a separate browser session.


1. Create a WebDriverManager class using ThreadLocal class

 */
public class WebDriverManager {

    private static  ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        return driver.get();
    }

    public static void setDriver(WebDriver webDriver) {
        driver.set(webDriver);
    }

    public static void quitDriver()
    {
          driver.remove();
    }
}
