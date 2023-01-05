package com.powerApp.test.stepdefs;

import com.powerApp.framework.base.Base;
import com.powerApp.framework.base.DriverContext;
import com.powerApp.framework.config.Settings;
import com.powerApp.test.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.testng.*;

/**
 * Created by Ibi on 03/01/2023.
 */
public class SmokeStepdef extends Base {
    @Given("^I am an MFA User$")
    public void iAmAnMFAUser() {

        CurrentPage = GetInstance(MicrosoftLoginPage.class);
    }

    @When("^I login with correct username and password$")
    public void iLoginWithCorrectUsernameAndPassword() {

        CurrentPage.As(MicrosoftLoginPage.class).EnterEmailOrPhone(Settings.UserName);
        CurrentPage = CurrentPage.As(MicrosoftLoginPage.class).ClickNextButton();

        CurrentPage.As(MicrosoftPasswordPage.class).EnterPassword(Settings.Password);
        CurrentPage = CurrentPage.As(MicrosoftPasswordPage.class).ClickSiginButton();
    }

    @Then("^I navigate to Power App UI \"([^\"]*)\"$")
    public void iNavigateToPowerAppUI(String value) throws InterruptedException {

        DriverContext.WaitForPageToLoad();
        Thread.sleep(2000);
        DriverContext.WindowHandling();
        Assert.assertTrue(CurrentPage.As(PowerAppIntroductionPage.class).GetTitleText().contains(value));
    }

    @And("^I activate MFA \"([^\"]*)\"$")
    public void iActivateMFACall(String types)  {

        if(types.equalsIgnoreCase("Call")){
            CurrentPage.As(MicrosoftStaySignedPage.class).ClickCall();
        }else if(types.equalsIgnoreCase("Text")){
            CurrentPage.As(MicrosoftStaySignedPage.class).ClickText();
        }

        CurrentPage = CurrentPage.As(MicrosoftStaySignedPage.class).ClickYesButton2();
    }

    @And("^I click \"([^\"]*)\"$")
    public void iClick(String value) throws Throwable {

        CurrentPage.As(PowerApp.class).ClickApps();
        CurrentPage = CurrentPage.As(PowerApp.class).ClickCreateNewMSTeamsSite();
    }
}
