Feature: Feature005
  Scenario Outline:verify User is able to login as sales rep successfully
    Given user is on sales force home page on web "<browser>"
    When I enter User Name "<username>" and password "<Password>" and click enter button
    Then I verify home page is displayed
    And I search for sales rep "<SKU>" and click search button
    Then I verify SKU home page
    Then I navigate to user details page
    Then i click on "<commerical>" product


    Examples:
      |Scenario_Id         |browser  |         username                              | Password       |SKU        |commerical                             |
      |BSBC-1343 BSBC-1338 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Sony Xperia Pro I 512GB Frosted Black |
      |BSBC-1370,BSBC-1389 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | iphone 12 pro Max 5G                  |
      |BSBC-1115,BSBC-1120 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | iPhone 13 Pro Max                     |
      |BSBC-747, BSBC-1119 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | iPhone 13 Pro                         |
      |BSBC-1122,BSBC-1123 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Samsung Galaxy S22                    |
      |BSBC-1175,BSBC-1176 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | iPhone 13                             |
      |BSBC-1152,BSBC-1125 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Samsung Galaxy S22 Plus               |
      |BSBC-1164,BSBC-1163 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Samsung Galaxy Z Fold3                |
      |BSBC-1191,BSBC-1129 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | iPhone 12 5G                          |
      |BSBC-1128,BSBC-1127 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | iPhone SE 2020                        |
      |BSBC-1167,BSBC-1126 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Samsung Galaxy S22 Ultra              |
      |BSBC-1201,BSBC-1199 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Google Pixel 6 Pro                    |
      |BSBC-1203,BSBC-1204 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | iPhone 12 Pro 5G                      |
      |BSBC-1131,BSBC-1481 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | iPhone 13 mini                        |
      |BSBC-1482,BSBC-1483 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Samsung Galaxy S21 FE 5G              |
      |BSBC-1484,BSBC-1485 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Samsung Galaxy S21 5G                 |
      |BSBC-1486,BSBC-1467 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Samsung Galaxy S21 Ultra 5G           |
      |BSBC-1503,BSBC-1502 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | Samsung Galaxy S21 Plus 5G            |
      |BSBC-1504,BSBC-1511 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | iPhone 12 mini 5G                     |
      |BSBC-1121           |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod| Test@9999      |SKU        | OPPO A16s                             |
