package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions.Simo24;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AppJourney {
    static WebDriver driver;

    static WebDriver app;
    private Object appActions;
    private Object ReviewBasketPageCont;
    private Object ReviewBasketPageCount;


    @Given("^Customer is able to launch the businessshop and selects phone section and selects app$")
    public void Customer_is_able_to_launch_the_businessshop_and_select_app(String app) throws Throwable {
        PageFactory pageFactory = new PageFactory();
        WebDriver driver = null;
        pageFactory.initElements(driver,app.class);
        AppJourney.app(app);
    }


    @Then("^customer selects \"([^\"]*) and click on app$")
    public void customer_selects_and_click_on_app(String app) throws Throwable
        PageFactory.initElements(driver,apppage .class);
    apppage.Selection(app);


}
    @Then("^Customer can choose the app and click on it$")
    public void Customer_can_choose_the_app_and_click_on_it() throws Throwable {
        PageFactory.initElements(driver, appActions.class);
        appActions.finalize();

    }
    @Then("^Customer lands on review basket page and clicks on proceed button$")
    public void Customer_lands_on_review_basket_page_and_clicks_on_proceed_button() throws Throwable {
        PageFactory.initElements(driver, ReviewBasketPageCont.class);
        ReviewBasketPageCont.finalize();
        ReviewBasketPageCount.toString();
    }

private static void app(String app) {
        }
}