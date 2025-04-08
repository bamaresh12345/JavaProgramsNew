package zPlayWrightProject.TestPractice;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;
import zPlayWrightProject.baseClass.BaseClass;

public class TestBoxes extends BaseClass {

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

        page.locator("#name").fill("Hello");  // id locator
        page.locator("id=email").fill("test@test.com");  // id locator
        page.locator("[placeholder='Enter Name']").clear(); // locatoer by css
        page.locator("[placeholder='Enter EMail']").clear();
        page.getByLabel("Email:").clear();    //  locator  --> getByLabel
        page.locator("id=phone").fill("23412342134"); // locatoer id

    }
}
