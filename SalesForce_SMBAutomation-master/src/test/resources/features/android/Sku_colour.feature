Feature: Feature006
  Scenario Outline:verify User is able to login as sales rep successfully
    Given user is on sales force home page on web "<browser>"
    When I enter User Name "<Username>" and password "<Password>" and click enter button
    Then I verify home page is displayed
    And I search for sales rep "<SKU>" and click search button
    Then I verify SKU home page
    Then I navigate to user details page
    Then i click on "<commerical>" product
    Then user can select the "<colour>"


    Examples:
      |Scenario_Id |browser  |         Username                              |  Password       |SKU  |commerical                             |colour  |
      |BSBC-1234   |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999       |SKU  | Sony Xperia Pro I 512GB Frosted Black |#292929 |
      |BSBC-1233   |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999       |SKU  | iphone 12 pro Max 5G                  |#292929 |
      |BSBC-1368   |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999       |SKU  | iPhone 13 Pro Max                     |#292929 |
      |BSBC-1474   |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999       |SKU  | iPhone 13 Pro                         |#292929 |
