package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import javax.security.auth.login.LoginContext;

public class Pac<contact> {

    private Object PropositionInLife;

    @Given("^user is on sales force home page on web \"([^\"]*)\"$")
    public void user_is_on_sales_force_home_page_on_web(String browser) throws Throwable {
        String browser1 = browser;
        Object config;
        String browser2 = browser;
        (browser);

    }

    @When("^I enter User Name \"([^\"]*)\" and password \"([^\"]*)\" and click enter button$")
    public void I_enter_User_Name_and_password_and_click_enter_button(String userName, String Password) throws Throwable {
        new.login(userName, Password);

    }
    @Then("^I verify home page is displayed$")
    public void I_verify_home_page_is_displayed() throws Throwable{
        new LoginContext().login();
    }
    @Then("^ click on contacts button$")
    public void click_on_contact_button() throws Throwable
        System.Logger(contact);
        contactbutton.contact();

    @Then("^ click on manage External user and then click login page$")
    public void click_on_manage_external_user_and_then_click_login_page() throws Throwable{
        new manageexternaluser.loginpage();
        Object manageexternaluser=null;
        manageexternaluser.finalize();
    }

    @Then ("^user selects the pac request and then click on continue button$")
public void user_selects_the_pac_request_and_then_click_on_continue_button() throws Throwable{
        try {
            synchronized (new pacrequest()) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


