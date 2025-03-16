package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverManager;

public class ResetPasswordPage {
    private WebDriver driver;
    private final By usernameField = By.xpath("//input[@name='username']");
    private final WebElement cancelButton = driver.findElement(By.xpath("//button[contains(@class,'button--cancel')]"));
    private final WebElement resetButton = driver.findElement(By.xpath("//button[contains(@class,'button--reset')]"));

    public ResetPasswordPage(){
        this.driver = DriverManager.getDriver();
    }
    public void sendUserName(String name){
        driver.findElement(usernameField).sendKeys(name);
    }
    public void clickCancelButton(){
        cancelButton.click();
    }
    public void clickResetButton(){
        resetButton.click();
    }
}
