package org.tms.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.tms.pages.ContextMenuPage;
import org.tms.pages.FramesPage;
import org.tms.services.PageService;

public class ContextMenuTest extends BaseTest{

    public ContextMenuPage contextMenuPage;

    @BeforeClass
    public void before(){
        PageService pageService = new PageService();
        contextMenuPage = new ContextMenuPage();
        pageService.openContextMenuPage();
    }
    @Test
    public void checkContextMenuPage(){
        String expectedText = "You selected a context menu";
        Assert.assertEquals(contextMenuPage.clickOnButton(), expectedText,
                "The actual text of the page does not match expected");
    }
}
