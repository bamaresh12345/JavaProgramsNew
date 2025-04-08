package ZSeleniumProject.ZParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest1 {
    @Test
    public void testGoogle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Test1 - Google: " + driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }


    public void testGoogle2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");
        System.out.println("Test1 - Google: " + driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }
}