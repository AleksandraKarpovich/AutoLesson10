package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage{

    protected static final String FILE_PATH = "C:\\Users\\Администратор\\testFile.txt";

    @FindBy(xpath = "//input[@id='file-upload']")
    private WebElement chooseFileButton;

    @FindBy(xpath = "//input[@id='file-submit']")
    private WebElement submitFileButton;
    @FindBy(xpath = "//div[@id='uploaded-files']")
    private WebElement sectionWithName;

    public String toUploadFile() {
        chooseFileButton.sendKeys(FILE_PATH);
        submitFileButton.click();
        String actualResult = sectionWithName.getText();
        return actualResult;
    }
}
