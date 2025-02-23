package PracticeMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {

    @Test(dataProvider = "LoginData")    /// *** IMP NOTE NOT @Dataprovider its just dataProvider @ is there for Test
    public void loginTest(String userName, String password, String expectedValue) {

        System.out.println(userName +" " +password +" " + expectedValue);  // No For loop need to read all data from data Provider
         // it will run automatically 4 iterations

    }

    @DataProvider(name = "LoginData")
    public String[][] getData() {
        String loingData[][] = {
                {"admin@yourstore.com", "admin", "Valid"},
                {"admin@yourstore.com", "adm", "Invalid"},
                {"adm@yourstore.com", "admin", "Invalid"},
                {"admin@yourstore.com", "adm", "Invalid"},


        };
           return loingData; // *** IMP
    }


    @Test(dataProvider = "LoginData")    /// *** IMP NOTE NOT @Dataprovider its just dataProvider @ is there for Test
    public void loginTest2(String userName, String password, String expectedValue) {
        /* No For loop need to read all data from data Provider
        / it will run automatically 4 iterations */

        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/");

        WebElement userNameEle = driver.findElement(By.xpath("//input[@id='Email']"));
        userNameEle.clear();
        userNameEle.sendKeys(userName);

        WebElement userPasswordEle = driver.findElement(By.xpath("//input[@id='Password']"));
        userPasswordEle.clear();
        userPasswordEle.sendKeys(userName);

        driver.findElement(By.xpath("//input[text()='Log in']")).click();


        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();



        if(expectedValue.equals("Valid"))
        {
            if(expectedTitle.contains(actualTitle)) {
                Assert.assertTrue(true);
                driver.findElement(By.xpath("//a[text()='Logout']")).click();
            }
            else
            {
                Assert.assertTrue(false);
            }

        }

        else if(expectedValue.equals("Invalid")) {

            if(expectedTitle.contains(actualTitle)) {
                Assert.assertTrue(false);
                driver.findElement(By.xpath("//a[text()='Logout']")).click();
            }
            else
            {
                Assert.assertTrue(true);
            }
        }




    }



}
