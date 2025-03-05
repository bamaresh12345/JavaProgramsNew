package zPlayWrightProject.Tests;


import org.testng.annotations.Test;
import zPlayWrightProject.Pages.LoginPage;
import zPlayWrightProject.baseClass.BaseClass;

public class LoignTests extends BaseClass {
    public LoignTests() {
    }

    @Test
    public void LoginUser() {
        this.launchPlayWright();
        LoginPage lp = new LoginPage(this.page);
        lp.setUserName("Hello");
        lp.setPassword("Hello");
        lp.clickLoginButton();
    }
}