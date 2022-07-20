package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import okio.Buffer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import javax.accessibility.AccessibleRelation;

public class Guru {
    private Object mobilenumber;
        private Buffer ReviewBasket;
    private Object[] lastname;

    @Given("^Customer is able to launch the businessshop and select the \"([^\"]*)\"$")
        public void Customer_is_able_to_launch_the_businessshop_and_select(String Broadband) throws Throwable {
            PageFactory pageFactory = new PageFactory();
            WebDriver driver = null;
            pageFactory.initElements(driver, com.nttdata.testframework.salesforce.cucumber.glue.Smallchange.Broadband.class);
            Broadband.finalize(Broadband);
        }

        @Then("^customer enters the \"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\"$")
        public void customer_enters_the(String mobilenumber) throws Throwable{
            String[] arr = new String[0];
            System.out.println("mobilenumber="+07710163471);
        }

        @Then("^Customer clicks the  check button$")
        public void Customer_clicks_the_check_button() throws Throwable{
            Object click = null;
            new clickbutton(click);
        }

        @Then ("^Customer can see the plans for broadband and clicks on buynow button$")
        public void Customer_can_see_the_plan_for_broadband_and_clicks_on_buynow_button() throws Throwable{
            Object clicks = null;
            new broadband(clicks);
        }

        @Then ("^Customer clicks on continue button$")
        public void Customer_clicks_on_continue_button() throws Throwable {
            new String.continuebutton();
        }
        @Then ("^Customer enters the \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\"$" and click on submit button$")
        public void Customer_enters_the_and_click_on_submit_button(String firstname, String lastname,String mobilenumber,String email) throws Throwable{
        String firstname;
        String[] arr = new AccessibleRelation(firstname, lastname,mobilenumber);
            System.out.println("firstname="+Test);
            System.out.println("lastname="+ Test);
            System.out.println("mobilenumber="+07710163471);
        }

        @Then("^Customer can see the basket page and click on proceed button$")
        public void Customer_can_see_the_basket_page_and_click_on_proceed_button() throws Throwable {
            PageFactory pageFactory = new PageFactory();
            WebDriver driver = null;
            pageFactory.initElements(driver, ReviewBasket.class);
            ReviewBasket.notify();
            ReviewBasket.toString();

        }
    }

}
