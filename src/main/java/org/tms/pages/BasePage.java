package org.tms.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver = DriverSingleton.getDriver();

    protected final static int WAIT_TIMEOUT_SECONDS = 10;
    protected BasePage() {
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitVisabilityOf(WebElement element){
        return new WebDriverWait(driver,Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.visibilityOf(element));
    }
    protected boolean waitiInvisabilityOf(WebElement element){
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.invisibilityOf(element));
    }
    protected Alert waitAlert() {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.alertIsPresent());
    }
}