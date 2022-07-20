Feature: Feature004
  Scenario Outline: To verify sales rep is able to perform E2E
    Given User logins as sales rep for RU portal

    Then User enters the "<MPN>" and "<CompanyName>"
    Then User enters the "<accountpin>" and click on check button
    Then User can see the page and click on proceed
    Then User can add the Upgrade for all RU products by clicking on sim "<select handset>" "<IMEI Number>" and "<Select Tariff>"
    Then User can click on proceed to insurance
    Then User click on proceed to upgrade
    Then User can see the order summary page and click on place order
    Then User can see the total approved page
    Examples:
      |Scenario_Id         | MPN       | CompanyName | accountpin |select handset             |IMEI Number    |Select Tariff                 |
      |BSBC-1343 BSBC-1338 |07805203200|testaccount   |1010       |iphone 12 pro Max 5G       |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1389 BSBC-1115 |07805203200|testaccount   |1010       |iPhone 13 Pro Max          |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-747 BSBC-1119  |07805203200|testaccount   |1010       |iPhone 13 Pro              |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1123 BSBC-1175 |07805203200|testaccount   |1010       |Samsung Galaxy S22         |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1152 BSBC-1125 |07805203200|testaccount   |1010       |iPhone 13                  |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1163 BSBC-1191 |07805203200|testaccount   |1010       |Samsung Galaxy S22 Plus    |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1128 BSBC-1127 |07805203200|testaccount   |1010       |Samsung Galaxy Z Fold3     |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1126 BSBC-1201 |07805203200|testaccount   |1010       |iPhone 12 5G               |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1203 BSBC-1204 |07805203200|testaccount   |1010       |iPhone SE 2020             |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1481 BSBC-1482 |07805203200|testaccount   |1010       |Samsung Galaxy S22 Ultra   |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1484 BSBC-1485 |07805203200|testaccount   |1010       |Google Pixel 6 Pro         |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1467 BSBC-1503 |07805203200|testaccount   |1010       |iPhone 12 Pro 5G           |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1504 BSBC-1511 |07805203200|testaccount   |1010       |iPhone 13 mini             |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1148           |07805203200|testaccount   |1010       |iPhone 12 mini 5G          |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1370 BSBC-1120 |07805203200|testaccount   |1010       |Samsung Galaxy S21 FE 5G   |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1122 BSBC-1176 |07805203200|testaccount   |1010       |Samsung Galaxy S21 5G      |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1164 BSBC-1129 |07805203200|testaccount   |1010       |Samsung Galaxy S21 Ultra 5G|100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1167 BSBC-1199 |07805203200|testaccount   |1010       |Samsung Galaxy S21 Plus 5G |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1131 BSBC-1483 |07805203200|testaccount   |1010       |iPhone 12 mini 5G          |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1486 BSBC-1502 |07805203200|testaccount   |1010       |OPPO A16s                  |100000000000000| small Bizz 3GB 24M RU opt 22 |
      |BSBC-1121           |07805203200|testaccount   |1010       |Moto G31                   |100000000000000| small Bizz 3GB 24M RU opt 22 |