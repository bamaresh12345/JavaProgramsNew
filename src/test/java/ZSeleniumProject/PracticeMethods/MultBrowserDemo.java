package ZSeleniumProject.PracticeMethods;

import ZSeleniumProject.ZParallelExecution.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
cross Browser testing is a type of non-functional testing that lets you check whether your website works as intended when
accessed through: multipe browers like chrome, Edge,safari, and firefox browsers

mention this in testNg.xml file
 <parameter name="browserName" value="chrome"></parameter>

 mention below code in .java file
   @BeforeTest
   @Parameters("browserName")
   public void setup(String browserNaame)

 */

    public class MultBrowserDemo {

        WebDriver driver =null;
        @BeforeTest
        @Parameters("browserName")
        public void setup(String browserNaame)
        {
            if(browserNaame.equalsIgnoreCase("chrome"))
            {
                driver = new ChromeDriver();
                WebDriverManager.setDriver(driver);
            }
            else if (browserNaame.equalsIgnoreCase("IE"))
            {
                driver = new InternetExplorerDriver();
                WebDriverManager.setDriver(driver);
            }
            else if (browserNaame.equalsIgnoreCase("firefox"))
            {
                driver = new FirefoxDriver();
                WebDriverManager.setDriver(driver);
            }

            else if (browserNaame.equalsIgnoreCase("safari"))
            {
                driver = new SafariDriver();
            }
        }

        @Test
        public void test1() throws InterruptedException
        {
            WebDriverManager.getDriver().get("https://google.com");
            Thread.sleep(3000);
        }

        @Test
        public void test2() throws InterruptedException
        {
            WebDriverManager.getDriver().get("https://yahoo.com");
            Thread.sleep(3000);
        }

        @AfterTest
        public void teardown()
        {
            driver.quit();
            System.out.println(" Test completed successfully");

        }
}
