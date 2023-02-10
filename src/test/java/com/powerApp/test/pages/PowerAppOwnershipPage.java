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
public class PowerAppOwnershipPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[(@class=' appmagic-content-control-name appmagic-control-view canvasContentDiv' and @data-control-name='Co-Owned_DataCard1' )]/child::div/child::div/child::div/child::div/following-sibling::div[@data-control-name='DataCardKey10']/child::div/child::div/child::div/child::div/child::div")
    private WebElement PowerAppOwnershipPageIsThisSiteCoOwned;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv _vst_' and @data-control-name='Icon5_4' )]/following-sibling::div/child::div/child::div/child::div/child::div/child::div")
    private WebElement PowerAppOwnershipPageThisCouldBeGovernmentDepartment;

    @FindBy(how = How.XPATH, using = "//div[(@class=' appmagic-content-control-name appmagic-control-view canvasContentDiv' and @data-control-name='Team Owners_DataCard1' )]/child::div/child::div/child::div/child::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div")
    private WebElement PowerAppOwnershipPageWhoWillBeTheOwnerOfTheSite;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv _vst_' and @data-control-name='Icon5_5' )]/following-sibling::div/child::div/child::div/child::div/child::div/child::div")
    private WebElement PowerAppOwnershipPageStaffAppointedAsSiteOwners;

    @FindBy(how = How.XPATH, using = "//div[(contains(text(),'Select Site Owners'))]")
    private WebElement PowerAppOwnershipPageSelectSiteOwnersButton;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_' and @data-control-name='NextArrow')]")
    private WebElement PowerAppPurposePageNextSection;

    @FindBy(how = How.XPATH, using = "//div[(@class='appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout _vst_' and @data-control-name='NextArrow')]/preceding-sibling::div")
    private WebElement PowerAppPurposePagePreviousSection;

    @FindBy(how = How.XPATH, using = "//label[@value='Yes']")
    private WebElement PowerAppActivityRadioButtonYes;

    @FindBy(how = How.XPATH, using = "//label[@value='No']")
    private WebElement PowerAppActivityRadioButtonNo;



    public String GetFirstTextIsTheSiteCoOwned(){

        System.out.println("Text is "+PowerAppOwnershipPageIsThisSiteCoOwned.getText());
        return PowerAppOwnershipPageIsThisSiteCoOwned.getText();
    }

    public String GetSecondTextThisCouldBeGovernmentDepartment(){

        return PowerAppOwnershipPageThisCouldBeGovernmentDepartment.getText();
    }

    public String GetThirdTextWhoWillBeTheOwners(){

        return PowerAppOwnershipPageWhoWillBeTheOwnerOfTheSite.getText();
    }

    public String GetFouthTextStaffAppointed(){

        return PowerAppOwnershipPageStaffAppointedAsSiteOwners.getText();
    }

    public PowerAppAddUsersToSiteOwnersPage ClickSelectSiteOwnerButton(){

        DriverContext.WaitForElementToBeClickable(PowerAppOwnershipPageSelectSiteOwnersButton);
        return GetInstance(PowerAppAddUsersToSiteOwnersPage.class);
    }

    public boolean IsPreviousSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePagePreviousSection);
    }

    public boolean IsNextSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePageNextSection);
    }

    public boolean IsYesRadioButtonPresent(){

        return DriverContext.IsElementPresent(PowerAppActivityRadioButtonYes);
    }

    public boolean IsNoRadioButtonPresent(){

        return DriverContext.IsElementPresent(PowerAppActivityRadioButtonNo);
    }

    public void ClickNoToTheRadioButton(){

        DriverContext.WaitForElementToBeClickable(PowerAppActivityRadioButtonNo);
    }

    public String GetOwnersSiteUsers(String valueType){

        WebElement ele = LocalDriverContext.getRemoteWebDriver().findElement(By.xpath("//div[contains(text(),'" + valueType + "')]"));
        return ele.getText();
    }

    public PowerAppRetentionPage ClickNextSection(){

        DriverContext.WaitForElementToBeClickable(PowerAppPurposePageNextSection);
        DriverContext.WaitForPageToLoad();
        return GetInstance(PowerAppRetentionPage.class);
    }
}
