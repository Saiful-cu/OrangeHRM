package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;
import utils.EnvDataReader;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    private final By locator;


    public BasePage(By locators) {
        this.driver = DriverManager.getDriver();
        this.locator = locators;
    }


    // Page load validation
    public boolean isPageLoaded() {
        return new WebDriverWait(driver, Duration.ofSeconds(EnvDataReader.getEnvData().getWait()))
                .until(ExpectedConditions.visibilityOfElementLocated(locator))
                .isDisplayed();
    }

    // Wait for the page to load
    public void waitForPageToLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(EnvDataReader.getEnvData().getWait()))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void click(By locator) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(EnvDataReader.getEnvData().getWait()))
                .until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    protected void sendKeys(By locator, String text) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(EnvDataReader.getEnvData().getWait()))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(EnvDataReader.getEnvData().getWait()))
                .until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getText();
    }

    protected boolean isElementPresent(By locator) {
        return !driver.findElements(locator).isEmpty();
    }
}
