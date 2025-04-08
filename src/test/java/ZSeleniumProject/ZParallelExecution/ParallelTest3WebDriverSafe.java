package ZSeleniumProject.ZParallelExecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
/*
parallel="methods" → Runs test methods in parallel.
thread-count="3" → Runs up to 3 tests at the same time.
parallel="classes" → Runs test classes in parallel instead of methods.
 */

public class ParallelTest3WebDriverSafe {
    @Test
    public void testYahoo() {
        WebDriver driver = WebDriverManager.getDriver(); // *** IMP
        driver.get("https://www.gmail.com");
        System.out.println("Test3 - Yahoo: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}