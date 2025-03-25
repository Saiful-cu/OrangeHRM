package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.DriverManager;
import utils.EnvDataReader;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get(EnvDataReader.getEnvData().getHost());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(EnvDataReader.getEnvData().getWait()));
    }

    @AfterSuite
    public void tearDown() {
        DriverManager.quitDriver();
    }
}