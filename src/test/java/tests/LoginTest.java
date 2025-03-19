package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestDataReader;

public class LoginTest extends BaseTest{
    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.setUserName(TestDataReader.getUserData().getUsername());
        loginPage.setPassword(TestDataReader.getUserData().getPassword());
        loginPage.clickOnLoginButton();

    }
}
