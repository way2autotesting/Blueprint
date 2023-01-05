package com.powerApp.framework.controls.elements;

import com.powerApp.framework.controls.internals.ControlBase;
import org.openqa.selenium.WebElement;

/**
 * Created by Ibi on 15/12/2022.
 */

public class TextBoxBase extends ControlBase implements com.powerApp.framework.controls.elements.TextBox {

    public TextBoxBase(WebElement element) {
        super(element);
    }



    @Override
    public void EnterText(String text) {

        getWrappedElement().sendKeys(text);
    }

    @Override
    public String GetTextValue() {

        return getWrappedElement().getText();
    }
}
