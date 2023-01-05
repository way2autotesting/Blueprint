package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 03/01/2023.
 */
public class MicrosoftStaySignedPage extends BasePage {

    @FindBy(how = How.ID, using = "idSIButton9")
    private WebElement MicrosoftStaySignedPageYesButton;

    @FindBy(how = How.XPATH, using = "//div[(@id='idDiv_SAOTCS_Proofs_Section')]/descendant::div[@id='idDiv_SAOTCS_Proofs']/child::div/following-sibling::div/child::div/child::div/child::div/following-sibling::div")
    private WebElement VerifyYourIdentity;

    @FindBy(how = How.XPATH, using = "//div[(@id='idDiv_SAOTCS_Proofs_Section')]/child::div/child::div/child::div/child::div/child::div/following-sibling::div/child::div")
    private WebElement VerifyYourIdentityText;

    public PowerApp ClickYesButton2(){

        DriverContext.WaitForElementToBeClickable(MicrosoftStaySignedPageYesButton);
        return GetInstance(PowerApp.class);
    }

    public PowerAppIntroductionPage ClickYesButton(){

        DriverContext.WaitForElementToBeClickable(MicrosoftStaySignedPageYesButton);
        return GetInstance(PowerAppIntroductionPage.class);
    }

    public void ClickCall(){

        DriverContext.WaitForElementToBeClickable(VerifyYourIdentity);
    }

    public void ClickText(){

        DriverContext.WaitForElementToBeClickable(VerifyYourIdentityText);
    }
}
