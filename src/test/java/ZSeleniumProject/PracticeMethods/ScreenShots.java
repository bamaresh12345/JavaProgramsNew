package ZSeleniumProject.PracticeMethods;


import ZSeleniumProject.BaseClass.baseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShots extends baseClass {
    @Test
    public void screenshot() throws InterruptedException, IOException {

        WebDriver diver = new ChromeDriver();
        diver.get("https://www.google.com/");
        Thread.sleep(3000);
        System.out.println(System.getProperty("user.dir"));

        TakesScreenshot tsk = (TakesScreenshot) driver;
          File srcFile = tsk.getScreenshotAs(OutputType.FILE);
          File disFile = new File(System.getProperty("user.dir")+"\\target\\ScreenShots\\fullPage.png");
          FileUtils.copyFile(srcFile,disFile);
         //srcFile.renameTo(disFile);  // OR

          // Method2 group of elements screenshots --> just get the xpath and pass it
        WebElement form = driver.findElement(By.xpath("//div[@class='form-group']"));

        File sourceFile2 = form.getScreenshotAs(OutputType.FILE);
        File distFile2 = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ScreenShots\\form.png" );
        FileUtils.copyFile(sourceFile2,distFile2);
        //sourceFile2.renameTo(distFile2);  // OR





    }



}
