package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import com.powerApp.framework.base.LocalDriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Set;

/**
 * Created by Ibi on 08/01/2023.
 */
public class SharePointRequestPortalPage extends BasePage {


    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Request Here')]")
    private WebElement RequestHereButton;

    @FindBy(how = How.XPATH, using = "//div[(@class='ms-DetailsList-contentWrapper' and @role='presentation')][position()=1]/child::div/child::div/child::div/child::div/child::div[position()=1]/child::div[@role='presentation'][position()=1]/child::div/child::div/child::div[position()=2]/child::div[position()=1]/child::div/child::div[position()=1]/child::span/child::span[position()=2]/child::button")
    private WebElement SharePointRequestPortalPageWorkspaceName;

    @FindBy(how = How.XPATH, using = "//div[(@class='ms-DetailsList-contentWrapper' and @role='presentation')][position()=1]/child::div/child::div/child::div/child::div/child::div[position()=1]/child::div[@role='presentation'][position()=1]/child::div/child::div/child::div[position()=2]/child::div[position()=3]/child::div")
    private WebElement SharePointRequestPortalPageProvisioningStatus;

    @FindBy(how = How.XPATH, using = "//div[(@class='ms-DetailsList-contentWrapper' and @role='presentation')][position()=1]/child::div/child::div/child::div/child::div/child::div[position()=1]/child::div[@role='presentation'][position()=1]/child::div/child::div/child::div[position()=2]/child::div[position()=15]/child::div[position()=2]")
    private WebElement SharePointRequestPortalPageTeamOwners2;

    @FindBy(how = How.XPATH, using = "//div[(@class='ms-DetailsList-contentWrapper' and @role='presentation')][position()=1]/child::div/child::div/child::div/child::div/child::div[position()=1]/child::div[@role='presentation'][position()=1]/child::div/child::div/child::div[position()=2]/child::div[position()=24]/child::div/child::div/child::span/child::div/child::div")
    private WebElement SharePointRequestPortalPageCreatedBy;

    @FindBy(how = How.XPATH, using = "//div[(@id='spLeftNav')]/child::div/child::nav/child::div/child::div/child::ul/child::li[position()=6]/child::div/child::a/child::span")
    private WebElement SharePointRequestPortalPageWorkspaceDirectory;


    public PowerAppIntroductionPage ClickRequestHere() throws InterruptedException {

        System.out.println("parent "+LocalDriverContext.getRemoteWebDriver().getCurrentUrl());
        DriverContext.WaitForElementToBeClickable(RequestHereButton);
        //DriverContext.WindowHandling();
        DriverContext.WaitForPageToLoad();
        return GetInstance(PowerAppIntroductionPage.class);
    }

    public void ClickSiteSubHeader(){

        DriverContext.WaitForElementToBeClickable(SharePointRequestPortalPageWorkspaceDirectory);
    }

    public String GetWorkspaceName(){

        return SharePointRequestPortalPageWorkspaceName.getText();
    }

    public String GetProvisioningStatus() throws InterruptedException {

        Thread.sleep(3000);

        DriverContext.ScrollToTheLeft(300);
        System.out.println("provisioning status is: "+SharePointRequestPortalPageProvisioningStatus.getText());
        return SharePointRequestPortalPageProvisioningStatus.getText();
    }

    public String GetTeamOwners2() throws InterruptedException {

        Thread.sleep(3000);
        DriverContext.ScrollToTheLeft2(2000);
        System.out.println("owners is: "+SharePointRequestPortalPageTeamOwners2.getText());
        return SharePointRequestPortalPageTeamOwners2.getText();
    }

    public String GetCreatedBy() throws InterruptedException {

        Thread.sleep(3000);
        DriverContext.ScrollToTheLeft3(3500);
        return SharePointRequestPortalPageCreatedBy.getText();
    }
}
