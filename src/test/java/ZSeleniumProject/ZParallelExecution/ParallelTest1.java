package ZSeleniumProject.ZParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
thread-count="3" → Runs up to 3 tests at the same time.
parallel="classes" → Runs test classes in parallel instead of methods.
 */
public class ParallelTest1 {
    @Test
    public void testGoogle1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.setDriver(driver);

        WebDriverManager.getDriver().get("https://www.google.com");
        System.out.println("Test1 - Google: " + WebDriverManager.getDriver().getTitle());
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void testGoogle2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.setDriver(driver);
        WebDriverManager.getDriver().get("https://www.yahoo.com");
        System.out.println("Test1 - Google: " +  WebDriverManager.getDriver().getTitle());
        Thread.sleep(1000);
        driver.quit();
    }
}