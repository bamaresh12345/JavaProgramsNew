package ZSeleniumProject.PageObjects;

import com.microsoft.playwright.Page;

public class LoginPage {
    private final Page page;
    String userName = "//input[@name='userid']";
    String password = "//input[@name='pswrd']";
    String loginButton = "//input[@type='button' and @value='Login']";

    public LoginPage(Page page) {
        this.page = page;
    }

    public void setUserName(String userName1) {
        this.page.locator(this.userName).fill(userName1);
    }

    public void setPassword(String pwd) {
        this.page.locator(this.password).fill(pwd);
    }

    public void clickLoginButton() {
        this.page.locator(this.loginButton).click();
    }
}