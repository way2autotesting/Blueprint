package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 03/01/2023.
 */
public class PowerAppIntroductionPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'BEIS MS Teams Site Request Form')]")
    private WebElement PowerAppIntroductionPageTitleText;

    @FindBy(how = How.XPATH, using = "//div[(@id='idDiv_SAOTCS_Proofs_Section')]/descendant::div[@id='idDiv_SAOTCS_Proofs']/child::div/following-sibling::div/child::div/child::div/child::div/following-sibling::div")
    private WebElement VerifyYourIdentity;

    public String GetTitleText() throws InterruptedException {

        DriverContext.WaitForPageToLoad();
        Thread.sleep(7000);
        System.out.println("title is "+PowerAppIntroductionPageTitleText.getText());
        return PowerAppIntroductionPageTitleText.getText();
    }

    public void ClickCall(){

        DriverContext.WaitForElementToBeClickable(VerifyYourIdentity);
    }
}
