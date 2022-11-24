package org.tms.services;

import org.tms.pages.*;

public class PageService {

    private static final String PAGE_URL= "https://the-internet.herokuapp.com/";

    protected MainPage mainPage = new MainPage();


    public ContextMenuPage openContextMenuPage(){
        mainPage.openPage(PAGE_URL)
                .clickToContextMenuPage();

        return new ContextMenuPage();
    }

    public DynamicControlsPage openDynamicControlsPage(){
        mainPage.openPage(PAGE_URL)
                .clickToDynamicControlsPage();

        return new DynamicControlsPage();
    }

    public FileUploadPage openFileUploadPage(){
        mainPage.openPage(PAGE_URL)
                .clickToFileUploadPage();

        return new FileUploadPage();
    }

    public FramesPage openFramesPage(){
        mainPage.openPage(PAGE_URL).clickToFramesPage();
        return new FramesPage();
    }
}