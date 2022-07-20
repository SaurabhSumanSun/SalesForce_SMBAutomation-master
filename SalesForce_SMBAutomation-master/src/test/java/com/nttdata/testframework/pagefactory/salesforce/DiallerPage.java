package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.List;

@Component
public class DiallerPage extends PageObject {
    static Logger logger = LogManager.getLogger(DiallerPage.class);

    //constructor
    @Autowired
    public DiallerPage(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

}
