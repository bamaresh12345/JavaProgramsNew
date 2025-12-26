package ZSeleniumProject.PracticeMethods;


import ZSeleniumProject.BaseClass.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
/*
Step 1) Import the “Select” package.
Step 2) Declare the drop-down element as an instance of the Select class. *** IMP  Select conutryDropDown = new Select(dropdown**);
3 methods
selectByVisibleText() --> Selects option exactly as shown on the UI.
selectByValue()  --> Selects using the value attribute.
selectByIndex()  --> Selects by position (0-based index).

isMultiple() --> Checks if the drop-down allows multiple selections, returns true or false
getOption() --> Returns all options in the drop-down list.  , return type

List<WebElement> options = driver.findElement(By.xpath("//select[@id='country']").getOptions();
for (WebElement option : options) {
    System.out.println(option.getText());
}


 */
public class DropDownSelectionMethods extends baseClass
{

    @Test(priority=1)
    public void selectFromDropDownList() throws InterruptedException {

        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();

        // get the dropdown web element
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));

        /*
        🔍 Why this line is necessary -- >Select conutryDropDown = new Select(dropdown);  // Select is class
            dropdown is just a WebElement
            Methods like
            selectByVisibleText(), selectByIndex(), selectByValue()
            do NOT belong to WebElement
            They belong to Selenium’s Select class

👉 Without creating a Select object, you cannot call those methods.
         */
        // create select instnace from the select class and use all 3 methods
        Select conutryDropDown = new Select(dropdown);
        conutryDropDown.selectByVisibleText("India");
        Thread.sleep(1000);
        conutryDropDown.selectByIndex(3);
        Thread.sleep(1000);
        conutryDropDown.selectByValue("japan");  // ** IMP japan select from HTML value
        Thread.sleep(1000);


        // to check if its multi select
        System.out.println("is Dropdown is Multiselect dropdown or Single select dropdown"+conutryDropDown.isMultiple());

        //getOptions to get the text of all dropdown values
        List<WebElement> dropdownElements = conutryDropDown.getOptions();

        for (WebElement dropDownValue : dropdownElements)
        {
            System.out.println(dropDownValue.getText());
        }



        }


    @Test(priority=1)
    public void selectFromDropDownList2() throws InterruptedException {


        driver = new ChromeDriver();
        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");

        WebElement dropdown = driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));

        dropdown.click();
        Thread.sleep(1000);
        WebElement dropdownVal = driver.findElement(By.xpath("//input[@value='Java']"));

        dropdownVal.click();
        Thread.sleep(1000);

        List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));

        //select only check boxes which are not selected HTML,CSS sohuld not be selected
        for (WebElement ele : elements)
        {
            if(!ele.isSelected()) {
                ele.click();
                Thread.sleep(1000);
                System.out.println(ele.getAttribute("value"));
           }
        }



        String option="Highest to lowest";

        WebElement dropdown1 =driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));

        dropdown.click();






    }
    @Test
         public void list() {

        WebDriver driver = new ChromeDriver();

         driver.get("https://www.bstackdemo.com/");

         driver.findElement(By.xpath("//select")).click();

         String option = "Highest to lowest";

        WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '" + option + "')]"));

        dropdown.click();

         System.out.println("clicked");

         }

    }

