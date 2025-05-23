package ZSeleniumProject.BaseClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

public class baseClass {

    public WebDriver driver;
    public Properties prop;
    public String browserName="CHROME";

    //=======Extent reports declare 3 variables================================
    // declare two methods 1. (initalizaiton of reports) and 2. (capturing the screenshots)
    public static ExtentSparkReporter sparkReporter;
    public static ExtentReports extent;               //import import com.aventstack.extentreports;** IMP else failes
    public static ExtentTest test;
    //==========================================

    @BeforeClass  // --> **** IMP

    //@Parameters("browserName")
     public void setup() throws IOException {
       driver = new ChromeDriver();   // OR

      //  WebDriver driver = WebDriverManager.getDriver();   // *** IMP


       driver.get("https://testautomationpractice.blogspot.com/");

       String filePath=System.getProperty("user.dir"); // to get the dricetory
        System.out.println("filePath--> " + filePath);
       File file = new File(filePath + "\\target\\resources\\config.properties");
        FileInputStream fis = new FileInputStream(file);
        prop = new Properties();
        prop.load(fis);


       // Mulit borwser setup method
        String browserNaame ="chrome";
        if(browserNaame.equalsIgnoreCase("chrome"))
        {
           // driver = new ChromeDriver();
        }

        else if (browserNaame.equalsIgnoreCase("IE"))
        {
            driver = new InternetExplorerDriver();
        }

        else if (browserNaame.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }



    }

//**************Extend Report Method
    public void initalizeReport()
    {
        System.out.println("report==>" + System.getProperty("user.dir") );
        sparkReporter = new ExtentSparkReporter( System.getProperty("user.dir") + "target/ScreenShots/extentSparkReport.html");
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Automation Test execution report");
        sparkReporter.config().setTheme(Theme.DARK);  //Theme.STANDARD
        sparkReporter.config().setTimeStampFormat("EEEE MMMM dd, yyyy, hh:mm a '('zzz')'");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);



    }

// ******Extend Report Method *** Capture screenshot
    public static String captureScreenshot(WebDriver driver) throws IOException {

        String FileSeperator =System.getProperty("file.seperator");
        String Extent_report_path = "." + FileSeperator + "Reports";
        String ScreenShotPath = Extent_report_path+FileSeperator+"screenshots";

        TakesScreenshot tsk = (TakesScreenshot) driver;
        File srcfile = tsk.getScreenshotAs(OutputType.FILE);
        String screenshotName = "screenshot"+Math.random()+".png";
        String screenshotpath = ScreenShotPath+FileSeperator+screenshotName;
        FileUtils.copyFile(srcfile, new File(screenshotpath));

        return "."+FileSeperator+"screenshots"+FileSeperator+screenshotName;
    }



    public static Boolean waitForElementToBeClickable(WebElement clickableElement, WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            wait.until(ExpectedConditions.elementToBeClickable(clickableElement));
            Thread.sleep(500);
            System.out.println("Waited for element to be Click: " +clickableElement);
        } catch (Exception e) {
            System.out.println("Element " + clickableElement + " was not waited for Clickable: " +e.getStackTrace());
            return false;
        }
        return true;
    }


    public  static void clickOnWebElement(WebElement element, WebDriver driver) {
        try {
            JavascriptExecutor js = (JavascriptExecutor)  driver;
            js.executeScript("arguments[0].click();", element);
            System.out.println("Clicked on Web element: " +element);
        } catch (Exception e) {
            System.out.println("Element " + element + " was not Clickable: " +e.getStackTrace());
        }
    }

    public  static void clickOnWebElement(By locator , WebDriver driver) {
        try {
            driver.findElement(By.xpath(String.valueOf(locator))).click();
        } catch (Exception e) {
            System.out.println("Element " + String.valueOf(locator) + " was not Clickable: " +e.getStackTrace());
        }
    }

    public static String getTextFromWebElement(WebElement element, WebDriver driver) {
        String text1 = null;
        try {
            text1 = element.getText();
            System.out.println("Captured Text from Web Element: " + element);
        } catch (Exception e) {
            System.out.println("Element " + element + " was not found in Web page: " + e.getStackTrace());
            return text1;
        }
        return text1;
    }


    public void selectDataFromDropdownList(WebElement element, String text) {
        try {
            Select dropdown = new Select(element);
            Thread.sleep(2000);
            dropdown.selectByVisibleText(text);
            Thread.sleep(1000);
            System.out.println("Selected Visible text from Element: " + element);
        } catch (Exception e) {
            System.out.println("Element " + element + " was not available for Selected Text: " + e.getStackTrace());
        }
    }

    public void selectDataFromDropdownList(WebElement element, int index) {
        try {
            Select dropdown = new Select(element);
            Thread.sleep(2000);
            dropdown.selectByIndex(index);
            Thread.sleep(1000);
            System.out.println("Selected Visible text from Element: " + element);
        } catch (Exception e) {
            System.out.println("Element " + element + " was not available for Selected Text: " + e.getStackTrace());
        }
    }
    public void selectDataFromDropdownListByIndex(WebElement element, int index) {
        try {
            Select dropdown = new Select(element);
            dropdown.selectByIndex(index);
            System.out.println("Selected text based on Index Value from Element: " + element);
        } catch (Exception e) {
            System.out.println("Element " + element + " was not available for Selected Text: " + e.getStackTrace());
        }
    }

    public void selectTheCheckbox(WebElement element) {
        try {
            if (element.isSelected()) {
                System.out.println("Checkbox is already Selected: " + element);
            } else {
                element.click();
                System.out.println("Checkbox is Selected: " + element);
            }
        } catch (Exception e) {
            System.out.println("Element " + element + " was not found in Web page: " + e.getStackTrace());
        }
    }

    public void selectTheCheckbox(WebElement element,String s) {
        try {
            if (s.equals("Check") ) {
                System.out.println("Checkbox is already Selected: " + element);
            } else {
                element.click();
                System.out.println("Checkbox is Selected: " + element);
            }
        } catch (Exception e) {
            System.out.println("Element " + element + " was not found in Web page: " + e.getStackTrace());
        }
    }


    public void selectRadioButton(WebElement element) {
        try {
            if (element.isSelected()) {
                System.out.println("Radio button is already Selected: " + element);
            } else {
                element.click();
                System.out.println("Radio button is Selected: " + element);
            }
        } catch (Exception e) {
            System.out.println("Element " + element + " was not found in Web page: " + e.getStackTrace());
        }
    }


    public void switchToParentFrame() {
        try {
            driver.switchTo().defaultContent();
            driver.switchTo().parentFrame();
        } catch (Exception e) {
            System.out.println("Unable to switch to the Parent Frame: " + e.getStackTrace());
        }
    }

    public String switchToChildWindow() {
        String winHandleBefore = "";
        try {
            winHandleBefore = driver.getWindowHandle();
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            System.out.println("Window has been switched to: " + winHandleBefore);
        } catch (Exception e) {
            System.out.println("Unable to switch to the " + winHandleBefore + " Original Window: " + e.getStackTrace());
        }
        return winHandleBefore;
    }

    public void switchToWindow(String window) {
        try {
            driver.switchTo().window(window);
        } catch (Exception e) {
            System.out.println("Unable to switch to the Window: " + e.getStackTrace());
        }
    }

    public void takeScreenShoot(WebDriver driver, ITestNGMethod testMethod) throws Exception {

        TakesScreenshot tsk = (TakesScreenshot) driver;
        File srcFile = tsk.getScreenshotAs(OutputType.FILE);

        File disFile = new File(System.getProperty("user.dir")+"\\target\\ScreenShots\\fullPage.png");
        FileUtils.copyFile(srcFile,disFile);
        srcFile.renameTo(disFile);  // OR

        // Method2 group of elements screenshots --> just get the xpath and pass it
        WebElement form = driver.findElement(By.xpath("//div[@class='form-group']"));

        File sourceFile2 = form.getScreenshotAs(OutputType.FILE);
        File distFile2 = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ScreenShots\\form.png" );
        FileUtils.copyFile(srcFile,disFile);
        sourceFile2.renameTo(distFile2);  // OR

    }


    @AfterMethod
    public void tearDown(ITestResult testResult) throws Exception {

        String methodName = testResult.getMethod().getMethodName();
        Method method = this.getClass().getMethod(methodName);
        //className = this.getClass().getSimpleName();
        String testMethodName = method.getName();
        int methodExecutionStatus = testResult.getStatus();
        //UpdateExecutionStatusToJira updateTestCaseExecutionStatusToZephyrForJira = new UpdateExecutionStatusToJira();
        //updateTestCaseExecutionStatusToZephyrForJira.update(testMethodName, methodExecutionStatus);



        if (ITestResult.FAILURE == testResult.getStatus()) {
            takeScreenShoot(driver, testResult.getMethod());
        }

        switch(testResult.getStatus())
        {
            case ITestResult.SUCCESS:
                //finalTestRunResult.put(testMethodName, "PASS");
                break;
            case ITestResult.FAILURE:
                //finalTestRunResult.put(testMethodName, "FAIL");
                break;
            case ITestResult.SKIP:
                //finalTestRunResult.put(testMethodName, "SKIP");
                break;
            default:
                break;
        }
    }

    public String randomString()
    {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return generatedString;

    }

    public String randomNumber()
    {
        String randomNumber = RandomStringUtils.randomNumeric(5);
        return randomNumber;

    }

    public String randomAlphaNumeric()
    {
        String randomAlphaNum = RandomStringUtils.randomAlphanumeric(5);
        return randomAlphaNum;
    }



    @AfterClass   // --> **** IMP
    public void teardown() {
       driver.quit();
       driver.quit();
    }
}
