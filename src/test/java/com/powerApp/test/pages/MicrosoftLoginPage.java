package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 03/01/2023.
 */
public class MicrosoftLoginPage extends BasePage {

    @FindBy(how = How.ID, using = "i0116")
    private WebElement MicrosoftLoginPageSiginField;

    @FindBy(how = How.ID, using = "idSIButton9")
    private WebElement MicrosoftLoginPageNextButton;


    public void EnterEmailOrPhone(String EmailOrPhone){

        DriverContext.enterText(MicrosoftLoginPageSiginField,EmailOrPhone);
    }

    public MicrosoftPasswordPage ClickNextButton(){//ahmed.awesu@triad.co.uk

        DriverContext.WaitForElementToBeClickable(MicrosoftLoginPageNextButton);
        DriverContext.WaitForPageToLoad();
        return GetInstance(MicrosoftPasswordPage.class);
    }
}
