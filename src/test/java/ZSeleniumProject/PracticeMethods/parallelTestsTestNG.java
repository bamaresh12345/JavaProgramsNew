package ZSeleniumProject.PracticeMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelTestsTestNG {

    public WebDriver driver;
    //@Test(invocationCount = 3)  --> Runs the same test method 3 times. Used for: Re-running flaky tests,Repeated validations,Load testing
   // @Test(invocationCount = 3, threadPoolSize = 3)     --> runs same test 3 times in 3 differnt threads at the same time , Works only when invocationCount > 1
    // @Test(timeOut = 10) --> Maximum time allowed for each test invocation (in milliseconds eg 10 millliseconds)

    // @Test(threadPoolSize = 3,invocationCount = 3, timeOut = 10)
    /*
    What happens at runtime?
    1. Test runs 3 times
    2. All 3 run in parallel
    3. Each run must finish within 5 seconds

     */
    @Test
    public void test1() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        System.out.println("Hello Test1 " + Thread.currentThread());
        driver.quit();
    }



    //@Test(threadPoolSize = 3,invocationCount = 3, timeOut = 10)
    @Test
    public void test2() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://www.Test.com/");
        Thread.sleep(3000);
        System.out.println("Hello Test2 " + Thread.currentThread());
        driver.quit();
    }


    @Test
    public void test3() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://www.selenium.com/");
        Thread.sleep(3000);
        System.out.println("Hello Test2 " + Thread.currentThread());
        driver.quit();
    }


    @Test
    public void test4() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://www.wll.com/");
        Thread.sleep(3000);
        System.out.println("Hello Test4 " + Thread.currentThread());
        driver.quit();
    }
}
