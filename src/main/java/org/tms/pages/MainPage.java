package org.tms.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//a[@href='/context_menu']")
    private WebElement linkToContextMenu;

    @FindBy(xpath = "//a[@href='/dynamic_controls']")
    private WebElement linkToDynamicControlsMenu;
    @FindBy(xpath = "//a[@href='/upload']")
    private WebElement linkToFileUpload;
    @FindBy(xpath = "//a[@href='/frames']")
    private WebElement linkToFrame;

    public MainPage openPage(String url){
        driver.get(url);
        return this;
    }
    public void clickToContextMenuPage(){
        linkToContextMenu.click();
    }

    public void clickToDynamicControlsPage() {
        linkToDynamicControlsMenu.click();
    }

    public void clickToFileUploadPage(){
        linkToFileUpload.click();
    }

    public void clickToFramesPage(){
        linkToFrame.click();
    }
}
