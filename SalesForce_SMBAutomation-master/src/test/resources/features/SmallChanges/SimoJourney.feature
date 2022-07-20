Feature: Order a device through business shop
  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and select the SIMO
    Then customer selects tariff plan and click on tariff
    Then Customer selects SIMO "<SimoContractTerm>" , "<SimoTariff>" , "<FourG_FiveGSIMO>" ,"<SIMOSpendCapSelect>" and "<SIMOSpendCapValue>"
    Then Customer lands on review basket page and clicks on proceed button
    Then Customer can see the order number
    Examples:
     |Scenario_ID |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|
     |TC_19       |12              |20GB      |4G             |NO                |                 |
     |TC_24       |12              |40GB      |4G             |NO                |                 |
     |TC_89       |12              |4GB       |4G             |NO                |                 |
     |TC_186      |12              |50GB      |4G             |NO                |                 |
     |TC_227      |12              |6GB       |4G             |NO                |                 |
     |TC_230      |12              |20GB      |4G             |NO                |                 |
     |TC_293      |12              |40GB      |4G             |NO                |                 |
     |TC_319      |12              |4GB       |4G             |NO                |                 |
     |TC_349      |12              |50GB      |4G             |NO                |                 |
     |TC_20       |12              |20GB      |5G             |YES               |5                |
     |TC_25       |12              |40GB      |5G             |YES               |10               |
     |TC_90       |12              |4GB       |5G             |YES               |15               |
     |TC_203      |12              |50GB      |5G             |YES               |20               |
     |TC_228      |12              |6GB       |5G             |YES               |30               |
     |TC_275      |12              |20GB      |5G             |YES               |50               |
     |TC_317      |12              |40GB      |5G             |YES               |75               |
     |TC_320      |12              |4GB       |5G             |YES               |100              |
     |TC_350      |12              |50GB      |5G             |YES               |200              |
     |TC_21       |24              |20GB      |4G             |YES               |5                |
     |TC_88       |24              |40GB      |4G             |YES               |10               |
     |TC_185      |24              |4GB       |4G             |YES               |15               |
     |TC_206      |24              |50GB      |4G             |YES               |20               |
     |TC_229      |24              |6GB       |4G             |YES               |30               |
     |TC_285      |24              |20GB      |4G             |YES               |50               |
     |TC_318      |24              |40GB      |4G             |YES               |75               |
     |TC_321      |24              |4GB       |4G             |YES               |100              |
