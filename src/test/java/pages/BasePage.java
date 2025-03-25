package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;
import utils.EnvDataReader;

import java.time.Duration;

public abstract class BasePage {

    private final By locator;
    protected WebDriver driver;
    WebDriverWait wait;


    public BasePage(By locators) {
        this.driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(EnvDataReader.getEnvData().getWait()));
        this.locator = locators;
    }


    // Page load validation
    public boolean isDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }

    // Wait for the page to load
    public void waitForPageToLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    protected void sendKeys(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    protected boolean isElementPresent(By locator) {
        return !driver.findElements(locator).isEmpty();
    }
}
