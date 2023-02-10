package com.powerApp.test.pages;

import com.powerApp.framework.base.BasePage;
import com.powerApp.framework.base.DriverContext;
import com.powerApp.framework.base.LocalDriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 21/01/2023.
 */
public class PowerAppAddUsersToSiteOwnersPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[(@class=' appmagic-content-control-name appmagic-control-view canvasContentDiv appmagic-auto-layout' and @data-control-name='PeoplePickerQuestionContainer')]/descendant::div[@class='appmagic-label no-focus-outline top']/child::div")
    private WebElement PowerAppAddUsersToSiteOwnersPageSubTitle;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Selected users (1)')]")
    private WebElement PowerAppAddUsersToSiteOwnersPageSelectedUser;

    //@FindBy(how = How.XPATH, using = "//div[(@data-container-name='UserSelectionGallery-container')]/child::div/child::div[position()=4]/descendant::div[@class='powerapps-icon no-focus-outline']/child::div/child::*/child::*/following-sibling::*")
    @FindBy(how = How.XPATH, using = "//div[(@data-container-name='UserSelectionGallery-container')]/child::div/child::div[position()=4]/descendant::div[@class='powerapps-icon no-focus-outline']")
    private WebElement PowerAppAddUsersToSiteOwnersPageSelectedUserParticularOne;

    @FindBy(how = How.XPATH, using = "//input[(@appmagic-control='UserSelectionSearchBoxTextInputtextbox')]")
    private WebElement PowerAppAddUsersToSiteSearchForUserByName;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Confirm Selection')]")
    private WebElement PowerAppAddUsersToSiteOwnersPageConfirmSelectedUser;


    public String GetSubTitle(){

        return PowerAppAddUsersToSiteOwnersPageSubTitle.getText();
    }

    public String GetSelectedUser(){

        return PowerAppAddUsersToSiteOwnersPageSelectedUser.getText();
    }

    public String GetSelectedUsers(String valueType){

        WebElement ele = LocalDriverContext.getRemoteWebDriver().findElement(By.xpath("//div[contains(text(),'" + valueType + "')]"));
        return ele.getText();
    }

    public void InputUsersName(String usersName){

        DriverContext.enterText(PowerAppAddUsersToSiteSearchForUserByName, usersName);
    }

    public void ClickInputUsersName() throws InterruptedException {

        Thread.sleep(1000);
        PowerAppAddUsersToSiteOwnersPageSelectedUserParticularOne.sendKeys(Keys.ENTER);
        //DriverContext.DoubleClick(PowerAppAddUsersToSiteOwnersPageSelectedUserParticularOne);
    }

    public PowerAppOwnershipPage ClickConfirmSelection(){

        DriverContext.WaitForElementToBeClickable(PowerAppAddUsersToSiteOwnersPageConfirmSelectedUser);
        return GetInstance(PowerAppOwnershipPage.class);
    }
}
