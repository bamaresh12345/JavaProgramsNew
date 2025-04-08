package ZInterviewOOPSConcepts.Inheretenc;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HelperClass extends  baseClass{


    //int helperValue=0;
    //String helperString="tesitng";
    @Override
    public void SelectDropdownValue(WebElement ele, String value) {
       // super.SelectValue_Non_StaticMethod(ele, value); Yes or no our wish
        System.out.println("Adding enter KeyWord");
        System.out.println("KeyWord Down");

        //get text and validate with string
        // getOptions get allvalies and int size = allEelments.size();
        while(true) {  // size > 0
            String s = ele.getText();
            if (s.equals(value)) {
                ele.sendKeys(Keys.RETURN);
            } else {
                ele.sendKeys(Keys.DOWN);
            }

        }
    }
}
