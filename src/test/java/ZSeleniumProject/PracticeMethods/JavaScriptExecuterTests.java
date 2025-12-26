package ZSeleniumProject.PracticeMethods;

/*
🔹 What is JavaScriptExecutor in Selenium?
JavaScriptExecutor is an interface in Selenium that allows you to execute JavaScript code directly inside the browser from your
Selenium test.

It is used when normal Selenium methods fail or are not sufficient.
✅ Why is JavaScriptExecutor used?
Selenium interacts with web elements like a real user.
But sometimes:
Element is hidden
Element is not clickable
Page is heavy / dynamic
Page uses JavaScript frameworks (React, Angular)

👉 In such cases, Selenium actions like click() or sendKeys() may fail.

JavaScriptExecutor bypasses Selenium and talks directly to the browser’s DOM.

🔹 How to use JavaScriptExecutor
JavascriptExecutor js = (JavascriptExecutor) driver;  // (WebDriver is type-cast to JavascriptExecutor)


1️⃣ Click an element (when .click() fails) --> js.executeScript("arguments[0].click();", element);
1️⃣Send text into input field --> js.executeScript("arguments[0].value='Amar';", element);
3️⃣ Scroll the page  --> js.executeScript("window.scrollBy(0,500)");
Scroll until element: --> js.executeScript("arguments[0].scrollIntoView(true);", element);
 scroll to bottom of the page -->  js.executeScript("window.scrollBy(0,document.body.scrollWidth)");
 scroll to top of the page -->  js.executeScript("window.scrollBy(0,-document.body.scrollWidth)");
 */

import ZSeleniumProject.BaseClass.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecuterTests extends baseClass {


    @Test
    public void testJavaScriptExecuter() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(prop.getProperty("url"));

        //define the element
        WebElement nameBox = driver.findElement(By.xpath("//input[@id='name']"));
       // nameBox.sendKeys("Test");


        //define javaScriptExecuter
        JavascriptExecutor js = (JavascriptExecutor) driver;    // (WebDriver is type-cast to JavascriptExecutor)

        //js.executeScript("argument[0].click()", nameBox); // check practiacaly error dont scare , onnly e is missing
        js.executeScript("arguments[0].click()", nameBox); // click on element
        Thread.sleep(2000);
        //set value into Name edit box
        js.executeScript("arguments[0].setAttribute('value','test')",nameBox);
        //js.executeScript("document.getElementbyId('idemail').value",nameBox);


        /*ScrollDown
         * 1. scroll down till end of the page
         * 2. scroll down till the webelement
         * 3. scroll down till end of the pixel
         */

        WebElement comboBox = driver.findElement(By.xpath("//input[@id='comboBox']"));

        //scroll to page till the webelement is visible
        js.executeScript("arguments[0].scrollIntoView()", comboBox);
        Thread.sleep(2000);


        //scroll till the given pixel
        js.executeScript("window.scrollBy(0,1500)","");

        //scroll till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        System.out.println(js.executeScript("return window.pageYOffset;")); // prints y axes=is 15


        Thread.sleep(2000);

        //scroll top  of the page
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");  // ,-document will reverse the scrolling

        System.out.println(js.executeScript("return window.pageYOffset;")); // prints y axes=is 15


        // Scroll vertical in page and reverse vertical in a page
        // js.executeScript("window.scrollBy(0,document.body.scrollWidth)");
        // js.executeScript("window.scrollBy(0,-document.body.scrollWidth)");






    }



}
