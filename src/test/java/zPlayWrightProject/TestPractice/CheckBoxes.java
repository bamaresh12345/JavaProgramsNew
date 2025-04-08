package zPlayWrightProject.TestPractice;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxes {

       /*public Playwright pt;
    public Browser browser;
    public Page page;

     */

    @Test
    public void CheckBoxes() {

        Playwright pp = Playwright.create();
        Browser browser = pp.chromium().launch((new BrowserType.LaunchOptions()).setHeadless(false));
        Page page = browser.newPage();
        // page.navigate("https://omayo.blogspot.com/");
        page.navigate("https://testautomationpractice.blogspot.com/");
        boolean b;
        page.locator("id=country").selectOption("Japan");// id locator
        page.getByLabel("Sunday").click();
        System.out.println(page.getByLabel("Sunday").isChecked()); // true
        System.out.println(page.getByLabel("Sunday").isDisabled()); // false
        System.out.println(page.getByLabel("Sunday").isEnabled()); // true
        System.out.println(page.getByLabel("Sunday").isVisible()); // true
        System.out.println(page.getByLabel("Sunday").isEditable()); // true

      //  Assert.assertEquals(page.getByLabel("Sunday").isChecked(),true);


        Locator dayLocater =  page.locator("id=country");

        dayLocater.selectOption("India");
        dayLocater.selectOption("Japan");
        dayLocater.selectOption("China");
        dayLocater.selectOption(new SelectOption().setIndex(2));
        dayLocater.selectOption(new SelectOption().setValue("japan"));
        dayLocater.selectOption(new SelectOption().setLabel("India"));

        Locator dayLocater2 =  page.locator("id=colors");

        // Single selection matching the label
        //page.getByLabel("Country:").selectOption({ label: "Blue" });


        // Multiple selected items
        //page.getByLabel("Colors:").selectOption(["red", "green", "blue"]);
        // page.getByLabel("Colors:").selectOption(['red', 'green', 'blue']);
        // page.getByLabel("Colors:").selectOption(['red', 'green', 'blue']);

        page.locator("id=email").fill("test@test.com");
        page.locator("[placeholder='Enter Name']").clear();
        page.locator("[placeholder='Enter EMail']").clear();
        page.locator("id=phone").fill("23412342134");
    }
}
