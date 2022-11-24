package org.tms.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage{

    @FindBy(xpath = "//a[@href='/iframe']")
    private WebElement linkToFramesPage;

    @FindBy(xpath = "//iframe[@id=\"mce_0_ifr\"]")
    private WebElement frameId;
    @FindBy(xpath = "//p")
    private WebElement text;


    public void clickToFramesPage(){
        linkToFramesPage.click();
    }
    public String checkText(){
        driver.switchTo().frame(frameId);
        waitVisabilityOf(text);
        String actualText = text.getText();
        return actualText;
    }
}
