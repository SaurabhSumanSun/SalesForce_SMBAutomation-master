Feature: Order a device through business shop
  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and select the SIMO
    Then customer selects tariff plan and click on tariff
    Then Customer selects SIMO "<SimoContractTerm>" , "<SimoTariff>" , "<FourG_FiveGSIMO>" ,"<SIMOSpendCapSelect>" and "<SIMOSpendCapValue>"
    Then Customer lands on review basket page and clicks on proceed button
    Then Customer can see the upfront Tariff in the businessshop
    Then Customer can see the order number
    Examples:
      |Scenario_ID |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|
      |TC_37       |12              |20GB      |4G             |NO                |                 |
      |TC_51       |12              |40GB      |4G             |NO                |                 |
      |TC_52       |12              |4GB       |4G             |NO                |                 |
      |TC_53       |12              |50GB      |4G             |NO                |                 |
      |TC_54       |12              |6GB       |4G             |NO                |                 |
      |TC_55       |12              |20GB      |4G             |NO                |                 |
      |TC_56       |12              |40GB      |4G             |NO                |                 |
      |TC_85       |12              |4GB       |4G             |NO                |                 |
      |TC_115      |12              |50GB      |4G             |NO                |                 |
      |TC_125      |12              |20GB      |5G             |YES               |5                |
      |TC_135      |12              |40GB      |5G             |YES               |10               |
      |TC_153      |12              |4GB       |5G             |YES               |15               |
      |TC_155      |12              |50GB      |5G             |YES               |20               |
      |TC_160      |12              |6GB       |5G             |YES               |30               |
      |TC_161      |12              |20GB      |5G             |YES               |50               |
      |TC_162      |12              |40GB      |5G             |YES               |75               |
      |TC_163      |12              |4GB       |5G             |YES               |100              |
      |TC_164      |12              |50GB      |5G             |YES               |200              |
      |TC_165      |24              |20GB      |4G             |YES               |5                |
      |TC_170      |24              |40GB      |4G             |YES               |10               |
      |TC_171      |24              |4GB       |4G             |YES               |15               |
      |TC_173      |24              |50GB      |4G             |YES               |20               |
      |TC_178      |24              |6GB       |4G             |YES               |30               |
      |TC_196      |24              |20GB      |4G             |YES               |50               |
      |TC_201      |24              |40GB      |4G             |YES               |75               |
      |TC_212      |24              |4GB       |4G             |YES               |100              |
