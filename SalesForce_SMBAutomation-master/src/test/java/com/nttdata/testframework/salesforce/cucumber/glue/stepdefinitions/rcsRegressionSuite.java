package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;
import com.nttdata.testframework.pagefactory.salesforce.CompareTestAndCdr;
import com.nttdata.testframework.pagefactory.salesforce.readCDR;
import com.nttdata.testframework.pagefactory.salesforce.readScenarioTemplate;
import cucumber.api.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.text.ParseException;


public class rcsRegressionSuite {

    @Autowired
    readScenarioTemplate readTestConditions;
    @Autowired
    readCDR  readCDR;
    @Autowired
    CompareTestAndCdr compareTestAndCdr;


    static Logger logger = LogManager.getLogger(rcsRegressionSuite.class);

    @Given("^test CDR is generated and made accessible$")
    public void test_CDR_is_generated_and_made_accessible() throws IOException, ParseException {
    //readTestConditions.readTestCondition();


    }

    @Given("^test case template is made accessible$")
    public void testCaseTemplateIsMadeAccessible() throws IOException, ParseException {
        readCDR.readCDRS();
        readTestConditions.readTestCondition();


    }
}
