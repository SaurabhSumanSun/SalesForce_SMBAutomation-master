Feature: Order a device through business shop
  Scenario Outline: Customer orders a SIMO through businessshop
    Given Customer is able to launch the businessshop and select the SIMO
    Then customer selects tariff plan and click on tariff
    Then Customer selects SIMO "<SimoContractTerm>" , "<SimoTariff>" , "<FourG_FiveGSIMO>" ,"<SIMOSpendCapSelect>" and "<SIMOSpendCapValue>"
    Then Customer lands on review basket page and clicks on proceed button
    Then customer can see the order is successful
    Examples:
     |Scenario_Id           |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|
     |TC_9 TC_10 TC_14      |12              |20GB      |4G             |NO                |5                |
     |TC_11 TC_14 TC_15     |12              |40GB      |4G             |NO                |10               |
     |TC_17 TC_63 TC_68     |12              |4GB       |4G             |NO                |15               |
     |TC_112 TC_136 TC_141  |12              |50GB      |4G             |NO                |20               |
     |TC_175 TC_182 TC_183  |12              |6GB       |4G             |NO                |30               |
     |TC_188 TC_189 TC_190  |24              |20GB      |4G             |NO                |50               |
     |TC_204 TC_208 TC_211  |24              |40GB      |4G             |NO                |75               |
     |TC_224 TC_225 TC_240  |24              |4GB       |4G             |NO                |100              |
     |TC_248 TC_257 TC_261  |24              |50GB      |4G             |NO                |200              |
     |TC_302 TC_310 TC_314  |24              |6GB       |4G             |NO                |5                |
     |TC_334 TC_340 TC_342  |12              |20GB      |5G             |NO                |10               |
     |TC_347 TC_353         |12              |40GB      |5G             |NO                |15               |
     |TC_373 TC_378         |12              |4GB       |5G             |NO                |20               |
     |TC_18 TC16            |12              |50GB      |5G             |NO                |20               |
     |TC_174 TC_184         |12              |6GB       |5G             |NO                |30               |
     |TC_223 TC_247         |24              |20GB      |5G             |NO                |50               |
     |TC_322 TC_346         |24              |40GB      |5G             |NO                |75               |
     |TC_367 TC_291         |24              |4GB       |5G             |NO                |100              |
     |TC_111 TC_199         |24              |50GB      |5G             |NO                |200              |
     |TC_357 TC_379         |24              |6GB       |5G             |NO                |5                |
