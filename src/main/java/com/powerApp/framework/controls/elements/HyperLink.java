package com.powerApp.framework.controls.elements;


import com.powerApp.framework.controls.api.ImplementedBy;
import com.powerApp.framework.controls.internals.Control;

/**
 * Created by Ibi on 15/12/2022.
 */

@ImplementedBy(com.powerApp.framework.controls.elements.HyperLinkBase.class)
public interface HyperLink extends Control {


    void ClickLink();
    String GetUrlText();
    boolean CheckUrlTextContains(String containsText);


}
