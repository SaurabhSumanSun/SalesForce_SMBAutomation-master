Feature:feature002
  Scenario Outline: To verify sales is able to perform an E2E
    Given user is on sales force home page on web "<browser>"
    When I enter User Name "<username>" and password "<Password>" and click enter button
    Then I verify home page is displayed
    Then click on contacts button
    Then click on manage External user and then click login page
    Then user selects the pac request and then click on continue button

    Examples:
      |Scenario_ID                                         | browser | username                                      | Password |
      |TC_30 TC_34 TC_78 TC_98 TC_102 TC_103 TC_233 TC_234 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod|Test@9999 |