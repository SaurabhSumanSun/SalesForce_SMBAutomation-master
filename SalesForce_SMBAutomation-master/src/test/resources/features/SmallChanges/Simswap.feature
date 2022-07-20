Feature:feature001
  Scenario Outline: To verify sales is able to perform an E2E
    Given user is on sales force home page on web "<browser>"
    When I enter User Name "<username>" and password "<Password>" and click enter button
    Then I verify home page is displayed
    Then click on contacts button
    Then click on manage external user and click on login simswap page
    Then i enter the and select the below MPNs for the desired "<value>"
              |MPN        | value               |
              |07973123456 | 8945568925236588512 |
    Examples:
      |Scenario_Id                                                                                        | browser | username                                      | Password |
      |TC_29 TC_33 TC_32 TC_36 TC_79 TC_97 TC_100 TC_105 TC_235 TC_276 TC_277 TC_278 TC_294 TC_295 TC_296 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod|Test@9999 |


