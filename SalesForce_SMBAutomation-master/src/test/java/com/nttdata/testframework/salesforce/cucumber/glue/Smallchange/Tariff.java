package com.nttdata.testframework.salesforce.cucumber.glue.Smallchange;

import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Tariff<MyIdentity, PropositionInLife, WebDriverConfigs, NewProposition, TariffValidation> {


        static Logger logger = LoggerFactory.getLogger(Tariff.class);
        private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(Tariff.class);
        public static Scenario scenario;
        private static ExtentTest test;

        @Autowired
        MyIdentity MyIdentity;

        @Autowired
        PropositionInLife PropositionInLife;

        @Autowired
        WebDriverConfigs webDriverConfigs;

        @Autowired
        NewProposition NewProposition;

        @Autowired
        TariffValidation tariffValidation;


        @Given("i am on the MyIdentity page")
        public void LaunchMyIdentity() throws InterruptedException {
            MyIdentity.myIdentityLaunch();
            logger.info("MyIdentity page is successfully launched");
        }

        @When("i enter username as {string} with password as {string}")
        public void UserLogin(String username, String password) {
            System.out.println("IN Second Loop");
            Assert.assertFalse("Username is empty, please supply a valid user name in feature file",
                    username.isBlank());
            Assert.assertFalse("Password is empty, please supply a valid password for the username" +
                    " in feature file", password.isBlank());
            MyIdentity.myIdentityLogin(username, password);
            logger.info("MyIdentity Login is successful");
        }

        @Then("i should be logged in successfully using my {string}")
        public void ValidateSuccessfulPropositionLogin(String memorablePhrase) throws InterruptedException {
            Assert.assertFalse("MemorablePhrase is empty, please supply a user specific memorable phrase" +
                    " in feature file", memorablePhrase.isBlank());
            MyIdentity.SmbPssLogin(memorablePhrase);
            logger.info("PropositionInLife launch is in progress");
            PropositionInLife.SwitchToPropositionTab();
        }

        @When("i click on the {string} and click on new")
        public void ProposalRequestTypeSelection(String ProposalRequestType) throws InterruptedException {
            Assert.assertFalse("The Proposal Request type is blank in feature please provide a valid data",
                    ProposalRequestType.isBlank());
            System.out.println(ProposalRequestType);
            PropositionInLife.SelectPropositionRequestType(ProposalRequestType);
        }

        @Then("i enter the {string} and select the below MPNs for the desired {string}")
        public void i_enter_the_and_select_the_below_MPNs_for_the_desired(String Acno, String inLifeOperation, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
            System.out.println("THE VALUE FOR INLIFE OPERATION IS: " + inLifeOperation);
            Assert.assertFalse("The Request search value that is Account number is blank in feature please provide a valid data",
                    Acno.isBlank());
            Assert.assertFalse("The Request search value that is Inlife operation type is blank in feature please provide a valid data",
                    inLifeOperation.isBlank());
            PropositionInLife.performInlifechanges(dataTable, inLifeOperation, Acno);
        }

        @Then("i select the tariff type and select the tariff data type of specific qty")
        public void NewconnectionSetup(io.cucumber.datatable.DataTable dataTable) {
            Assert.assertFalse("The data table is not completed in feature", dataTable.isEmpty());
            NewProposition.NewProposal(dataTable);
        }

        @Then("i validate the price of the below tariffs")
        public void i_validate_the_price_of_the_below_tariffs(io.cucumber.datatable.DataTable dataTable) {
            tariffValidation.validateTariffprice(dataTable);
            throw new cucumber.api.PendingException();
        }

    }
