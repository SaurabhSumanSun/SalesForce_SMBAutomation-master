package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.pagefactory.salesforce.AddCSVFile;
import com.nttdata.testframework.pagefactory.salesforce.output;
import com.nttdata.testframework.utils.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import scala.tools.nsc.doc.model.Public;

public class AF_Journey<salesGovernance, salesGovernanceDeliveryAndService, SalesGovernanceSupportAndSolution, LoginPage, AddDrop2Products, profitAndLossReport, discount, clauses, connectivityDrop1ApprovalsAndBasketSync> {
    static Logger logger = LogManager.getLogger(AF_Journey.class);
    public static int TCV2;
    public WebDriver driver;
    public static String supportType;
    public static String DealType;

    String oppLink;
    String basketLink;

    @Autowired
    CustomWebDriver customWebDriver;
    @Autowired
    Configuration configuration;
    @Autowired
    LoginPage loginPage;
    @Autowired
    com.nttdata.testframework.pagefactory.salesforce.opportunityPage opportunityPage;
    @Autowired
    com.nttdata.testframework.pagefactory.salesforce.newProductBasket newProductBasket;
    @Autowired
    com.nttdata.testframework.pagefactory.salesforce.AddCSVFile AddCSVFile;
    @Autowired
    AddDrop2Products AddDrop2Products;
    @Autowired
    profitAndLossReport profitAndLossReport;
    @Autowired
    discount discount;
    @Autowired
    clauses clauses;
    @Autowired
    connectivityDrop1ApprovalsAndBasketSync connectivityDrop1ApprovalsAndBasketSync;
    @Autowired
    com.nttdata.testframework.pagefactory.salesforce.output output;

    @Autowired
    salesGovernance SalesGovernance;
    @Autowired
    salesGovernanceDeliveryAndService SalesGovernanceDeliveryAndService;
    @Autowired
    SalesGovernanceSupportAndSolution salesGovernanceSupportAndSolution;
    private Object AddMobileProducts;
    private Object Tablet;

    public void AF_Journey(CustomWebDriver customWebDriver) {
        this.driver = (WebDriver) customWebDriver.getWebDriver();
    }

    @Given("^SalesREP login to salesforce application$")
    public void SalesREP_login_to_salesforce_application() throws Throwable {
        try {
            loginPage.login();
            //loginPage.profileLogin(supportType);
        }catch(Exception e){
            logger.error(e.toString());
        }
    }

    @Then("^SalesREP creates an opportunity with the \"([^\"]*)\" as Account \"([^\"]*)\" as Deal Type and \"([^\"]*)\" as Type of support$")
    public void SalesREP_creates_an_opportunity_with_the_as_Deal_Type_and_as_Type_of_support(String Account_Name, String Deal_Type, String Type_of_support) throws Throwable {
        String[] arr=opportunityPage.opportunityCreation ( Account_Name, Deal_Type, Type_of_support );
        DealType=arr[0];
        supportType=arr[1];
        oppLink= driver.getCurrentUrl();
    }

    @Then("^SalesREP creates a product basket$")
    public void SalesREP_creates_a_product_basket() throws Throwable {
        newProductBasket.productBasket(oppLink);
        basketLink= driver.getCurrentUrl();
    }

    @Then("^SalesREP adds CSV file from \"([^\"]*)\" location$")
    public void SalesREP_adds_CSV_file_from_location(String fileLocation) throws Throwable{
        Thread.sleep(3000);
        AddCSVFile.uploadFile(fileLocation);
    }

    @Then("^SalesREP adds Mobile products into basket$")
    public void SalesREP_adds_Mobile_products_into_basket() throws Throwable{
        AddMobileProducts.CPEPortal();
        Thread.sleep(10000);
        AddMobileProducts.configureMLAN();
        Thread.sleep(4000);
        AddMobileProducts.configureMeraki();
        Thread.sleep(4000);
        AddMobileProducts.configureGatewayInternet();
        Thread.sleep(4000);
        AddMobileProducts.configureGlobalAccess();
        Thread.sleep(4000);
    }

    @Then("^SalesREP views the Profit and Loss report for the configured mobile offer$")
    public void SalesREP_views_the_Profit_and_Loss_report_for_the_configured_mobile_offer() throws Throwable {
        profitAndLossReport.profitLoss();
    }
    @Then ("^SalesRep can change the color of handset but it does not change the journey$")
    public void SalesRep_can_change_the_color_of_handset_but_it_does_not_change_the_journey() throws Throwable{
        Object colorandhandset = null;
        colorandhandset.finalize();
    }
    
    @Then("^ SalesRep also does not change color for Tablet$")
    public void SalesRep_also_does_not_change_color_for_Tablet() throws Throwable{
        new changecolor(Tablet);
    }
    
}
