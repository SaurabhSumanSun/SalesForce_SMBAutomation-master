package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions.Simo24;
import ml.dmlc.xgboost4j.LabeledPoint$;
import okio.Buffer;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import scala.tools.nsc.backend.icode.Primitives;

import javax.accessibility.AccessibleRelation;

public class Broadband<LS146HP> {
    private static final Object LS146HP = ;
    private Object Postcode;
    private Object fixedlinenumber;
    private Object o2mobilenumber;
    private Buffer ReviewBasket;

    @Given("^Customer is able to launch the businessshop and select the \"([^\"]*)\"$")
    public void Customer_is_able_to_launch_the_businessshop_and_select(String Broadband) throws Throwable {
        PageFactory pageFactory = new PageFactory();
        WebDriver driver = null;
        pageFactory.initElements(driver, Broadband.class);
        Broadband.finalize(Broadband);
    }

    @Then("^customer enters the \"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\"$")
    public void customer_enters_the(String Postcode, String fixedlinenumber, String o2mobilenumber) throws Throwable{
        String[] arr = new AccessibleRelation(Postcode, fixedlinenumber, o2mobilenumber);
       System.out.println("Postcode="+LS146HP);
        System.out.println("fixedlinenumber="+01132642584);
        System.out.println("o2mobilenumber="+07710163471);
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
    @Then ("^Customer enters the \"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\"$")
    public void Customer_enters_the_(String firstname, String lastname,String mobilenumber) throws Throwable{
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


