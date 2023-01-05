package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 03/01/2023.
 */
public class PowerApp extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[(@class='ms-List-page')]/child::div/child::div/child::div[position()=2]/child::div[position()=2]/child::div")
    private WebElement PowerAppCreateNewMSTeamsSite;

    @FindBy(how = How.XPATH, using = "//i[@data-icon-name='Cancel']")
    private WebElement PowerAppContactInformationWarningWindow;

    @FindBy(how = How.XPATH, using = "//div[(@role='menu')]/child::div[position()=3]/child::a/child::span/child::span")
    private WebElement PowerAppApps;

    public PowerAppIntroductionPage ClickCreateNewMSTeamsSite(){

        DriverContext.WaitForElementToBeClickable(PowerAppCreateNewMSTeamsSite);
        DriverContext.WaitForPageToLoad();
        return GetInstance(PowerAppIntroductionPage.class);
    }

    public void ClickCancelContactInformation(){

        try{
            DriverContext.WaitForElementToBeClickable(PowerAppContactInformationWarningWindow);
        }catch (Exception e){

        }
    }

    public void ClickApps(){

        DriverContext.WaitForElementToBeClickable(PowerAppApps);
        DriverContext.WaitForPageToLoad();
    }
}
