package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverManager;

public class LoginPage {
    private WebDriver driver;
    private final By usernameField = By.xpath("//input[@name='username']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By logInButtonField = By.xpath("//button[contains(@class,'orangehrm-login-button')]");
    private final By forgetPasswordField = By.xpath("//p[contains(@class,'orangehrm-login-forgot-header')]");

    LoginPage(){
       this.driver = DriverManager.getDriver();
    }
    public void setUserName(){
        WebElement username = driver.findElement(usernameField);
        username.sendKeys("username");
    }
    public void setPassword(){
        WebElement password = driver.findElement(passwordField);
        password.sendKeys("username");
    }
    public void clickOnLoginButton(){
        driver.findElement(logInButtonField).click();
    }
    public void clickOnForgetPassword(){
        driver.findElement(forgetPasswordField).click();
    }
}
