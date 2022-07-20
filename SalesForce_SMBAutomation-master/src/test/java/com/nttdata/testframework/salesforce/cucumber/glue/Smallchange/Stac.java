package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import com.sun.tools.classfile.StackMapTable_attribute;

import javax.security.auth.login.LoginContext;

public class Stac<contact> {
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

    @Then ("^user selects the Stac request and then click on continue button$")
    public void user_selects_the_Stac_request_and_then_click_on_continue_button() throws Throwable{
        try {
            synchronized (new StackMapTable_attribute.stack_map_frame() {
                @Override
                public int getOffsetDelta() {
                    return 0;
                }

                @Override
                public <R, D> R accept(Visitor<R, D> visitor, D data) {
                    return null;
                }
            }request()) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
