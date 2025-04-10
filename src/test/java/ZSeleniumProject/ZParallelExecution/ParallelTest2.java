package ZSeleniumProject.ZParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest2 {

    @Test
    public void testBing1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com");
        System.out.println("Test2 - Bing: " + driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void testBing2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotmail.com");
        System.out.println("Test2 - Bing: " + driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }
}
