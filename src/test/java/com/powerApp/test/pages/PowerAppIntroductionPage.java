package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import com.powerApp.framework.base.LocalDriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 03/01/2023.
 */
public class PowerAppIntroductionPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-label no-focus-outline middle')]")
    private WebElement PowerAppIntroductionPageTitleText;

    @FindBy(how = How.XPATH, using = "//div[(@data-container-name='NavigationButtonGallery-container')]/descendant::button")
    private WebElement PowerAppIntroductionPageSubTitleIntroduction;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-button-label no-focus-outline')]")
    private WebElement PowerAppIntroductionPageIntroduction;

    @FindBy(how = How.XPATH, using = "//div[(@id='idDiv_SAOTCS_Proofs_Section')]/descendant::div[@id='idDiv_SAOTCS_Proofs']/child::div/following-sibling::div/child::div/child::div/child::div/following-sibling::div")
    private WebElement VerifyYourIdentity;

    @FindBy(how = How.XPATH, using = "//div[(@class=' appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout')][position()=8]/descendant::div[@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_'][position()=5]")
    private WebElement BeginButton;

    @FindBy(how = How.XPATH, using = "//div[(@data-container-name='HeaderContainer-container')]/child::div/child::div[@data-control-name='AppTitle']/descendant::div[@class='appmagic-label no-focus-outline middle']")
    private WebElement TitlePage;

    public String GetTitleText() throws InterruptedException {

        DriverContext.WaitForPageToLoad();
        Thread.sleep(1000);
        //System.out.println("powerApp url "+ LocalDriverContext.getRemoteWebDriver().getCurrentUrl());
        //System.out.println("title is "+PowerAppIntroductionPageTitleText.getText());
        return TitlePage.getText();
    }

    public String GetSubTitleText() throws InterruptedException {

        DriverContext.WaitForPageToLoad();
        Thread.sleep(1000);
        //System.out.println("powerApp url "+ LocalDriverContext.getRemoteWebDriver().getCurrentUrl());
        //System.out.println("title is "+PowerAppIntroductionPageSubTitleIntroduction.getText());
        return PowerAppIntroductionPageSubTitleIntroduction.getText();
    }

    public boolean IsSubTitleTextPresent() throws InterruptedException {

        DriverContext.WaitForPageToLoad();
        Thread.sleep(10000);
        System.out.println("powerApp url "+ LocalDriverContext.getRemoteWebDriver().getCurrentUrl());
        //System.out.println("title is "+PowerAppIntroductionPageSubTitleIntroduction.getText());
        return PowerAppIntroductionPageSubTitleIntroduction.isDisplayed();
    }

    public void ClickCall(){

        DriverContext.WaitForElementToBeClickable(VerifyYourIdentity);
    }

    public PowerAppPurposePage ClickBegin() throws InterruptedException {

        DriverContext.SwitchFrame(0);
        DriverContext.WaitForElementToBeClickable(BeginButton);
        return GetInstance(PowerAppPurposePage.class);
    }
}
