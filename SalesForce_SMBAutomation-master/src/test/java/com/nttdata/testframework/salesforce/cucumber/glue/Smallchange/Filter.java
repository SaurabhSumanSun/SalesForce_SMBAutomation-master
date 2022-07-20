package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Filter {

        public static String leadID;
        static WebDriver driver;
        private Object ProductPage;
        private Object BasketPage;
        private Object ReviewBasket;
        private Object TabletLandingPage;

        @Given ("^Customer is able to launch the businessshop and selects phone section and selects \"([^\"]*)\"$")
        public void Customer_is_able_to_launch_the_businessshop_and_selects_phone_section_and_selects(String TabName) throws Throwable{
            PageFactory pageFactory = new PageFactory();
            pageFactory.initElements(driver, TabletLandingPage.class);
            TabletLandingPage.PhoneSelect(TabName);
        }
        @Then ("^Customer selects colour,capacity,quantity for \"([^\"]*)\" tarrif and clicks on view tariff button$")
        public void Customer_selects_colour_capacity_quantity_for_tarrif_and_clicks_on_view_tariff_button(String memory)throws Throwable{
            PageFactory pageFactory = new PageFactory();
            pageFactory.initElements(driver, ProductPage.class);
            ProductPage.notify(memory);
            ProductPage.finalize();

        }

        private final boolean TarrifPage;

        @Then("^customer selects  24 months by clicking on tarrif plan"){
            Assert.assertFalse("customer selects  24 months by clicking on tarrif plan",
                    TarrifPage.notify());
            System.out.println(TarrifPage);
            TarrifPage.notify(TarrifPage);
        }
        @Then ("^customer selects \"([^\"]*)\" and click on Go To basket button$")
        public void customer_selects_and_click_on_Go_To_basket_button(String Tariff) throws Throwable{
            PageFactory pageFactory = new PageFactory();
            pageFactory.initElements(driver,TarrifPage.class);
            TarrifPage.Selection(Tariff);
        }
        @Then ("^Customer lands on review basket page and clicks on proceed button.$")
        public void Customer_lands_on_review_basket_page_and_clicks_on_proceed_button() throws Throwable{
            PageFactory pageFactory = new PageFactory();
            pageFactory.initElements(driver,ReviewBasket.class);
            ReviewBasket.notify();
            ReviewBasket.toString();

        }









    }
}
