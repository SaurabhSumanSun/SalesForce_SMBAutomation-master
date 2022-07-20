package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;

import com.nttdata.testframework.drivers.CustomWebDriver;
import javassist.compiler.ProceedHandler;
import okio.Buffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.io.Connection;
import org.seleniumhq.jetty9.server.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class RU_portal24<LoginPage> {
    private static final Object MPN =07805203200 ;
    static Logger logger = LogManager.getLogger(RU_portal24.class);

    public WebDriver driver;
    @Autowired
    LoginPage Loginpage;
    private Object Companyname;
    private Object Proceedbutton;

    public RU_portal24(CustomWebDriver customWebDriver) {
        this.driver = (WebDriver) customWebDriver.getWebDriver();
    }
    @Given("^User logins as sales rep for RU portal$")
    public void User_logins_as_sales_rep_for_RU_portal() throws Throwable {
        try {
            Loginpage.finalize();
            Object supportType = new Object();
            Loginpage.notifyAll(supportType);
        }catch(Exception e)
        {
            logger.error(e.toString());
        }
        Object companyname = Companyname;
        @Then("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
        public void User_enters_the_and(String MPN,String Companyname) throws Throwable{
            PageFactory.initElements(driver,MPN.getClass());
            MPN.toString(MPN,Companyname);
        }
        @Then("^User enters the \"([^\"]*)\" and click on check button$")
                public void User_enters_the_and_click_on_check_button (String Object accountpin;
        accountpin) throws Throwable{
            Object accountpin;
            PageFactory.initElements(driver, accountpin.getClass());
            MPN.toString(accountpin);
        }

        @Then("^User can see the page and click on proceed$")
        public void User_can_see_the_page_and_click_on_proceed() throws Throwable {
            PageFactory.initElements(driver, ProceedHandler);
            Buffer proceedHandler;
            proceedHandler.toString(Proceedbutton);
        }

        @Then("^User can add the Upgrade for all RU products$")
            public void User_can_add_the_Upgrade_for_all_RU_products() throws Throwable{
                PageFactory.initElements(driver, Connection.UpgradeFrom);
                Buffer proceedHandler;
            Connection.UpgradeFrom.toString(ConnectionFactory.Upgrading);


    }
        @Then("^User can click on proceed to insurance$")
        public void User_can_click_on_proceed_to_insurance() throws Throwable{
            Object insurancepage;
            insurancepage.insurance();
        }

        @Then ("^User click on proceed to upgrade$")"
        public void User_click_on_proceed_to_upgrade() throws Throwable{
            Connection.UpgradeFrom.click();

        @Then ("^User can see the order summary page and click on place order$")
            public void User_can_see_the_order_summary_page_and_click_on_place_order() throws Throwable{
                Connection.UpgradeTo.proceed();

        @Then ("^User can see the total approved page")"
                public void User_can_see_the_total_approved_page() throws Throwable{
                    Connection.approvedpage.proceed();


}