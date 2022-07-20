Feature: Order a device through business shop

  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and selects phone section and selects "<DevName>"
    Then Customer selects colour,capacity,quantity for "<memory>" tariff and clicks on view tariff button
    Then customer selects  24 months by clicking on tariff "<plan>"
    Then customer selects "<Tariff>" and click on Go to basket button
    Then Customer lands on review basket page and clicks on proceed button
    Then customer will verify the pricing value
    Examples:
      |Scenario_id| DevName            | memory | plan  | Tariff  |
      |TC_106     |iphone 12 pro Max 5G|128GB   |3GB    |24 months|
      |TC_176     |iphone 12 pro Max 5G|256GB   |3GB    |24 months|
      |TC_177     |iphone 12 pro Max 5G|512GB   |3GB    |24 months|