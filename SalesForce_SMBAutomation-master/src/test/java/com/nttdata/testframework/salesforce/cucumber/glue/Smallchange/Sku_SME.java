package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import javax.print.attribute.standard.Finishings;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Sku_SME<driver, LoginPage, opportunityPage, newProductBasket, BasketPage>(CustomWebDriver customWebDriver) {
        this.driver = (WebDriver) customWebDriver.getWebDriver();

    private static final Object DDMMYYYY =null;
    private static final Object YYYY = ;
    static Logger logger = LogManager.getLogger(Promo_LBM.class);

    public WebDriver driver;
    public static String supportType;
    public static String  Stage;
    String oppLink;
    String basketLink;
    int TCV2;
    String TCV1;
    @Autowired
    LoginPage Loginpage;
    @Autowired
    opportunityPage Opportunitypage;
    @Autowired
    newProductBasket Productbasket;

    @Autowired
    BasketPage BasketPage;
    private Object Opportunity;
    private Object opportunityPage;
    private String Term;
    private String Stringstage;


    @Given("^User logins in preprod environment as Ben Myres for SME channel$")
    public void User_logins_in_preprod_environment_as_Ben_Myres_for_SME_channel() throws Throwable {
        try {
            Loginpage.equals();
            Loginpage.finalize(supportType);
        }catch(Exception e)
        {
            logger.error(e.toString());
        }
    }

    @Then("^User can creates the opportunities with the following details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void User_can_creates_the_opportunities_with_the_following_details(String Opportunity_Name, String Account_Name, String Stage , String Type , String Close_Date ) throws Throwable {
        String arr=opportunityPage.toString( Opportunity_Name ,Account_Name ,Stage ,Type ,Close_Date);
        Type=arr[1];
        String stage = arr[0];
        opportunityPage = "+Test";
        Account_Name = "+Test";
        Close_Date = "+ DD/MM/YYYY"
        System.out.println("Type: " +Type);
        System.out.println("Stringstage: " +Stringstage);
        System.out.println("opportunityPage:"+opportunityPage);
        System.out.println("Account_Name: " +Test);
        System.out.println("Close_Date: " +DD/MM/YYYY);

        oppLink= driver.getCurrentUrl();
    }

    @Then("User creates the product basket to add SMB Digital Products$")
    public void User_creates_the_product_basket_to_add_SMB_Digital_Products(DataTable table) throws Throwable {
        List<Map<String, String>> list = table.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {
            Object productdetail = new Object();
            productdetail.finalize(list.get(i).get("Contract_Term"), list.get(i).get("Product_PurchaseType"), list.get(i).get("Digital_ProductName"), list.get(i).get("Service_Template"), list.get(i).get("Domain"), list.get(i).get("DISE_AccountNumber"), list.get(i).get("CSP_Product"), list.get(i).get("Microsoft_Admin_Domain"));
            driver.get(oppLink);
        }
    }


    @Then("^User configures all SMB Digital products in the basket with the following details\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void User_configures_all_SMB_Digital_products_in_the_basket_with_the_following_details(String Contract_Term,String Product_PurchaseType,String Service_Template ,String Digital_ProductName ,String Domain,String DISE_AccountNumber,String CSP_Product ,String Microsoft_Admin_Domain) throws InterruptedException, IOException {
        ObjectInputFilter.Config.filterLog(Contract_Term ,Product_PurchaseType ,Service_Template ,Digital_ProductName ,Domain ,DISE_AccountNumber ,CSP_Product ,Microsoft_Admin_Domain);
        CSP_Product= "YES";
        Contract_Term=Term;
        ;
    }
    @Then("^ User can click on finish button$")
    public void User_can_click_on_finish_button()throws Throwable{
        Finishings.finish();

    }




}

}

