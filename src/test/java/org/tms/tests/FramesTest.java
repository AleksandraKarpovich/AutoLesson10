package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.pages.FileUploadPage;
import org.tms.pages.FramesPage;
import org.tms.services.PageService;

public class FramesTest extends BaseTest{

    public FramesPage framesPage;

    @BeforeClass
    public void before(){
        PageService pageService = new PageService();
        framesPage = new FramesPage();
        pageService.openFramesPage();
    }

    @Test
    public void test() {
        framesPage.clickToFramesPage();
        String expectedText = "Your content goes here.";
        Assert.assertEquals(framesPage.checkText(), expectedText,
                "The actual text of the page does not match expected");
    }
}
