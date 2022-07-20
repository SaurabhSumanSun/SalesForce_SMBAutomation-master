Feature: Order a device through business shop
  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and select the Broadband
    Then customer enters the "<postcode>" "<fixedlinenumber>""<o2mobilenumber>"
    Then Customer clicks the  check button
    Then Customer can see the plans for Landline and clicks on buynow button
    Then Customer clicks on continue button
    Then Customer enters the "<firstname>" "<lastname>" "<mobilenumber>"
    Then Customer can see the basket page and click on proceed button.
    Examples:
      |Scenario_ID         | postcode | fixedlinenumber | o2mobilenumber | firstname | lastname | mobilenumber |
      |TC_209,TC_210,TC_214| LS146HP  | 01132642584     | 07710163471    |  Test     |   Test   | 07710163471  |