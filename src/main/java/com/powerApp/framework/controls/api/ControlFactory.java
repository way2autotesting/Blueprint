package com.powerApp.framework.controls.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

/**
 * Created by Ibi on 15/12/2022.
 */

public class ControlFactory extends PageFactory {

    public static <T> T initElements(WebDriver driver, Class<T> pageClassToProxy) {
        try {
            T page = pageClassToProxy.newInstance();
            PageFactory.initElements(
                    new ControlFieldDecorator(new DefaultElementLocatorFactory(driver)), page);
            return pageClassToProxy.cast(page);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
