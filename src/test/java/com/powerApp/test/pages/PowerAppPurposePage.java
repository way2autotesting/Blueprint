package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 12/01/2023.
 */
public class PowerAppPurposePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-border-inner appmagic-auto-height')]/child::div/child::div[position()=2]/child::div/child::div/child::div/child::div")
    private WebElement PowerAppPurposePageWhyDoYouNeedThisNewSite;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-border-inner appmagic-auto-height')]/child::div/child::div[position()=4]/child::div/child::div/child::div/child::div")
    private WebElement PowerAppPurposePageThisInformationWillPopulateTheDescription;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-border-inner appmagic-auto-height')]/child::div/child::div[position()=3]/child::div/child::div/child::div/child::div")
    private WebElement PowerAppPurposePageWhyDoYouNeedThisNewSiteIcon;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-border-inner appmagic-auto-height')]/child::div/child::div[position()=3]/child::div/child::div/child::div/child::div")
    private WebElement PowerAppPurposePageThisInformationWillPopulateTheDescriptionInformationIcon;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-border-inner appmagic-auto-height')]/child::div/child::div[position()=5]/child::div/child::div/child::div/child::div/child::textarea")
    private WebElement PowerAppPurposePageAddDescription;

    @FindBy(how = How.XPATH, using = "//div[(@class='powerapps-form-item formItem_1qwr9le')]/child::div[position()=2]/child::div/child::div/child::div/child::div[position()=2]/child::div/child::div/child::div/child::div")
    private WebElement PowerAppPurposePageWhatWouldYouLike;

    @FindBy(how = How.XPATH, using = "//div[(@class='powerapps-form-item formItem_1qwr9le')]/child::div[position()=2]/child::div/child::div/child::div/child::div[position()=3]/child::div/child::div/child::div/child::div")
    private WebElement PowerAppPurposePageWhatWouldYouLikeInformationIcon;

    @FindBy(how = How.XPATH, using = "//div[(@class='powerapps-form-item formItem_1qwr9le')]/child::div[position()=2]/child::div/child::div/child::div/child::div[position()=4]/child::div/child::div/child::div/child::div")
    private WebElement PowerAppPurposePageKeepItShort;

    @FindBy(how = How.XPATH, using = "//div[(@class='powerapps-form-item formItem_1qwr9le')]/child::div[position()=2]/child::div/child::div/child::div/child::div[position()=5]/child::div/child::div/child::div/child::div/child::input")
    private WebElement PowerAppPurposePageAddTheDesiredTitle;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_' and @data-control-name='NextArrow')]")
    private WebElement PowerAppPurposePageNextSection;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_' and @data-control-name='NextArrow')]/preceding-sibling::div")
    private WebElement PowerAppPurposePagePreviousSection;



    public String GetWhyDoYou(){

        return PowerAppPurposePageWhyDoYouNeedThisNewSite.getText();
    }

    public String GetThisInformationWill(){

        return PowerAppPurposePageThisInformationWillPopulateTheDescription.getText();
    }

    public String GetWhatWouldYouLike(){

        return PowerAppPurposePageWhatWouldYouLike.getText();
    }

    public String GetKeepItShort(){

        return PowerAppPurposePageKeepItShort.getText();
    }

    public void InputDescriptionToTheNewSitePurpose(String Description){

        DriverContext.enterText(PowerAppPurposePageAddDescription,Description);
    }

    public void InputDesiredTitleOfNewSitePurpose(String DesiredTitle){

        worldwideRandomNumber = getRandomString();
        DriverContext.enterText(PowerAppPurposePageAddTheDesiredTitle,DesiredTitle+worldwideRandomNumber);
    }

    public PowerAppActivityPage ClickNextSection(){

        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNextSection);
        DriverContext.WaitForPageToLoad();
        return GetInstance(PowerAppActivityPage.class);
    }

    public boolean IsPreviousSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePagePreviousSection);
    }

    public boolean IsNextSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePageNextSection);
    }
}
