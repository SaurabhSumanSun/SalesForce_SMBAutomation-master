Feature: AF journey


  Scenario : To verify that salesRep is able to complete an E2E order successfully
    Given SalesREP login to salesforce application
    Then SalesREP creates an opportunity with the "Acquisition" as Deal Type and "Self-serve pricing tools" as Type of support
    Then  SalesREP creates a product basket
    Then SalesREP adds CSV file from "C:\Users\angelr2\Desktop\MLAN & Meraki CSV.csv" location
    Then SalesREP adds "<Mobile>" product into basket
    Then SalesREP views the Profit and Loss report for the configured mobile offer
    Then SalesRep can change the color of handset but it does not change the journey
    Then SalesRep also does not change color for Tablet
    Then SalesRep can remove the device through review basket page

      |Scenario_Id   |Mobile                     |
      |TC_38 TC_13   |iphone 12 pro Max 5G       |
      |TC_39 TC_40   |iPhone 13 Pro Max          |
      |TC_41 TC_42   |iPhone 13 Pro              |
      |TC_43 TC_44   |Samsung Galaxy S22         |
      |TC_45 TC_46   |iPhone 13                  |
      |TC_47 TC_48   |Samsung Galaxy S22 Plus    |
      |TC_49 TC_50   |Samsung Galaxy Z Fold3     |
      |TC_62 TC_64   |iPhone 12 5G               |
      |TC_65 TC_67   |iPhone SE 2020             |
      |TC_71 TC_72   |Samsung Galaxy S22 Ultra   |
      |TC_82 TC_83   |iPhone 13 mini             |
      |TC_84 TC_91   |Google Pixel 6 Pro         |
      |TC_113 TC_123 |iPhone 12 Pro 5G           |
      |TC_133 TC_142 |Samsung Galaxy S21 FE 5G   |
      |TC_146 TC_158 |Samsung Galaxy S21 5G      |
      |TC_159 TC_162 |Samsung Galaxy S21 Ultra 5G|
      |TC_163 TC_180 |Samsung Galaxy S21 Plus 5G |
      |TC_181 TC_187 |iPhone 12 mini 5G          |
      |TC_236 TC_237 |OPPO A16s                  |
      |TC_273 TC_274 |OPPO A94                   |
      |TC_286 TC_369 |Moto G31                   |


