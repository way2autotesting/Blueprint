package com.powerApp.framework.controls.internals;


import com.powerApp.framework.controls.api.ImplementedBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

/**
 * Created by Ibi on 15/12/2022.
 */

@ImplementedBy(com.powerApp.framework.controls.internals.ControlBase.class)
public interface Control extends WebElement, WrapsElement, Locatable {
    //todo: Custom Controls
//    ControlBase WaitForPage();

//    ControlBase WaitForVisible();

//    ControlBase Click();

//    ControlBase ScrollToElement();
}