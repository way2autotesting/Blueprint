package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 21/01/2023.
 */
public class PowerAppSummaryPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name=\"DataCard4\")]/child::div/child::div/child::div/child::div[@data-control-name='Container14']/child::div/child::div/child::div/child::div/child::div[@data-control-name='Container15']/child::div/child::div/child::div/child::div/child::div/child::div[@data-control-name='Label10_4']/child::div/child::div/child::div/child::div/child::div/child::div")
    private WebElement PowerAppSummaryPageYoureNearlyThere;

    @FindBy(how = How.XPATH, using = "//div[(@data-control-name=\"DataCard4\")]/child::div/child::div/child::div/child::div[@data-control-name='Container14']/child::div/child::div/child::div/child::div/child::div[@data-control-name='Container15']/child::div/child::div/child::div/child::div/child::div/child::div[@data-control-name='Label10_5']/child::div/child::div/child::div/child::div/child::div/child::div")
    private WebElement PowerAppSummaryPageThankYouForCompleting;

    @FindBy(how = How.XPATH, using = "//div[(@data-container-name='PreviousNextBar_1-container' and @data-pa-type='pa-items-container')]/child::div/child::div[position()=5]/child::div/child::div/child::div")
    private WebElement PowerAppSummaryPageSubmitForm;

    @FindBy(how = How.XPATH, using = "//div[(@data-container-name='PreviousNextBar_1-container' and @data-pa-type='pa-items-container')]/child::div/child::div[position()=1]/child::div/child::div/child::div")
    private WebElement PowerAppPurposePagePreviousSection;


    public String GetFirstYourNearltThere(){

        return PowerAppSummaryPageYoureNearlyThere.getText();
    }

    public String GetSecondThankYouForCompleting(){

        return PowerAppSummaryPageThankYouForCompleting.getText();
    }

    public PowerAppSuccessfulPage ClickSubmitForm(){

        DriverContext.WaitForElementToBeClickable(PowerAppSummaryPageSubmitForm);
        return GetInstance(PowerAppSuccessfulPage.class);
    }

    public boolean IsPreviousSectionPresent(){

        return DriverContext.IsElementPresent(PowerAppPurposePagePreviousSection);
    }

    public boolean IsSubmitFormPresent(){

        return DriverContext.IsElementPresent(PowerAppSummaryPageSubmitForm);
    }
}
