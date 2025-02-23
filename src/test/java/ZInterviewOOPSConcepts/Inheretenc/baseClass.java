package ZInterviewOOPSConcepts.Inheretenc;

import org.openqa.selenium.WebElement;

public class baseClass {

    public static String color = "blue";

    final int speedLimit =90;

    public static void SelectValue_StaticMethod(WebElement ele,String value)
    {
        System.out.println("SelectValue" + value);
    }

    public void SelectValue_Non_StaticMethod(WebElement ele,int value)
    {
        System.out.println("SelectValue : " + value);
    }

    public void SelectValue_Non_StaticMethod(WebElement ele,String value)
    {
        System.out.println("SelectValue : " + value);
    }


}
