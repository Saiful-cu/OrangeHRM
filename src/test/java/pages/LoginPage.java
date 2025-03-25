package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    private final By usernameField = By.xpath("//input[@name='username']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By logInButtonField = By.xpath("//button[contains(@class,'orangehrm-login-button')]");
    private final By forgetPasswordField = By.xpath("//p[contains(@class,'orangehrm-login-forgot-header')]");

    public LoginPage() {
        super(By.xpath("//div[contains(@class,'orangehrm-login-slot')]"));
    }

    public void setUserName(String usernames) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        sendKeys(usernameField, usernames);
    }

    public void setPassword(String passwords) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        sendKeys(passwordField, passwords);
    }

    public void clickOnLoginButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(logInButtonField));
        click(logInButtonField);
    }

    public void clickOnForgetPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgetPasswordField));
        click(forgetPasswordField);
    }
}
