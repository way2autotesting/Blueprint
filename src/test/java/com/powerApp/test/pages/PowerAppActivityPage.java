package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import com.powerApp.framework.base.LocalDriverContext;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteKeyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 14/01/2023.
 */
public class PowerAppActivityPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv _vst_' and @data-control-name='StarVisible8_2')]/following-sibling::div/descendant::div/child::div/child::div/child::div")
    private WebElement PowerAppActivityIsTheSiteForCoreBEIS;

    //@FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv _vst_' and @data-control-name='StarVisible8_2')]/following-sibling::div/following-sibling::div/following-sibling::div/child::div/descendant::div[@role='radiogroup']/child::div[position()=1]/child::label/child::input/following-sibling::div[@class='appmagic-radio-placeholder']")
    //@FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv _vst_' and @data-control-name='StarVisible8_2')]/following-sibling::div/following-sibling::div/following-sibling::div/child::div/descendant::div[@role='radiogroup']/child::div[position()=1]/child::label/child::input/following-sibling::div[@class='appmagic-radio-placeholder']/preceding-sibling::input[@type='radio']")
    @FindBy(how = How.XPATH, using = "//label[@value='BEIS']")
    private WebElement PowerAppActivityRadioButtonBEIS;

    @FindBy(how = How.XPATH, using = "//label[@value='Public Body / Agency']")
    private WebElement PowerAppActivityRadioButtonPublicBodyAgency;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv _vst_' and @data-control-name='StarVisible8_2')]/following-sibling::div/following-sibling::div/following-sibling::div/child::div/descendant::div[@role='radiogroup']/child::div[position()=2]/child::label/child::input")
    private WebElement PowerAppActivityRadioButtonPublicBody;

    @FindBy(how = How.XPATH, using = "//div[(@id='react-combobox-view-1')]/child::div[@class='filterWrapper_1rqdl1n-o_O-filterWrapper_noFilter_rn3gmd']/following-sibling::div")
    private WebElement PowerAppActivitySelectTheMostReleventDropdown;

    //@FindBy(how = How.XPATH, using = "//div[(@id='react-combobox-view-1')]/child::div[@class='filterWrapper_1rqdl1n-o_O-filterWrapper_noFilter_rn3gmd']/following-sibling::div")
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Energy supply and security')]")
    private WebElement PowerAppActivitySelectTheMostReleventDropdownEnergySupplyAndSecurity;

    @FindBy(how = How.XPATH, using = "//div[(@id='react-combobox-view-2')]/child::div[@class='filterWrapper_1rqdl1n-o_O-filterWrapper_noFilter_rn3gmd']/following-sibling::div")
    private WebElement PowerAppActivitySelectWhichActivityDropdown;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Energy supply and security')]")
    private WebElement PowerAppActivitySelectWhichActivityDoesThis;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_' and @data-control-name='NextArrow')]")
    private WebElement PowerAppPurposePageNextSection;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_' and @data-control-name='NextArrow')]/preceding-sibling::div")
    private WebElement PowerAppPurposePagePreviousSection;

    //@FindBy(how = How.XPATH, using =  "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv _vst_' and @data-control-name='StarVisible8_2')]/following-sibling::div/descendant::div/child::div/child::div/child::div")
    @FindBy(how = How.XPATH, using =  "//div[(@class=' appmagic-content-control-name appmagic-control-view canvasContentDiv' and @data-control-name='Function_DataCard1_1' )]/child::div/child::div/child::div/child::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div")
    private WebElement PowerAppActivityIsWhichOfBEISResponsibilities;

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name='DataCardKey8_3')]/child::div/child::div/child::div/child::div")
    private WebElement PowerAppPurposePageThisWillHelpToEnsureYour;

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name='DataCardKey9_1')]/child::div/child::div/child::div/child::div/child::div")
    private WebElement PowerAppPurposePageWhichActivityDoesThisEnergy;



    public String GetIsTheSiteForCoreBEIS() {

        return PowerAppActivityIsTheSiteForCoreBEIS.getText();
    }

    public void ClickBEIS() {

        DriverContext.WaitForElementToBeClickable(PowerAppActivityRadioButtonBEIS);
    }

    public void ClickPublicBodyAgency() {

        DriverContext.WaitForElementToBeClickable(PowerAppActivityRadioButtonPublicBody);
    }

    public void SelectTheMostRelevantDropdown(String valueType) {

        DriverContext.WaitForElementToBeClickable(PowerAppActivitySelectTheMostReleventDropdown);

        WebElement ele = LocalDriverContext.getRemoteWebDriver().findElement(By.xpath("//span[contains(text(),'" + valueType + "')]"));
        DriverContext.WaitForElementToBeClickable(ele);
        //DriverContext.WaitForElementToBeClickable(PowerAppActivitySelectTheMostReleventDropdownEnergySupplyAndSecurity);
    }

    public void SelectTheMostRelevantDropdown2(String valueType) throws InterruptedException {

        DriverContext.WaitForElementToBeClickable(PowerAppActivitySelectTheMostReleventDropdown);

        WebElement ele = LocalDriverContext.getRemoteWebDriver().findElement(By.xpath("//span[contains(text(),'" + valueType + "')]"));
        ((JavascriptExecutor)LocalDriverContext.getRemoteWebDriver()).executeScript("arguments[0].scrollIntoView(true);", ele);
        Thread.sleep(500);
        DriverContext.WaitForElementToBeClickable(ele);
        //DriverContext.WaitForElementToBeClickable(PowerAppActivitySelectTheMostReleventDropdownEnergySupplyAndSecurity);
    }

    public void SelectWhichActivityDropdown() {

        DriverContext.WaitForElementToBeClickable(PowerAppActivitySelectWhichActivityDropdown);
    }

    public boolean SelectionEntryWhichActivityDropdown(String valueType) {

        WebElement ele = LocalDriverContext.getRemoteWebDriver().findElement(By.xpath("//span[contains(text(),'" + valueType + "')]"));

        return DriverContext.IsElementPresent(ele);
    }

    public String OutCome;
    public String SelectionEntryWhichActivityNotDropdown(String valueType) {

        try{
            WebElement ele = LocalDriverContext.getRemoteWebDriver().findElement(By.xpath("//span[contains(text(),'" + valueType + "')]"));
        }catch (NoSuchElementException e){

            OutCome = "true";
        }
        return OutCome;
    }

    public boolean IsPreviousSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePagePreviousSection);
    }

    public boolean IsNextSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePageNextSection);
    }

    public boolean IsBEISRadioButtonPresent(){

        return DriverContext.IsElementPresent(PowerAppActivityRadioButtonBEIS);
    }

    public boolean IsPublicBodyAgencyRadioButtonPresent(){

        return DriverContext.IsElementPresent(PowerAppActivityRadioButtonPublicBodyAgency);
    }

    public String GetIsWhichOfBEISResponsibilitiesDoesThisSite() {

        System.out.println("text : "+PowerAppActivityIsWhichOfBEISResponsibilities.getText());
        return PowerAppActivityIsWhichOfBEISResponsibilities.getText();
    }

    public String GetIsThisWillHelpToEnsureYourWorkspace() {

        return PowerAppPurposePageThisWillHelpToEnsureYour.getText();
    }

    public String GetIsWhichActivityDoesThisEnergy() {

        return PowerAppPurposePageWhichActivityDoesThisEnergy.getText();
    }

    public void ClickEntryWhichActivityFromDropdown(String valueType) {

        WebElement ele = LocalDriverContext.getRemoteWebDriver().findElement(By.xpath("//span[contains(text(),'" + valueType + "')]"));

        DriverContext.WaitForElementToBeClickable(ele);
    }

    public PowerAppOwnershipPage ClickNextSection(){

        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNextSection);
        DriverContext.WaitForPageToLoad();
        return GetInstance(PowerAppOwnershipPage.class);
    }
}
