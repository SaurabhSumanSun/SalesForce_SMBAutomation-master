Feature: Order a device through business shop
  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and select the SIMO
    Then customer selects tariff plan and click on tariff
    Then Customer selects SIMO "<SimoContractTerm>" , "<SimoTariff>" , "<FourG_FiveGSIMO>" ,"<SIMOSpendCapSelect>" and "<SIMOSpendCapValue>"
    Then Customer lands on review basket page and clicks on proceed button
    Then customer can see the order is successful
    Then customer can receives the "<email>"
    Examples:
      |Scenario_Id   |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|email            |
      |TC_28 TC_12   |12              |20GB      |4G             |NO                |5                |Test@yopmail.com |
      |TC_66 TC_73   |12              |40GB      |4G             |NO                |10               |Test@yopmail.com |
      |TC_75 TC_76   |12              |4GB       |4G             |NO                |15               |Test@yopmail.com |
      |TC_92 TC_93   |12              |50GB      |4G             |NO                |20               |Test@yopmail.com |
      |TC_95 TC_114  |12              |6GB       |4G             |NO                |30               |Test@yopmail.com |
      |TC_134 TC_145 |12              |20GB      |4G             |NO                |50               |Test@yopmail.com |
      |TC_172 TC_179 |12              |40GB      |4G             |NO                |75               |Test@yopmail.com |
      |TC_213 TC_218 |12              |4GB       |4G             |NO                |100              |Test@yopmail.com |
      |TC_231 TC_232 |12              |50GB      |4G             |NO                |200              |Test@yopmail.com |
      |TC_249 TC_253 |24              |6GB       |4G             |NO                |5                |Test@yopmail.com |
      |TC_256 TC_258 |24              |20GB      |4G             |NO                |10               |Test@yopmail.com |
      |TC_280 TC_284 |24              |40GB      |4G             |NO                |15               |Test@yopmail.com |
      |TC_303 TC_309 |24              |4GB       |4G             |NO                |20               |Test@yopmail.com |
      |TC_323 TC_329 |24              |50GB      |4G             |NO                |30               |Test@yopmail.com |
      |TC_341 TC_345 |24              |6GB       |4G             |NO                |50               |Test@yopmail.com |
      |TC_354 TC_361 |24              |20GB      |4G             |NO                |75               |Test@yopmail.com |
      |TC_372        |24              |40GB      |4G             |NO                |100              |Test@yopmail.com |
      |TC_61         |24              |20GB      |4G             |NO                |200              |Test@yopmail.com |
      |TC_74         |12              |40GB      |5G             |NO                |10               |Test@yopmail.com |
      |TC_77         |12              |4GB       |5G             |NO                |15               |Test@yopmail.com |
      |TC_94         |12              |50GB      |5G             |NO                |20               |Test@yopmail.com |
      |TC_124        |12              |6GB       |5G             |NO                |30               |Test@yopmail.com |
      |TC_154        |12              |20GB      |5G             |NO                |50               |Test@yopmail.com |
      |TC_207        |12              |40GB      |5G             |NO                |75               |Test@yopmail.com |
      |TC_224        |12              |4GB       |5G             |NO                |100              |Test@yopmail.com |
      |TC_241        |12              |50GB      |5G             |NO                |200              |Test@yopmail.com |
      |TC_255        |24              |6GB       |5G             |NO                |5                |Test@yopmail.com |
      |TC_279        |24              |20GB      |5G             |NO                |10               |Test@yopmail.com |
      |TC_297        |24              |40GB      |5G             |NO                |15               |Test@yopmail.com |
      |TC_315        |24              |4GB       |5G             |NO                |20               |Test@yopmail.com |
      |TC_335        |24              |50GB      |5G             |NO                |30               |Test@yopmail.com |
      |TC_352        |24              |6GB       |5G             |NO                |50               |Test@yopmail.com |
      |TC_366        |24              |20GB      |5G             |NO                |75               |Test@yopmail.com |
      |TC_377        |24              |40GB      |5G             |NO                |100              |Test@yopmail.com |
