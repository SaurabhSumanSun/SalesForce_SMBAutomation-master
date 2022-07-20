package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Simo24<driver, Tariff> {
    static WebDriver driver;
    public static WebDriver TariffPage;
    static WebDriver Tariff;
    private Object SIMOActions;
    private Object ReviewBasketPageCont;
    private Object ReviewBasketPageCount;

    public static void Simo(String simo) {
    }


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
        SIMOActions.SIMOAction(SimoContractTerm, SimoTariff, FourG_FiveGSIMO, SIMOSpendCapSelect, SIMOSpendCapValue);

    }
    @Then("^ Customer lands on review basket page and clicks on proceed button$")
    public void Customer_lands_on_review_basket_page_and_clicks_on_proceed_button() throws Throwable{
        PageFactory.initElements(driver, ReviewBasketPageCont.class);
        ReviewBasketPageCont.finalize();
        ReviewBasketPageCount.toString();
    }

}

