Feature: Feature002
  Scenario Outline: To verify sales rep is able to perform E2E
    Given User logins as sales rep for RU portal

    Then User enters the "<MPN>" and "<CompanyName>"
    Then User enters the "<accountpin>" and click on check button
    Then User can see the page and click on proceed
    Then User can add the Upgrade for all RU products "<select handset>" "<IMEI Number>" and "<Select Tariff>"
    Then User can click on proceed to insurance
    Then User click on proceed to upgrade
    Then User can see the order summary page and click on place order
    Then User can see the total approved page
    Examples:
     |Scenario_Id| MPN       | CompanyName | accountpin |select handset          |IMEI Number    |Select Tariff                 |
     |BSBC-1336  |07805203200|testaccount   |1010       |iphone 12 pro Max 5G    |100000000000000| small Bizz 3GB 36M RU opt 22 |
     |BSBC-1342  |07805203200|testaccount   |1010       |iPhone 13 Pro Max       |100000000000000| small Bizz 3GB 36M RU opt 22 |
     |BSBC-1344  |07805203200|testaccount   |1010       |iPhone 13 Pro           |100000000000000| small Bizz 3GB 36M RU opt 22 |
     |BSBC-1340  |07805203200|testaccount   |1010       |Samsung Galaxy S22      |100000000000000| small Bizz 3GB 36M RU opt 22 |
     |BSBC-1169  |07805203200|testaccount   |1010       |iPhone 13               |100000000000000| small Bizz 3GB 36M RU opt 22 |
     |BSBC-1170  |07805203200|testaccount   |1010       |Samsung Galaxy S22 Plus |100000000000000| small Bizz 3GB 36M RU opt 22 |
     |BSBC-1151  |07805203200|testaccount   |1010       |Samsung Galaxy Z Fold3  |100000000000000| small Bizz 3GB 36M RU opt 22 |
     |BSBC-1496  |07805203200|testaccount   |1010       |iPhone 12 5G            |100000000000000| small Bizz 3GB 36M RU opt 22 |
     |BSBC-1495  |07805203200|testaccount   |1010       |iPhone SE 2020          |100000000000000| small Bizz 3GB 36M RU opt 22 |
     |BSBC-1148  |07805203200|testaccount   |1010       |Samsung Galaxy S22 Ultra|100000000000000| small Bizz 3GB 36M RU opt 22 |