package zPlayWrightProject.baseClass;



import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseClass {
    public Playwright pt;
    public Browser browser;
    public Page page;

    public BaseClass() {
    }

    public void launchPlayWright() {
        this.pt = Playwright.create();
        this.browser = this.pt.chromium().launch((new BrowserType.LaunchOptions()).setHeadless(false));
        this.page = this.browser.newPage();
        this.page.navigate("https://omayo.blogspot.com/");
    }

    public void closePlayWright() {
        this.pt.close();
        this.browser.close();
        this.page.close();
    }
}