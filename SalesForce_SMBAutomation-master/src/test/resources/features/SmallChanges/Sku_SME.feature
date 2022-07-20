Feature: Feature006
  Scenario Outline: To verify Sales rep is able to perform an E2E
    Given User logins in preprod environment as Ben Myres for SME channel
    Then User can creates the opportunities with the following details "<Opportunity Name>" "<Account_Name>" "<Stage>" "<Type>" "<Close_Date>"
    Then User creates the product basket to add SMB Digital Products
    Then User configures all SMB Digital products in the basket with the following details "<Contract_Term>" "<Product_PurchaseType>" "<Service_Template>" "<Digital_ProductName>" "<Domain>" "<DISE_AccountNumber>" "<CSP_Product>" "<Microsoft_Admin_Domain>"
    Then User can click on finish button


    Examples:
      |Scenario_Id |Opportunity Name  |Account_Name| Stage            | Type       | Close_Date|Contract_Term|Product_PurchaseType|Service_Template|Digital_ProductName  |DISE_AccountNumber|CSP_Product|Microsoft_Admin_Domain   |
      |TC_7 TC_8   |Test              |Test        |Awareness of Needs|New Business| DD/MM/YYY |1Month       |New                 |o365            |Enterprise Multi SKU |4667658           |YES        |Microsoft.onmicrosoft.com|