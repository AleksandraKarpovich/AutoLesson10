package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.pages.DynamicControlsPage;
import org.tms.services.PageService;

public class DynamicControlsTest extends BaseTest{

    public DynamicControlsPage dynamicControlsPage;

    @BeforeClass
    public void before(){
        PageService pageService = new PageService();
        dynamicControlsPage = new DynamicControlsPage();
        pageService.openDynamicControlsPage();
    }

    @Test
    public void checkDynamicControlsPage() {
        String expectedText = "Good test";
        Assert.assertEquals(dynamicControlsPage.verifyDynamicControls(), expectedText,
                "The actual text of the page does not match expected");
    }
}
