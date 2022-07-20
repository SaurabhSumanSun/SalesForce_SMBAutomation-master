Feature: Order a device through business shop
  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and select the Broadband
    Then customer enters the "<postcode>" "<fixedlinenumber>""<o2mobilenumber>"
    Then Customer clicks the  check button
    Then Customer chooses the "<plan>" for broadband
    Then clicks on buynow button
    Then Customer clicks on continue button
    Then Customer enters the "<firstname>" "<lastname>" "<mobilenumber>"
    Then Customer can see the basket page and click on proceed button.
    Examples:
     |Scenario_ID                  | postcode | fixedlinenumber | o2mobilenumber |plan                              | firstname | lastname | mobilenumber |
      |TC_57 TC_58 TC_59 TC_60     | LS146HP  | 01132642584     | 07710163471    |Business Broadband Connect        |  Test     |   Test   | 07710163471  |
      |TC_74 TC_87 TC_69 TC_70     | LS146HP  | 01132642584     | 07710163471    |Business Broadband Fast Fibre     |  Test     |   Test   | 07710163471  |
      |TC_156 TC_157 TC_217 TC_271 | LS146HP  | 01132642584     | 07710163471    |Business Broadband Superfast Fibre|  Test     |   Test   | 07710163471  |