package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions.Simo24;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions.Simo24.TariffPage;

public class SimoJourney<ordernumber, TariffPage, driver, Tariff> {
    static WebDriver driver;

    static WebDriver Tariff;
    private Object SIMOActions;
    private Object ReviewBasketPageCont;
    private Object ReviewBasketPageCount;


    @Given("^Customer is able to launch the businessshop and selects phone section and selects \"([^\"]*)\"$")
    public void Customer_is_able_to_launch_the_businessshop_and_select(String Simo) throws Throwable {
        PageFactory pageFactory = new PageFactory();
        WebDriver driver = null;
        pageFactory.initElements(driver, Simo.class);
        Simo24.Simo(Simo);
    }

    @Then("^customer selects \"([^\"]*) and click on tariff$")
    public void customer_selects_and_click_on_tariff(String Tariff) throws Throwable
        PageFactory.initElements(driver,TariffPage .class);
    TariffPage.Selection(Tariff);

    @Then("^Customer selects SIMO \"([^\"]\" ,\"([^\"]\" ,\"([^\"]\",\"([^\"]\"and \"([^\"]\"$")
    public void Customer_selects_SIMO_and(String SimoContractTerm, String SimoTariff, String FourG_FiveGSIMO, String SIMOSpendCapSelect, String SIMOSpendCapValue) throws Throwable {
        PageFactory.initElements(driver, SIMOActions.class);
        SIMOActions.finalize(SimoContractTerm, SimoTariff, FourG_FiveGSIMO, SIMOSpendCapSelect, SIMOSpendCapValue);

    }
    @Then("^ Customer lands on review basket page and clicks on proceed button$")
    public void Customer_lands_on_review_basket_page_and_clicks_on_proceed_button() throws Throwable{
        PageFactory.initElements(driver, ReviewBasketPageCont.class);
        ReviewBasketPageCont.finalize();
        ReviewBasketPageCount.toString();
    }
    @Then ("^Customer can see the order number$")
    public void Customer_can_see_the_order_number() throws Throwable
        System.Logger(ordernumber);


}



