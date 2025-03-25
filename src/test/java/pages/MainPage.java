package pages;

import constants.LocatorConstant;
import constants.PageNavigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static io.qameta.allure.Allure.step;

public class MainPage extends BasePage {
    private final By pageName = By.xpath("//h6[contains(@class,'oxd-topbar-header-breadcrumb-module')]");

    public MainPage() {
        super(By.xpath(String.format(LocatorConstant.PRECISE_TEXT_XPATH, "Dashboard")));
    }

    private By getNavigationLink(PageNavigation navigation) {
        return By.xpath(String.format(LocatorConstant.PRECISE_TEXT_XPATH, navigation.getLabel()));
    }


    public void clickNavigationLink(PageNavigation navigation) {
        By link = getNavigationLink(navigation);
        step("Click on the " + navigation);
        driver.findElement(link).click();
    }

    public String getPageName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(pageName));
        return driver.findElement(pageName).getText();
    }
}
