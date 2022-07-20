Feature:feature003
  Scenario Outline: To verify sales is able to perform an E2E
    Given user is on sales force home page on web "<browser>"
    When I enter User Name "<username>" and password "<Password>" and click enter button
    Then I verify home page is displayed
    Then click on contacts button
    Then click on manage External user and then click login page
    Then user selects the Stac request and then click on continue button

    Examples:
      |Scenario_ID                           | browser | username                                      | Password |
      |TC_31 TC_35 TC_99 TC_101 TC_104 TC_238|chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod|Test@9999 |