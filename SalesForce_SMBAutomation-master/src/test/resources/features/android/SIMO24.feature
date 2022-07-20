Feature: Order a device through business shop
  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and select the SIMO
    Then customer selects tariff plan and click on tariff
    Then Customer selects SIMO "<SimoContractTerm>" , "<SimoTariff>" , "<FourG_FiveGSIMO>" ,"<SIMOSpendCapSelect>" and "<SIMOSpendCapValue>"
    Then Customer lands on review basket page and clicks on proceed button
    Examples:
      |Scenario_Id                              |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|
      |BSBC-1343 BSBC-1338 |24              |20GB      |4G             |NO                |5                |
      |BSBC-1115 BSBC-1120 |24              |40GB      |4G             |NO                |10               |
      |BSBC-1122 BSBC-1123 |24              |4GB       |4G             |NO                |15               |
      |BSBC-1152 BSBC-1125 |24              |50GB      |4G             |NO                |20               |
      |BSBC-1191 BSBC-1129 |24              |6GB       |4G             |NO                |30               |
      |BSBC-1167 BSBC-1126 |24              |20GB      |4G             |NO                |50               |
      |BSBC-1203 BSBC-1204 |24              |40GB      |4G             |NO                |75               |
      |BSBC-1482 BSBC-1483 |24              |4GB       |4G             |NO                |100              |
      |BSBC-1486,BSBC-1467 |24              |50GB      |4G             |NO                |200              |
      |BSBC-1504,BSBC-1511 |24              |6GB       |4G             |NO                |5                |
      |BSBC-1370 BSBC-1389 |24              |20GB      |5G             |NO                |5                |
      |BSBC-747 BSBC-1119  |24              |40GB      |4G             |NO                |10               |
      |BSBC-1175 BSBC-1176 |24              |4GB       |4G             |NO                |15               |
      |BSBC-1164 BSBC-1163 |24              |50GB      |4G             |NO                |20               |
      |BSBC-1128 BSBC-1127 |24              |6GB       |4G             |NO                |30               |
      |BSBC-1201 BSBC-1199 |24              |20GB      |4G             |NO                |50               |
      |BSBC-1131 BSBC-1481 |24              |40GB      |4G             |NO                |75               |
      |BSBC-1484 BSBC-1485 |24              |4GB       |4G             |NO                |100              |
      |BSBC-1503 BSBC-1502 |24              |50GB      |4G             |NO                |200              |
      |BSBC-1121           |24              |6GB       |4G             |NO                |5                |
