package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions.SkuStepdef;

import javax.security.auth.login.LoginContext;

public class sku {
    @Given("^user is on sales force home page on web \"([^\"]*)\"$")
    public void user_is_on_sales_force_home_page_on_web(String browser) throws Throwable {
        String browser1 = browser;
        Object config;
        config. (browser);

    }

    @When("^I enter User Name \"([^\"]*)\" and password \"([^\"]*)\" and click enter button$")
    public void I_enter_User_Name_and_password_and_click_enter_button(String userName, String Password) throws Throwable {
        new.login(userName, Password);

    }
    @Then("^I verify home page is displayed$")
    public void I_verify_home_page_is_displayed() throws Throwable{
        new LoginContext().login();
    }

    @And ("^I search for sales rep \"([^\"]*)\" and click search button$")
    public void I_search_for_sales_rep_and_click_search_button(String salesRep) throws Throwable{
        new SkuStepdef().equals(SkuStepdef);
    }
    @Then("^ I verify SKU home page$")
    public void I_verify_SKU_home_page() throws Throwable{
        new SkuStepdef().verifyUserDetailsLink();
    }

    @Then ("^I navigate to user details page$")
    public void I_navigate_to_user_details_page() throws Throwable{
        new SkuStepdef().navigateToUserDetailsPage();

    }
    @Then("^ i click on \"([^\"]*)\" product$")
    public void i_click_on_product(String commerical) throws Throwable{
        new product().equals(commerical);
    }



}
