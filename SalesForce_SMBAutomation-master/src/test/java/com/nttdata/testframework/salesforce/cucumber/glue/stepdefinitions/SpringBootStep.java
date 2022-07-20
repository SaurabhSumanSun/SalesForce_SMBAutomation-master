/*
 * Added by Archana for Mobile Automation Testing
 */

package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;

import com.nttdata.testframework.SalesForceTestSpringBootApp;
import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.pagefactory.salesforce.DiallerPage;
import com.nttdata.testframework.utils.CucumberStatus;
import com.nttdata.testframework.utils.SystemDetails;
import com.nttdata.testframework.utils.Utils;

import org.apache.logging.log4j.LogManager;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SalesForceTestSpringBootApp.class)
@SpringBootTest
public class SpringBootStep<Scenario> {
    static org.apache.logging.log4j.Logger logger = LogManager.getLogger(SpringBootStep.class);
    @Autowired
    CustomWebDriver customWebDriver;
    @Autowired
    SystemDetails systemDetails;
    @Autowired
    DiallerPage diallerPage;
    static int count = 1;
    private Scenario scenario;
    private static CucumberStatus cucumberStatus = new CucumberStatus();

    @Before()
    public void beforeScenario(Scenario scenario) throws Exception {
        //logger.debug("OS Name - "+systemDetails.osName);
        this.scenario = scenario;
        cucumberStatus.scenarioName = scenario.getName();
        String s = scenario.getId();
        cucumberStatus.featureName= s.substring(s.lastIndexOf('/')+1,s.lastIndexOf('.'));
        //logger.debug(cucumberStatus.featureName);
        cucumberStatus.startTime = Utils.getLongDateTime();
        logger.debug("*****["+cucumberStatus.featureName+"][Scenario #" + count + ": " + scenario.getName() + " ] *****");
        if(count==1){
            //diallerPage.checkSystemPopup();
        }
    }

    @After()
    public void afterScenario() throws Throwable {
        //customWebDriver.getWebDriver().manage().deleteAllCookies();
        cucumberStatus.endTime = Utils.getLongDateTime();
        if (scenario.isFailed()) {
            cucumberStatus.status = "FAIL";
            //mobileApplicationDriver.takeScreenshot(cucumberStatus.scenarioName.replaceAll(" ","") + ".jpeg");
        } else {
            cucumberStatus.status = "PASS";
        }
        //Add status to custome cucumber report
        cucumberStatus.writeStatusToFile(Integer.toString(count));
        logger.debug("*****["+cucumberStatus.status+"][Scenario #" + count + ": " + scenario.getName() + " ] *****");
        count = count + 1;
    }

    private String timestamp() {

        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

}

