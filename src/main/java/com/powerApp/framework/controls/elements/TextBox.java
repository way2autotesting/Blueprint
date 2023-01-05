package com.powerApp.framework.controls.elements;



import com.powerApp.framework.controls.api.ImplementedBy;
import com.powerApp.framework.controls.internals.Control;

/**
 * Created by Ibi on 15/12/2022.
 */
@ImplementedBy(TextBoxBase.class)
public interface TextBox extends Control {

    void EnterText(String text);
    String GetTextValue();
}




