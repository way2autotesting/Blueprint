package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 21/01/2023.
 */
public class PowerAppRetentionPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[(@class=' appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout' and @data-control-name='Retention')]/descendant::div[@class='appmagic-typed-card card_c5uw0h'][position()=1]/child::div[position()=4]/descendant::div[@class='appmagic-label no-focus-outline top']/child::div")
    private WebElement PowerAppRetentionPageWillTheContentStoredwithinThisSiteOfNational ;

    @FindBy(how = How.XPATH, using = "//div[(@class=' appmagic-content-control-name appmagic-control-view canvasContentDiv' and @data-control-name='ExtendedValue_DataCard1_1')]/descendant::div[@class='appmagic-borderfill-container']/child::div/child::div/child::div/following-sibling::div/descendant::div[@class='appmagic-label no-focus-outline top']/child::div")
    private WebElement PowerAppRetentionPageWillTheContentInThisSite;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv _vst_' and @data-control-name='DataCardKey2_4')]/descendant::div[@class='appmagic-label no-focus-outline middle']/child::div")
    private WebElement PowerAppRetentionPageWillTheContentStoredWithinThisSiteOfOrganisational ;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_' and @data-control-name='NextArrow')]")
    private WebElement PowerAppPurposePageNextSection;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_' and @data-control-name='NextArrow')]/preceding-sibling::div")
    private WebElement PowerAppPurposePagePreviousSection;

    //@FindBy(how = How.XPATH, using = "//div[(@data-control-name='Nationally Significant_DataCard1_1')]/child::div/child::div/child::div/child::div[position()=7]/child::div/child::div/child::div/child::div/child::div[position()=3]/child::label/child::div[@class='appmagic-radio-placeholder']/child::*/child::*/child::*[@class='innerRadioCircle']")
    @FindBy(how = How.XPATH, using = "//div[@data-control-name='Radio3_1']/child::div/child::div/child::div/child::div/child::div[position()=3]")
    private WebElement PowerAppPurposePageNationalSignificantNo;

    @FindBy(how = How.XPATH, using = "//div[@data-control-name='Radio3_1']/child::div/child::div/child::div/child::div/child::div[position()=1]")
    private WebElement PowerAppPurposePageNationalSignificantAlmostCertainly;

    @FindBy(how = How.XPATH, using = "//div[@data-control-name='Radio3_1']/child::div/child::div/child::div/child::div/child::div[position()=2]")
    private WebElement PowerAppPurposePageNationalSignificantPossibly;

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name='Nationally Significant_DataCard1_1')]/child::div/child::div/child::div/child::div[position()=7]/child::div/child::div/child::div/child::div/child::div[position()=3]/child::label/child::input")
    private WebElement PowerAppPurposePageExtendedValueNo;

    @FindBy(how = How.XPATH, using = "//div[@data-control-name='Radio4_1']/child::div/child::div/child::div/child::div/child::div[position()=3]")
    private WebElement PowerAppPurposePageExtendedValue2No;

    @FindBy(how = How.XPATH, using = "//div[@data-control-name='Radio1']/child::div/child::div/child::div/child::div/child::div[position()=3]")
    private WebElement PowerAppPurposePageOrganisationSignificanceNo;

    //@FindBy(how = How.XPATH, using = "//div[@data-control-name='Gallery4_3']/child::div/child::div/child::div/child::div/child::div/following-sibling::div/child::div/child::div/child::div[position()=1]/child::div[contains(text(),'Item 1. Selected.')]")
    @FindBy(how = How.CSS, using = "#publishedCanvas > div > div:nth-child(2) > div > div > div:nth-child(1) > div > div > div > div > div:nth-child(2) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(7) > div > div > div > div > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(2) > div > div > div > div:nth-child(4) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > label > div.appmagic-checkbox-placeholder > svg > g > rect")
    private WebElement PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition1;

    @FindBy(how = How.XPATH, using = "//div[@data-control-name='Gallery4_3']/child::div/child::div/child::div/child::div/child::div/following-sibling::div/child::div/child::div/child::div[position()=2]/child::div[contains(text(),'Item 2')]")
    private WebElement PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition2;

    //@FindBy(how = How.XPATH, using = "//div[@data-control-name='Gallery4_3']/child::div/child::div/child::div/child::div/child::div/following-sibling::div/child::div/child::div/child::div[position()=3]/child::div[contains(text(),'Item 3')]")
    @FindBy(how = How.CSS, using = "#publishedCanvas > div > div:nth-child(2) > div > div > div:nth-child(1) > div > div > div > div > div:nth-child(2) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(7) > div > div > div > div > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(2) > div > div > div > div:nth-child(4) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(3) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > label > div.appmagic-checkbox-placeholder > svg > g > rect")
    private WebElement PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition3;

    @FindBy(how = How.XPATH, using = "//div[@data-control-name='Gallery4_3']/child::div/child::div/child::div/child::div/child::div/following-sibling::div/child::div/child::div/child::div[position()=4]/child::div[contains(text(),'Item 4')]")
    private WebElement PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition4;

    //@FindBy(how = How.XPATH, using = "//div[@data-control-name='Gallery4_3']/child::div/child::div/child::div/child::div/child::div/following-sibling::div/child::div/child::div/child::div[position()=5]/child::div[contains(text(),'Item 5')]")
    @FindBy(how = How.CSS, using = "#publishedCanvas > div > div:nth-child(2) > div > div > div:nth-child(1) > div > div > div > div > div:nth-child(2) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(7) > div > div > div > div > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(2) > div > div > div > div:nth-child(4) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(5) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > label > div.appmagic-checkbox-placeholder > svg > g > rect")
    private WebElement PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition5;



    public String GetFirstWillTheContentStoredWithinThisSiteOfNational(){

        return PowerAppRetentionPageWillTheContentStoredwithinThisSiteOfNational.getText();
    }

    public String GetSecondWillTheContentInThisSite(){

        System.out.println("text here : "+PowerAppRetentionPageWillTheContentInThisSite.getText());
        return PowerAppRetentionPageWillTheContentInThisSite.getText();
    }

    public String GetThirdWillTheContentStoredWithinThisSiteOfOrganisational(){

        return PowerAppRetentionPageWillTheContentStoredWithinThisSiteOfOrganisational.getText();
    }

    public boolean IsPreviousSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePagePreviousSection);
    }

    public boolean IsNextSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePageNextSection);
    }

    public void ClickNoRadioButtonNationalSignificance() throws InterruptedException {

        Thread.sleep(1000);
        //PowerAppPurposePageNationalSignificantNo.sendKeys(Keys.ENTER);
        //DriverContext.WaitForElementNotGettingToBeClickable(PowerAppPurposePageNationalSignificantNo);
        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNationalSignificantNo);
    }

    public void ClickAlmostCertainlyRadioButtonNationalSignificance() throws InterruptedException {

        Thread.sleep(1000);
        //PowerAppPurposePageNationalSignificantNo.sendKeys(Keys.ENTER);
        //DriverContext.WaitForElementNotGettingToBeClickable(PowerAppPurposePageNationalSignificantNo);
        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNationalSignificantAlmostCertainly);
    }

    public void ClickPossiblyRadioButtonNationalSignificance() throws InterruptedException {

        Thread.sleep(1000);
        //PowerAppPurposePageNationalSignificantNo.sendKeys(Keys.ENTER);
        //DriverContext.WaitForElementNotGettingToBeClickable(PowerAppPurposePageNationalSignificantNo);
        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNationalSignificantPossibly);
    }

    public void ClickNoRadioButtonExtendedValue() throws InterruptedException {

        Thread.sleep(1000);
        DriverContext.WaitForElementNotGettingToBeClickable(PowerAppPurposePageExtendedValue2No);
        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageExtendedValue2No);
    }

    public void ClickNoRadioButtonOrganisationalSignificance() throws InterruptedException {

        Thread.sleep(1000);
        DriverContext.WaitForElementNotGettingToBeClickable(PowerAppPurposePageOrganisationSignificanceNo);
        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageOrganisationSignificanceNo);
    }

    public PowerAppSecurityPage ClickNextSection(){

        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNextSection);
        DriverContext.WaitForPageToLoad();
        return GetInstance(PowerAppSecurityPage.class);
    }

    public void ITem1SelectedCheckboxBEISPrincipalPolicy(){

        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition1);
    }

    public void ITem2SelectedCheckboxDevelopmentOrImplementationOfLegislation(){

        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition2);
    }

    public void ITem3SelectedCheckboxOperationOfBEISStatutoryDuties(){

        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition3);
    }

    public void ITem4SelectedCheckboxHighLevelDecisionMaking(){

        DriverContext.WaitForElementNotGettingToBeClickable(PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition4);
        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition4);
    }

    public void ITem5SelectedCheckboxConstitutionalMatters(){

        DriverContext.WaitForElementNotGettingToBeClickable(PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition5);
        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNationalSignificantPossiblyCheckboxItemPosition5);
    }
}
