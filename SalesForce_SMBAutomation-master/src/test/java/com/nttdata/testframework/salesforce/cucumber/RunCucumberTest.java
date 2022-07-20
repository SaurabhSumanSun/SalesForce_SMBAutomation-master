package com.nttdata.testframework.salesforce.cucumber;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/testResult/basic-cucumber-report", "json:target/testResult/basic-report/cucumber.json",
                "pretty:target/testResult/basic-report/cucumber-pretty.txt",
                "usage:target/testResult/basic-report/cucumber-usage.json",
                "junit:target/testResult/basic-report/cucumber-results.xml"},
        features = "src/test/resources/features/android/rcsRegressionSuite.feature",
        glue = "com/nttdata/testframework/salesforce/cucumber/glue/stepdefinitions",
        tags = "@Test"
)
public class RunCucumberTest {

}
