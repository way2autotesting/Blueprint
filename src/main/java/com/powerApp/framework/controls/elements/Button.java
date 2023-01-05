package com.powerApp.framework.controls.elements;


import com.powerApp.framework.controls.api.ImplementedBy;
import com.powerApp.framework.controls.internals.Control;

/**
 * Created by Ibi on 15/12/2022.
 */
@ImplementedBy(ButtonBase.class)
public interface Button extends Control {

    void PerformClick();
    String GetButtonTest();
    void PerformSubmit();


}
