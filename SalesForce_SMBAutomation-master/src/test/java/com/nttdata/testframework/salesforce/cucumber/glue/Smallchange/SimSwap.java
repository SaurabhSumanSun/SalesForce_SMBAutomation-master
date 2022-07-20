package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import org.junit.Assert;

import javax.security.auth.login.LoginContext;

public class SimSwap<contact> {
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
    @Then ("^click on contact button$")
    public void click_on_contact_button() throws Throwable
        System.Logger(contact);
        contactbutton.contact();
}
    @Then ("^click on manage external user and click on login simswap page$")
    public void click_on_manage_external_user_and_click_on_login_simswap_page() throws Throwable{
    new manageexternaluser.loginpage();
        Object manageexternaluser=null;
        manageexternaluser.finalize();

}

    @Then ("^i enter the and select the below MPNs for the desired \"([^\"]*)\"$")
    public void i_enter_the_and_select_the_below_MPNs_for_the_desired(String Acno, String inLifeOperation, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        System.out.println("THE VALUE FOR INLIFE OPERATION IS: " + inLifeOperation);
        Assert.assertFalse("The Request search value that is Account number is blank in feature please provide a valid data",
                Acno.isBlank());
        Assert.assertFalse("The Request search value that is Inlife operation type is blank in feature please provide a valid data",
                inLifeOperation.isBlank());
        PropositionInLife.finalize(dataTable, inLifeOperation, Acno);
    }



    }
}

