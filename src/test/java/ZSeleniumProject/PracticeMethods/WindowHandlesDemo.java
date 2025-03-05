package ZSeleniumProject.PracticeMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandlesDemo {

    @Test
    public void NewWindow_HandleDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

       String mainWindow =  driver.getWindowHandle();
        System.out.println(mainWindow);
       Set<String> childWindows = driver.getWindowHandles();

       for (String handle: childWindows)
       {
           if(!handle.equals(mainWindow))
           {
               driver.switchTo().window(handle);
               Thread.sleep(1000);
               driver.manage().window().maximize();
               driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Testing");
               driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("lastName");
               Thread.sleep(2000);
               driver.close();
           }
       }
       driver.switchTo().window(mainWindow); // Switching to main Window

        String s= driver.findElement(By.xpath("//button[@id='newTabBtn']")).getAttribute("class");
        Assert.assertEquals(s,"whButtons1");
        driver.quit();

    }

    @Test
    public void NewTAB_Window_HandleDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();

        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        Set<String> childWindows = driver.getWindowHandles();

        for (String handle : childWindows) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                Thread.sleep(1000);
                driver.manage().window().maximize();
                driver.findElement(By.xpath("//button[@id='promptBox']")).click();
                Alert myAlerts = driver.switchTo().alert();
                myAlerts.accept();
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);   // Switching to main Window

        String s= driver.findElement(By.xpath("//button[@id='newTabBtn']")).getAttribute("class");
        Assert.assertEquals(s,"whButtons1");
        driver.quit();
    }
}
