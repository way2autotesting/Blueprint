package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 03/01/2023.
 */
public class MicrosoftPasswordPage extends BasePage {

    @FindBy(how = How.ID, using = "i0118")
    private WebElement MicrosoftPasswordPagePasswordField;

    @FindBy(how = How.ID, using = "idSIButton9")
    private WebElement MicrosoftPasswordPageSiginButton;

    public void EnterPassword(String EmailOrPhone){

        DriverContext.enterText(MicrosoftPasswordPagePasswordField,EmailOrPhone);
    }

    public MicrosoftStaySignedPage ClickSiginButton(){

        DriverContext.WaitForElementToBeClickable(MicrosoftPasswordPageSiginButton);
        DriverContext.WaitForPageToLoad();
        return GetInstance(MicrosoftStaySignedPage.class);
    }
}
