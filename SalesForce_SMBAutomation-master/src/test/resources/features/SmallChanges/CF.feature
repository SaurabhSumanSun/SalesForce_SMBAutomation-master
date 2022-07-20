Feature: Order a device through business shop

  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and selects phone section and selects "<DevName>"
    Then Customer selects colour,capacity,quantity for "<memory>" tariff and clicks on view tariff button
    Then customer selects the months by clicking on tariff "<plan>"
    Then customer selects "<Tariff>" and click on Go to basket button
    Then Customer lands on review basket page and clicks on proceed button
    Then customer will verify the pricing value


    Examples:
      |Scenario_Id| DevName            |memory|Tariff |plan     |
      |TC_86      |iphone 12 pro Max 5G|256GB |3GB    |36 months|
      |TC_263     |iPhone 13 Pro Max   |256GB |3GB    |36 months|
      |TC_368     |iPhone 13 Pro       |256GB |3GB    |36 months|
      |TC_370     |iPhone 12 5G        |256GB |3GB    |36 months|
      |TC_371     |iPhone 13           |256GB |3GB    |36 months|