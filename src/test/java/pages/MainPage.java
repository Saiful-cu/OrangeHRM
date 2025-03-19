package pages;

import constants.LocatorConstant;
import constants.PageNavigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.EnvDataReader;

import java.time.Duration;

public class MainPage extends BasePage {
    protected WebDriver driver;
    public MainPage(WebDriver driver) {
        super(By.xpath(String.format(LocatorConstant.PRECISE_TEXT_XPATH, "Dashboard")));
    }

    private By getNavigationLink(PageNavigation navigation) {
        return By.xpath(String.format(LocatorConstant.PRECISE_TEXT_XPATH, navigation));
    }

    public void clickNavigationLink(PageNavigation navigation) {
        By link  = getNavigationLink(navigation);
        new WebDriverWait(driver, Duration.ofSeconds(EnvDataReader.getEnvData().getWait()))
                .until(ExpectedConditions.visibilityOfElementLocated(link));
        driver.findElement(link).click();
    }
}
