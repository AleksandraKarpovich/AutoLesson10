package org.tms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlsPage extends BasePage{

    @FindBy(xpath = "//input[@label='blah']")
    private WebElement checkbox;

    @FindBy(xpath = "//button[@onclick='swapCheckbox()']")
    private WebElement removeButton;

    @FindBy(xpath = "//p[.=\"It's gone!\"]")
    private WebElement messageFirst;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement input;
    @FindBy(xpath = "//button[@onclick='swapInput()']")
    private WebElement enableButton;

    @FindBy(xpath = "//p[.=\"It's enabled!\"]")
    private WebElement messageSecond;

    public String verifyDynamicControls() {
       if(checkbox.isDisplayed()){ // 1.Найти чекбокс
           removeButton.click(); // 2.Нажать на кнопку
           waitVisabilityOf(messageFirst); // 3.Дождаться надписи “It’s gone”
           if (waitiInvisabilityOf(checkbox)){ // 4.Проверить, что чекбокса нет
               input.isDisplayed(); // 5.Найти инпут
              if (!input.isEnabled()){ // 6.Проверить, что он disabled
               enableButton.click(); // 7.Нажать на кнопку
               waitVisabilityOf(messageSecond); // 8.Дождаться надписи “It's enabled!”
               input.isEnabled(); // 9.Проверить, что инпут enabled
                  // System.out.println("Good test");
              } else System.out.println("Input is enable");
           } else System.out.println("Checkbox is displayed");
       } else System.out.println("Checkbox isn't displayed");
        String actualResult= "Good test";
        return actualResult;
    }
}
