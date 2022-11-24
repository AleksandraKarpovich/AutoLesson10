package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.pages.DynamicControlsPage;
import org.tms.pages.FileUploadPage;
import org.tms.services.PageService;

public class FileUploadTest extends BaseTest{

    public FileUploadPage fileUploadPage;

    @BeforeClass
    public void before(){
        PageService pageService = new PageService();
        fileUploadPage = new FileUploadPage();
        pageService.openFileUploadPage();
    }

    @Test
    public void checkDynamicControlsPage() {
        String expectedText = "testFile.txt";
        Assert.assertEquals(fileUploadPage.toUploadFile(), expectedText,
                "The actual text of the page does not match expected");

    }
}
