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

/**
 * Created by Ibi on 08/01/2023.
 */
public class IssueTaxonomyChangesStepdef extends Base {

    @Given("^that I am requesting a Teams site via the provisioning App$")
    public void IssueTaxonomyChangesStepdef() throws InterruptedException {

        CurrentPage = GetInstance(MicrosoftLoginPage.class);

        CurrentPage.As(MicrosoftLoginPage.class).EnterEmailOrPhone(Settings.UserName);
        CurrentPage = CurrentPage.As(MicrosoftLoginPage.class).ClickNextButton();

        CurrentPage.As(MicrosoftPasswordPage.class).EnterPassword(Settings.Password);
        CurrentPage = CurrentPage.As(MicrosoftPasswordPage.class).ClickSiginButton();

        CurrentPage = CurrentPage.As(MicrosoftStaySignedPage.class).ClickYesButton3();
        DriverContext.GetCurrentWindow();
        CurrentPage = CurrentPage.As(SharePointRequestPortalPage.class).ClickRequestHere();
        DriverContext.WindowHandling();
    }

    @Then("^I navigate Power Apps with \"([^\"]*)\" subtitle$")
    public void iNavigatePowerAppsWithSubtitle(String subTitle) throws InterruptedException {

        DriverContext.SwitchFrame(0);
        Assert.assertTrue(CurrentPage.As(PowerAppIntroductionPage.class).GetTitleText().contains(subTitle));

        //Assert.assertTrue(CurrentPage.As(PowerAppIntroductionPage.class).IsSubTitleTextPresent());
    }

    @When("^I Begin button$")
    public void iBeginButton() throws Throwable {

        CurrentPage = CurrentPage.As(PowerAppIntroductionPage.class).ClickBegin();
    }

    @Then("^I validate \"([^\"]*)\" page contains \"([^\"]*)\"$")
    public void iValidatePageContains(String page, String value) throws Throwable {


        if(page.equalsIgnoreCase("Purpose")){
            Assert.assertTrue(CurrentPage.As(PowerAppPurposePage.class).GetWhyDoYou().contains(value));
            Assert.assertTrue(CurrentPage.As(PowerAppPurposePage.class).GetThisInformationWill().contains(value));
        }

    }

    @Then("^I validate \"([^\"]*)\" page text (\\d+) contains \"([^\"]*)\"$")
    public void iValidatePageTextContains(String page, int position, String value) throws Throwable {

        DriverContext.SwitchFrame(0);
        if(page.equalsIgnoreCase("Purpose") && position == 1) {
            Assert.assertTrue(CurrentPage.As(PowerAppPurposePage.class).GetWhyDoYou().contains(value));
        }else if(page.equalsIgnoreCase("Purpose") && position == 2){
            Assert.assertTrue(CurrentPage.As(PowerAppPurposePage.class).GetThisInformationWill().contains(value));
        }else if(page.equalsIgnoreCase("Purpose") && position == 3){
            Assert.assertTrue(CurrentPage.As(PowerAppPurposePage.class).GetWhatWouldYouLike().contains(value));
        }else if(page.equalsIgnoreCase("Purpose") && position == 4){
            Assert.assertTrue(CurrentPage.As(PowerAppPurposePage.class).GetKeepItShort().contains(value));
        }else if(page.equalsIgnoreCase("Activity") && position == 1){
            Assert.assertTrue(CurrentPage.As(PowerAppActivityPage.class).GetIsTheSiteForCoreBEIS().contains(value));
        }else if(page.equalsIgnoreCase("Activity") && position == 2){
            Assert.assertTrue(CurrentPage.As(PowerAppActivityPage.class).GetIsWhichOfBEISResponsibilitiesDoesThisSite().contains(value));
        }else if(page.equalsIgnoreCase("Activity") && position == 3){
            Assert.assertTrue(CurrentPage.As(PowerAppActivityPage.class).GetIsThisWillHelpToEnsureYourWorkspace().contains(value));
        }else if(page.equalsIgnoreCase("Activity") && position == 4){
            Assert.assertTrue(CurrentPage.As(PowerAppActivityPage.class).GetIsWhichActivityDoesThisEnergy().contains(value));
        }else if(page.equalsIgnoreCase("Ownership") && position == 1){
            Assert.assertTrue(CurrentPage.As(PowerAppOwnershipPage.class).GetFirstTextIsTheSiteCoOwned().contains(value));
        }else if(page.equalsIgnoreCase("Ownership") && position == 2){
            Assert.assertTrue(CurrentPage.As(PowerAppOwnershipPage.class).GetSecondTextThisCouldBeGovernmentDepartment().contains(value));
        }else if(page.equalsIgnoreCase("Ownership") && position == 3){
            Assert.assertTrue(CurrentPage.As(PowerAppOwnershipPage.class).GetThirdTextWhoWillBeTheOwners().contains(value));
        }else if(page.equalsIgnoreCase("Ownership") && position == 4){
            Assert.assertTrue(CurrentPage.As(PowerAppOwnershipPage.class).GetFouthTextStaffAppointed().contains(value));
        }else if(page.equalsIgnoreCase("Ownership of the site") && position == 1){
            Assert.assertTrue(CurrentPage.As(PowerAppAddUsersToSiteOwnersPage.class).GetSelectedUser().contains(value));
        }else if(page.equalsIgnoreCase("Retention") && position == 1){
            Assert.assertTrue(CurrentPage.As(PowerAppRetentionPage.class).GetFirstWillTheContentStoredWithinThisSiteOfNational().contains(value));
        }else if(page.equalsIgnoreCase("Retention") && position == 2){
            Assert.assertTrue(CurrentPage.As(PowerAppRetentionPage.class).GetSecondWillTheContentInThisSite().contains(value));
        }else if(page.equalsIgnoreCase("Retention") && position == 3){
            Assert.assertTrue(CurrentPage.As(PowerAppRetentionPage.class).GetThirdWillTheContentStoredWithinThisSiteOfOrganisational().contains(value));
        }else if(page.equalsIgnoreCase("Security") && position == 1){
            Assert.assertTrue(CurrentPage.As(PowerAppSecurityPage.class).GetWillYouUsingThisSiteToCollaborate().contains(value));
        }else if(page.equalsIgnoreCase("Security") && position == 2){
            Assert.assertTrue(CurrentPage.As(PowerAppSecurityPage.class).GetHowSensitiveMightTheInformationContained().contains(value));
        }else if(page.equalsIgnoreCase("Summary") && position == 1){
            Assert.assertTrue(CurrentPage.As(PowerAppSummaryPage.class).GetFirstYourNearltThere().contains(value));
        }else if(page.equalsIgnoreCase("Summary") && position == 2){
            Assert.assertTrue(CurrentPage.As(PowerAppSummaryPage.class).GetSecondThankYouForCompleting().contains(value));
        }else if(page.equalsIgnoreCase("Success") && position == 1){
            Assert.assertTrue(CurrentPage.As(PowerAppSuccessfulPage.class).GetFormSuccessfullySubmitted().contains(value));
        }
    }

    @When("^I add a description to the new site \"([^\"]*)\" such as \"([^\"]*)\"$")
    public void iAddADescriptionToTheNewSiteSuchAs(String page, String description) throws Throwable {
        DriverContext.SwitchFrame(0);
        if(page.equalsIgnoreCase("Purpose")){
            CurrentPage.As(PowerAppPurposePage.class).InputDescriptionToTheNewSitePurpose(description);
        }
    }

    @When("^I add desired title to the new site \"([^\"]*)\" such as \"([^\"]*)\"$")
    public void iAddDesiredTitleToTheNewSiteSuchAs(String page, String desiredTitle) throws Throwable {
        DriverContext.SwitchFrame(0);
        if(page.equalsIgnoreCase("Purpose")){
            CurrentPage.As(PowerAppPurposePage.class).InputDesiredTitleOfNewSitePurpose(desiredTitle);
        }
    }

    @When("^I click \"([^\"]*)\" in \"([^\"]*)\"$")
    public void iClickIn(String button, String page) throws Throwable {
        DriverContext.SwitchFrame(0);
        if(page.equalsIgnoreCase("Purpose")){
            CurrentPage = CurrentPage.As(PowerAppPurposePage.class).ClickNextSection();
        }else if(page.equalsIgnoreCase("Activity")){
            CurrentPage = CurrentPage.As(PowerAppActivityPage.class).ClickNextSection();
        }else if(page.equalsIgnoreCase("Ownership")){
            CurrentPage = CurrentPage.As(PowerAppOwnershipPage.class).ClickNextSection();
        }else if(page.equalsIgnoreCase("Retention")){
            CurrentPage = CurrentPage.As(PowerAppRetentionPage.class).ClickNextSection();
        }else if(page.equalsIgnoreCase("Security")){
            CurrentPage = CurrentPage.As(PowerAppSecurityPage.class).ClickNextSection();
        }else if(page.equalsIgnoreCase("Summary")){
            CurrentPage = CurrentPage.As(PowerAppSummaryPage.class).ClickSubmitForm();
        }
    }

    @And("^I have selected \"([^\"]*)\" as the Public body/Agency that will own the site$")
    public void iHaveSelectedBEISAsThePublicBodyAgencyThatWillOwnTheSite(String radioType) throws Throwable {
        DriverContext.SwitchFrame(0);
        if(radioType.equalsIgnoreCase("BEIS")){
            CurrentPage.As(PowerAppActivityPage.class).ClickBEIS();
        }else if(radioType.equalsIgnoreCase("")){

        }

    }

    @And("^I have selected that the site relates to the BEIS responsibility \"([^\"]*)\"$")
    public void iHaveSelectedThatTheSiteRelatesToTheBEISResponsibility(String responsibility) throws Throwable {

        if(responsibility.equalsIgnoreCase("Energy supply and security")){
            CurrentPage.As(PowerAppActivityPage.class).SelectTheMostRelevantDropdown(responsibility);
        }else{
            CurrentPage.As(PowerAppActivityPage.class).SelectTheMostRelevantDropdown2(responsibility);
        }

    }

    @When("^I click on the activity drop down list for \"([^\"]*)\"$")
    public void iClickOnTheActivityDropDownListFor(String dropdownList) throws Throwable {

        if(dropdownList.equalsIgnoreCase("Energy supply and security")){
            CurrentPage.As(PowerAppActivityPage.class).SelectWhichActivityDropdown();
        }else if(dropdownList.equalsIgnoreCase("Partner organisations")){
            CurrentPage.As(PowerAppActivityPage.class).SelectWhichActivityDropdown();
        }else if(dropdownList.equalsIgnoreCase("Corporate")){
            CurrentPage.As(PowerAppActivityPage.class).SelectWhichActivityDropdown();
        }
    }

    @Then("^the list is expanded$")
    public void theListIsExpanded() throws Throwable {


    }

    @And("^there is an entry for \"([^\"]*)\"$")
    public void thereIsAnEntryFor(String value) throws Throwable {

        Assert.assertTrue(CurrentPage.As(PowerAppActivityPage.class).SelectionEntryWhichActivityDropdown(value));
    }

    @And("^there is not an entry for \"([^\"]*)\"$")
    public void thereIsNotAnEntryForEnergyInfrastructureDevelopmentAndResilience(String value) throws Throwable {

        Assert.assertEquals(CurrentPage.As(PowerAppActivityPage.class).SelectionEntryWhichActivityNotDropdown(value),"true");
    }
}
