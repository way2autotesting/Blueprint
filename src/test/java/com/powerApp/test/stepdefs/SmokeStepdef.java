package com.powerApp.test.stepdefs;

import com.powerApp.framework.base.Base;
import com.powerApp.framework.base.DriverContext;
import com.powerApp.framework.base.LocalDriverContext;
import com.powerApp.framework.config.Settings;
import com.powerApp.test.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.testng.*;

import static com.powerApp.framework.base.DriverContext.parent;

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
    public void iNavigateToPowerAppUI(String subTitle) throws InterruptedException {

        DriverContext.SwitchFrame(0);
        Assert.assertTrue(CurrentPage.As(PowerAppIntroductionPage.class).GetTitleText().contains(subTitle));
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

    @Then("^I validate \"([^\"]*)\" page button contains \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iValidatePageButtonContainsAnd(String page, String prevBtn, String nextBtn) throws Throwable {

        if(page.equalsIgnoreCase("Purpose")){
            Assert.assertTrue(CurrentPage.As(PowerAppPurposePage.class).IsPreviousSectionPresent());
            Assert.assertTrue(CurrentPage.As(PowerAppPurposePage.class).IsNextSectionPresent());
        }else if(page.equalsIgnoreCase("Activity")){
            Assert.assertTrue(CurrentPage.As(PowerAppActivityPage.class).IsPreviousSectionPresent());
            Assert.assertTrue(CurrentPage.As(PowerAppActivityPage.class).IsNextSectionPresent());
        }else if(page.equalsIgnoreCase("Ownership")){
            Assert.assertTrue(CurrentPage.As(PowerAppOwnershipPage.class).IsPreviousSectionPresent());
            Assert.assertTrue(CurrentPage.As(PowerAppOwnershipPage.class).IsNextSectionPresent());
        }else if(page.equalsIgnoreCase("Retention")){
            Assert.assertTrue(CurrentPage.As(PowerAppRetentionPage.class).IsPreviousSectionPresent());
            Assert.assertTrue(CurrentPage.As(PowerAppRetentionPage.class).IsNextSectionPresent());
        }else if(page.equalsIgnoreCase("Security")){
            Assert.assertTrue(CurrentPage.As(PowerAppSecurityPage.class).IsPreviousSectionPresent());
            Assert.assertTrue(CurrentPage.As(PowerAppSecurityPage.class).IsNextSectionPresent());
        }else if(page.equalsIgnoreCase("Summary")){
            Assert.assertTrue(CurrentPage.As(PowerAppSummaryPage.class).IsPreviousSectionPresent());
            Assert.assertTrue(CurrentPage.As(PowerAppSummaryPage.class).IsSubmitFormPresent());
        }

    }

    @Then("^I validate \"([^\"]*)\" page radio button contains \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iValidatePageRadioButtonContainsAnd(String page, String radioBtn1, String radioBtn2) throws Throwable {

        if(page.equalsIgnoreCase("Activity")){
            Assert.assertTrue(CurrentPage.As(PowerAppActivityPage.class).IsBEISRadioButtonPresent());
            Assert.assertTrue(CurrentPage.As(PowerAppActivityPage.class).IsPublicBodyAgencyRadioButtonPresent());
        }else if(page.equalsIgnoreCase("Ownership")){
            Assert.assertTrue(CurrentPage.As(PowerAppOwnershipPage.class).IsYesRadioButtonPresent());
            Assert.assertTrue(CurrentPage.As(PowerAppOwnershipPage.class).IsNoRadioButtonPresent());
        }else if(page.equalsIgnoreCase("Security")){
            //Assert.assertTrue(CurrentPage.As(PowerAppSecurityPage.class).IsYesRadioButtonPresent());
            Assert.assertTrue(CurrentPage.As(PowerAppSecurityPage.class).IsNoRadioButtonPresent());
        }

    }

    @And("^I have selected that \"([^\"]*)\" activity drop down list from \"([^\"]*)\"$")
    public void iHaveSelectedThatActivityDropDownListFrom(String activity, String previousSelection) throws Throwable {

        if(previousSelection.equalsIgnoreCase("Energy supply and security")){
            CurrentPage.As(PowerAppActivityPage.class).ClickEntryWhichActivityFromDropdown(activity);
        }

    }

    @When("^I click \"([^\"]*)\" on the activity radio button to confirm if the site co owned with another government organisation$")
    public void iClickOnTheActivityRadioButtonToConfirmIfTheSiteCoOwnedWithAnotherGovernmentOrganisation(String radioButton) throws Throwable {

        if(radioButton.equalsIgnoreCase("No")){
            CurrentPage.As(PowerAppOwnershipPage.class).ClickNoToTheRadioButton();
        }
    }

    @When("^I click the button \"([^\"]*)\"$")
    public void iClickTheButton(String arg0) throws Throwable {

        CurrentPage = CurrentPage.As(PowerAppOwnershipPage.class).ClickSelectSiteOwnerButton();
    }

    @Then("^I navigate to add users as the owners of the site \"([^\"]*)\"$")
    public void iNavigateToAddUsersAsTheOwnersOfTheSite(String subTitle) throws Throwable {

        DriverContext.SwitchFrame(0);
        Assert.assertTrue(CurrentPage.As(PowerAppAddUsersToSiteOwnersPage.class).GetSubTitle().contains(subTitle));
    }

    @When("^I search for users by name \"([^\"]*)\"$")
    public void iSearchForUsersByName(String usersName) throws Throwable {

        CurrentPage.As(PowerAppAddUsersToSiteOwnersPage.class).InputUsersName(usersName);
        CurrentPage.As(PowerAppAddUsersToSiteOwnersPage.class).ClickInputUsersName();
    }

    @Then("^I validate \"([^\"]*)\" page (\\d+) contains \"([^\"]*)\"$")
    public void iValidatePageContains(String arg0, int arg1, String value) throws Throwable {

            Assert.assertTrue(CurrentPage.As(PowerAppAddUsersToSiteOwnersPage.class).GetSelectedUsers(value).contains(value));
    }

    @When("^I click to \"([^\"]*)\"$")
    public void iClickTo(String arg0) throws Throwable {

        CurrentPage = CurrentPage.As(PowerAppAddUsersToSiteOwnersPage.class).ClickConfirmSelection();
    }

    @Then("^I validate \"([^\"]*)\" page owners site contains \"([^\"]*)\"$")
    public void iValidatePageOwnersSiteContains(String arg0, String user) throws Throwable {

        Assert.assertTrue(CurrentPage.As(PowerAppOwnershipPage.class).GetOwnersSiteUsers(user).contains(user));
    }

    @When("^I select radio button \"([^\"]*)\" to National Significance$")
    public void iSelectRadioButtonToNationalSignificance(String radioButton) throws Throwable {

        if(radioButton.equalsIgnoreCase("No")){
            CurrentPage.As(PowerAppRetentionPage.class).ClickNoRadioButtonNationalSignificance();
        } else if (radioButton.equalsIgnoreCase("Almost certainly")) {
            CurrentPage.As(PowerAppRetentionPage.class).ClickAlmostCertainlyRadioButtonNationalSignificance();
        }else if (radioButton.equalsIgnoreCase("Possibly")) {
            CurrentPage.As(PowerAppRetentionPage.class).ClickPossiblyRadioButtonNationalSignificance();
        }
    }

    @When("^I select radio button \"([^\"]*)\" to Extended Value$")
    public void iSelectRadioButtonToExtendedValue(String radioButton) throws Throwable {

        if(radioButton.equalsIgnoreCase("No")){
            CurrentPage.As(PowerAppRetentionPage.class).ClickNoRadioButtonExtendedValue();
        }
    }

    @When("^I select radio button \"([^\"]*)\" to Organisational Significance$")
    public void iSelectRadioButtonToOrganisationalSignificance(String radioButton) throws Throwable {
        if(radioButton.equalsIgnoreCase("No")){
            CurrentPage.As(PowerAppRetentionPage.class).ClickNoRadioButtonOrganisationalSignificance();
        }
    }

    @When("^I select radio button \"([^\"]*)\" to collaborate with people outside your organisation$")
    public void iSelectRadioButtonToCollaborateWithPeopleOutsideYourOrganisation(String arg0) throws Throwable {

        CurrentPage.As(PowerAppSecurityPage.class).ClickRadioButtonWillYouUsingThisSiteToCollaborateRadioButtonNo();
    }

    @When("^I select \"([^\"]*)\" as the securty classification from the dropdown$")
    public void iSelectAsTheSecurtyClassificationFromTheDropdown(String dropdown) throws Throwable {

        CurrentPage.As(PowerAppSecurityPage.class).ClickToSelectTheNeccessarySecurtyClassificationFromDropdown();
        CurrentPage.As(PowerAppSecurityPage.class).SelectTheNeccessarySecurityClassificationFromDropdown(dropdown);
    }


    @Then("^I validate \"([^\"]*)\" page button are enabled and contains \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iValidatePageButtonAreEnabledAndContainsAnd(String page, String reqAnotherSite, String exitForm) throws Throwable {

        Assert.assertTrue(CurrentPage.As(PowerAppSuccessfulPage.class).IsExitFormButtonPresent());
        Assert.assertTrue(CurrentPage.As(PowerAppSuccessfulPage.class).IsRequestAnotherSiteButtonPresent());
    }

    @When("^I switch window back to Workspace Request Portal$")
    public void iSwitchWindowBackToWorkspaceRequestPortal() throws Throwable {

        CurrentPage = CurrentPage.As(PowerAppSuccessfulPage.class).SwitchToWorkspaceRequestPortal();
        DriverContext.SwitchFrameToDefault();
    }

    @When("^I click \"([^\"]*)\" in the Site sub header host$")
    public void iClickInTheSiteSubHeaderHost(String subHeader) throws Throwable {

        Thread.sleep(5000);
        if(subHeader.equalsIgnoreCase("Workspace Directory")){
            CurrentPage.As(SharePointRequestPortalPage.class).ClickSiteSubHeader();
        }
    }

    @Then("^I validate \"([^\"]*)\" page the \"([^\"]*)\" contains \"([^\"]*)\"$")
    public void iValidatePageTheContains(String WorkspaceRequestPortal, String keyStatus, String value) throws Throwable {

        Thread.sleep(7000);
        if(WorkspaceRequestPortal.equalsIgnoreCase("Workspace Request Portal") && keyStatus.equalsIgnoreCase("Workspace Name")){
            Assert.assertTrue(CurrentPage.As(SharePointRequestPortalPage.class).GetWorkspaceName().contains(value));
        }else if(WorkspaceRequestPortal.equalsIgnoreCase("Workspace Request Portal") && keyStatus.equalsIgnoreCase("Provisioning Status")){
            Assert.assertTrue(CurrentPage.As(SharePointRequestPortalPage.class).GetProvisioningStatus().contains(value));
        }else if(WorkspaceRequestPortal.equalsIgnoreCase("Workspace Request Portal") && keyStatus.equalsIgnoreCase("Team Owners")){
            Assert.assertTrue(CurrentPage.As(SharePointRequestPortalPage.class).GetTeamOwners2().contains(value));
        }else if(WorkspaceRequestPortal.equalsIgnoreCase("Workspace Request Portal") && keyStatus.equalsIgnoreCase("Created By")){
            Assert.assertTrue(CurrentPage.As(SharePointRequestPortalPage.class).GetCreatedBy().contains(value));
        }
    }

    @When("^I click on the activity drop down list$")
    public void iClickOnTheActivityDropDownList() {

        CurrentPage.As(PowerAppActivityPage.class).SelectWhichActivityDropdown();
    }

    @And("^I have selected \"([^\"]*)\" from the activities site$")
    public void iHaveSelectedFromTheActivitiesSite(String activity) throws Throwable {

        CurrentPage.As(PowerAppActivityPage.class).ClickEntryWhichActivityFromDropdown(activity);
    }

    @And("^I select \"([^\"]*)\" checkbox category for the national significant work$")
    public void iSelectCheckboxCategoryForTheNationalSignificantWork(String category) throws Throwable {

       // DriverContext.SwitchFrame(0);
        if(category.equalsIgnoreCase("BEIS's principle policy delivery goals")){
            Thread.sleep(1000);
            CurrentPage.As(PowerAppRetentionPage.class).ITem1SelectedCheckboxBEISPrincipalPolicy();
        } else if (category.equalsIgnoreCase("Development or implementation of legislation (primary and secondary)")) {
            Thread.sleep(1000);
            CurrentPage.As(PowerAppRetentionPage.class).ITem2SelectedCheckboxDevelopmentOrImplementationOfLegislation();
        }else if (category.equalsIgnoreCase("Operation of BEIS's statutory duties")) {
            Thread.sleep(1000);
            CurrentPage.As(PowerAppRetentionPage.class).ITem3SelectedCheckboxOperationOfBEISStatutoryDuties();
        }else if (category.equalsIgnoreCase("High-level decision-making e.g. cabinet committee meetings")) {
            Thread.sleep(1000);
            CurrentPage.As(PowerAppRetentionPage.class).ITem4SelectedCheckboxHighLevelDecisionMaking();
        }else if (category.equalsIgnoreCase("Constitutional matters; devolution")) {
            Thread.sleep(1000);
            CurrentPage.As(PowerAppRetentionPage.class).ITem5SelectedCheckboxConstitutionalMatters();
        }

    }
}
