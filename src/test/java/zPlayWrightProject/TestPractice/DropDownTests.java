package zPlayWrightProject.TestPractice;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;
import zPlayWrightProject.baseClass.BaseClass;

public class DropDownTests {


    /*public Playwright pt;
    public Browser browser;
    public Page page;

     */

    @Test
    public void TestBoxes() {

        Playwright pp = Playwright.create();
        Browser browser = pp.chromium().launch((new BrowserType.LaunchOptions()).setHeadless(false));
        Page page = browser.newPage();
        // page.navigate("https://omayo.blogspot.com/");
        page.navigate("https://testautomationpractice.blogspot.com/");

        page.locator("id=country").selectOption("Japan");// id locator
        page.getByLabel("Country:").selectOption("India");// locator --> getByLabel()

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