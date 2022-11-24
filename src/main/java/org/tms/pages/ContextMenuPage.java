package org.tms.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class ContextMenuPage extends BasePage{

    @FindBy(xpath = "//div[@id='hot-spot']")
    private WebElement hotSpot;


    public String clickOnButton() {
        Actions actions = new Actions(driver);
        actions.contextClick(hotSpot).perform();
        Alert alert = driver.switchTo().alert();
        waitAlert();
        String actualText = alert.getText();
        alert.accept();
        return actualText;
    }
}
