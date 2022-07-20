Feature: Feature005
  Scenario Outline:verify User is able to login as sales rep successfully
    Given user is on sales force home page on web "<browser>"
    When I enter User Name "<username>" and password "<Password>" and click enter button
    Then I verify home page is displayed
    Then I can choose the "<app>" and click on it
    And  I search for sales rep "<SKU>" and click search button
    Then I verify SKU home page
    Then I navigate to user details page
    Then i click on "<commerical>" product
    Examples:
     |Scenario_Id | browser | username                                      | Password       | SKU       | commerical                            |app         |
     |TC_5 TC_6   |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Sony Xperia Pro I 512GB Frosted Black |Microsoft365|


