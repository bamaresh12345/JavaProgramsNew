package ZSeleniumProject.PracticeMethods;


import ZSeleniumProject.BaseClass.baseClass;
import com.aventstack.extentreports.Status;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

/* Alert : An Alert in Selenium is a small message box which appears on screen to give the user some information or
notification. It notifies the user with some specific information or error, asks for permission to perform
certain tasks and it also provides warning messages as well.
Types of Alerts in Selenium
1. simple alet message box , eg : when user is created by entering all the fileds, user xyz succesffyl created message is dispayed with ok button
2. prompt popup --> say there are list of users didaplyed and want to delete one usre, it shows , message box with
r u sure , you want to delete xyz user? with Yes and no button

in Selenium Webdriver, Alert interface provides the few methods they are
1. Switching to Alert
        Alert alert = driver.switchTo().alert();
2. Capturing alert message.
       String alertMessage= driver.switchTo().alert().getText();
applying differnt methods
Dismiss()
Accept()
getText()
sendKeys()

 */

public class AlertsExamples extends baseClass {

    private static final Logger log = LoggerFactory.getLogger(AlertsExamples.class);

    // to generate reports ****************INitalise test in @beofre test
    @BeforeTest
    public void startReport()
    {
       initalizeReport();
    }

    WebDriver driver = new ChromeDriver();
    @Test
    public void verify_AlertTest() throws InterruptedException {

        //WebDriver driver = WebDriverManager.getDriver();   // *** IMP
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //===Reports==================================
        String methdName =  new Exception().getStackTrace()[0].getMethodName();
        String className =  new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methdName,"verfiy Alert Messages Amar Tesitng");
        test.log(Status.INFO,"Starting opening the alerts page**");
        test.assignCategory("SmokeTest***");
        log.info("clik on page");
        //===Reports==================================

        String filePath=System.getProperty("user.dir"); // to get the dricetory
        System.out.println("file path " + filePath);

        // jsAlertButton -->  Ok button , we can select dismiss() or accept() methods --> both same
        WebElement jsAlertbutton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        jsAlertbutton.click();

        Alert myAlert = driver.switchTo().alert();
        Thread.sleep(1000);
        myAlert.accept();
        Thread.sleep(1000);

        // jsAlertButton -->  Ok and Cancel button , we can select dismiss() for cancel button & accept() for Ok or Yes buttons
        WebElement confrimAlert = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        confrimAlert.click();
        Thread.sleep(1000);

        Alert myAlert2 = driver.switchTo().alert();
        Thread.sleep(1000);
        myAlert2.accept();

        //verify results
        WebElement resultElement = driver.findElement(By.xpath("//p[@id='result']"));
        String result= resultElement.getText();
        Assert.assertEquals(result,"You clicked: Ok");

        confrimAlert.click();

        //verify results
        Alert myAlert3 = driver.switchTo().alert();
        myAlert3.dismiss();
        WebElement resultElement2 = driver.findElement(By.xpath("//p[@id='result']"));
        String result2= resultElement2.getText();
        Assert.assertEquals(result2,"You clicked: Cancel");



        // Click for JS Prompt button enter text

        WebElement jsPrompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsPrompt.click();
        Alert myAlert4 = driver.switchTo().alert();
        Thread.sleep(1000);
        myAlert4.dismiss();

        WebElement resultElement4 = driver.findElement(By.xpath("//p[@id='result']"));
        String result4= resultElement4.getText();
        Assert.assertEquals(result4,"You entered: null");


        WebElement jsPrompt2 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsPrompt.click();
        Alert myAlert5 = driver.switchTo().alert();
        Thread.sleep(1000);
        myAlert5.sendKeys("Hello");
        Thread.sleep(1000);
        myAlert5.accept();

        WebElement resultElement5 = driver.findElement(By.xpath("//p[@id='result']"));
        String result5= resultElement5.getText();
        Assert.assertEquals(result5,"You entered: Hello");

    }


    // to generate reports ****************INitalise test in @beofre test
    @AfterTest
    public void endReport()
    {
        extent.flush();   // writes everthing to the reports
    }
}
