package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverManager;
import utils.TestDataReader;

public class LoginPage extends BasePage {
    private final By usernameField = By.xpath("//input[@name='username']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By logInButtonField = By.xpath("//button[contains(@class,'orangehrm-login-button')]");
    private final By forgetPasswordField = By.xpath("//p[contains(@class,'orangehrm-login-forgot-header')]");

    public LoginPage(){
        super(By.xpath("//div[contains(@class,'orangehrm-login-slot')]"));
        this.driver = DriverManager.getDriver();
    }

    public void setUserName(String usernames){
        sendKeys(usernameField,usernames);
    }
    public void setPassword(String passwords){
        sendKeys(passwordField,passwords);
    }
    public void clickOnLoginButton(){
       click(logInButtonField);
    }
    public void clickOnForgetPassword(){
       click(forgetPasswordField);
    }
}
