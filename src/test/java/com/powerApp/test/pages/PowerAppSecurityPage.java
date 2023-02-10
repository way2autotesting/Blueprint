package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import com.powerApp.framework.base.LocalDriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 21/01/2023.
 */
public class PowerAppSecurityPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name='Security')]/descendant::div[@class='appmagic-typed-card card_c5uw0h']/child::div[@data-control-name='StarVisible13']/following-sibling::div[@data-control-name='DataCardKey13']/child::div/child::div/child::div/child::div/child::div")
    private WebElement PowerAppSecurityPageWillYouUsingThisSiteToCollaborate;

    @FindBy(how = How.XPATH, using = "//div[@data-control-name='Radio5']/child::div/child::div/child::div/child::div/child::div[position()=2]")
    private WebElement PowerAppSecurityPageWillYouUsingThisSiteToCollaborateRadioButtonNo;

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name='Security')]/descendant::div[@class='powerapps-form-item formItem_1qwr9le']/child::div[position()=3]/child::div/child::div/child::div/child::div/following-sibling::div[@data-control-name='DataCardKey15']/child::div/child::div/child::div[@class='react-knockout-control']/child::div[@class='appmagic-label no-focus-outline top']")
    private WebElement PowerAppSecurityPageHowSensitiveMightTheInformationContained;

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name='Security')]/descendant::div[@class='powerapps-form-item formItem_1qwr9le']/child::div[position()=3]/child::div/child::div/child::div/child::div[@data-control-name='StarVisible15']/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div[@data-control-name='DataCardValue14']/child::div/child::div/child::div/child::div/child::div[position()=2]")
    private WebElement PowerAppSecurityPageSearchTheNecessarySecurity;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_' and @data-control-name='NextArrow')]")
    private WebElement PowerAppPurposePageNextSection;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_' and @data-control-name='NextArrow')]/preceding-sibling::div")
    private WebElement PowerAppPurposePagePreviousSection;



    public String GetWillYouUsingThisSiteToCollaborate(){

        return PowerAppSecurityPageWillYouUsingThisSiteToCollaborate.getText();
    }

    public void ClickRadioButtonWillYouUsingThisSiteToCollaborateRadioButtonNo(){

        DriverContext.WaitForElementToBeClickable(PowerAppSecurityPageWillYouUsingThisSiteToCollaborateRadioButtonNo);
    }

    public boolean IsNoRadioButtonPresent(){

        return DriverContext.IsElementPresent(PowerAppSecurityPageWillYouUsingThisSiteToCollaborateRadioButtonNo);
    }

    public String GetHowSensitiveMightTheInformationContained(){

        return PowerAppSecurityPageHowSensitiveMightTheInformationContained.getText();
    }

    public void ClickToSelectTheNeccessarySecurtyClassificationFromDropdown(){

        DriverContext.WaitForElementToBeClickable(PowerAppSecurityPageSearchTheNecessarySecurity);
    }

    public boolean IsPreviousSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePagePreviousSection);
    }

    public boolean IsNextSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePageNextSection);
    }

    public PowerAppSummaryPage ClickNextSection(){

        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNextSection);
        DriverContext.WaitForPageToLoad();
        return GetInstance(PowerAppSummaryPage.class);
    }

    public void SelectTheNeccessarySecurityClassificationFromDropdown(String valueType){

        WebElement ele = LocalDriverContext.getRemoteWebDriver().findElement(By.xpath("//span[contains(text(),'" + valueType + "')]"));

        DriverContext.WaitForElementToBeClickable(ele);
    }
}
