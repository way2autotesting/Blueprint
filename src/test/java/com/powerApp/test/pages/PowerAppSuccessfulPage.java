package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import com.powerApp.framework.base.LocalDriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.powerApp.framework.base.DriverContext.parent;

/**
 * Created by Ibi on 23/01/2023.
 */
public class PowerAppSuccessfulPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name=\"LblSuccessMsg1\")]/child::div/child::div/child::div/child::div/child::div/child::div")
    private WebElement PowerAppSuccessfulPageFormSuccessfullySubmitted;

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name=\"Button9\")]/child::div/child::div/child::div/child::div/child::div/child::button/child::div")
    private WebElement PowerAppSuccessfulPageExitFormButton;

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name=\"Button10\")]/child::div/child::div/child::div/child::div/child::div/child::button/child::div")
    private WebElement PowerAppSuccessfulPageRequestAnotherSiteButton;



    public boolean IsRequestAnotherSiteButtonPresent(){

        return DriverContext.IsElementPresent(PowerAppSuccessfulPageRequestAnotherSiteButton);
    }

    public boolean IsExitFormButtonPresent(){

        return DriverContext.IsElementPresent(PowerAppSuccessfulPageExitFormButton);
    }

    public String GetFormSuccessfullySubmitted(){

        return PowerAppSuccessfulPageFormSuccessfullySubmitted.getText();
    }

    public SharePointRequestPortalPage SwitchToWorkspaceRequestPortal() throws InterruptedException {

        LocalDriverContext.getRemoteWebDriver().switchTo().window(parent);
        DriverContext.WaitForPageToLoad();
        Thread.sleep(5000);
        return GetInstance(SharePointRequestPortalPage.class);
    }
}
