Feature: Order a device through business shop

  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and selects phone section and selects "<DevName>"
    Then Customer selects colour,capacity,quantity for "<memory>" tarrif and clicks on view tariff button
    Then customer selects  36 months by clicking on tarrif "<plan>"
    Then customer selects "<Tariff>" and click  on Go to basket button
    Then Customer lands on review basket page and clicks on proceed button
    Then customer will verify the pricing value


    Examples:
      |Scenario_Id| DevName                |memory|Tariff |plan     |
      |BSBC-1336  |iphone 12 pro Max 5G    |256GB |3GB    |36 months|
      |BSBC-1342  |iPhone 13 Pro Max       |256GB |3GB    |36 months|
      |BSBC-1344  |iPhone 13 Pro           |256GB |3GB    |36 months|
      |BSBC-1340  |Samsung Galaxy S22      |256GB |3GB    |36 months|
      |BSBC-1169  |iPhone 13               |256GB |3GB    |36 months|
      |BSBC-1170  |Samsung Galaxy S22 Plus |256GB |3GB    |36 months|
      |BSBC-1151  |Samsung Galaxy Z Fold3  |256GB |3GB    |36 months|
      |BSBC-1496  |iPhone 12 5G            |256GB |3GB    |36 months|
      |BSBC-1495  |iPhone SE 2020          |256GB |3GB    |36 months|
      |BSBC-1174  |Samsung Galaxy S22 Ultra|256GB |3GB    |36 months|
