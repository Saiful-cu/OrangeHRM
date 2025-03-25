package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utils.TestDataReader;

public class LoginTest extends BaseTest {
    private final MainPage mainPage = new MainPage();
    private final LoginPage loginPage = new LoginPage();

    @Test(priority = 1)
    public void VerifyLoginWithEmptyCredential() {
        loginPage.setUserName(" ");
        loginPage.setPassword(" ");
        loginPage.clickOnLoginButton();
        Assert.assertTrue(mainPage.isDisplayed(), "The Home page is not Displayed");
    }

    @Test(priority = 2)
    public void VerifyLoginWithInValidCredential() {
        loginPage.setUserName("Saiful");
        loginPage.setPassword("Password");
        loginPage.clickOnLoginButton();
        Assert.assertTrue(mainPage.isDisplayed(), "The Home page is not Displayed");
    }

    @Test(priority = 3)
    public void VerifyLoginWithValidCredential() {
        loginPage.setUserName(TestDataReader.getUserData().getUsername());
        loginPage.setPassword(TestDataReader.getUserData().getPassword());
        loginPage.clickOnLoginButton();
        Assert.assertTrue(mainPage.isDisplayed(), "The Home page is not Displayed");
    }
}
