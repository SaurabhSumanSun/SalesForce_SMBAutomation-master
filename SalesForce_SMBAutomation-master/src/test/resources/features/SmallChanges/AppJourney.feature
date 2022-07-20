Feature: Order a device through business shop
  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop
    Then Customer selects the "<app>" and click on the app
    Then Customer can choose the "<quantity>" and click on app
    Then Customer lands on review basket page and clicks on proceed button
    Examples:
      |Scenario_ID   | app                            |quantity|
      |TC_22 TC_23   | Microsoft 365                  |1       |
      |TC_26 TC_27   | Microsoft 365                  |2       |
      |TC_147 TC_148 | Microsoft 365                  |3       |
      |TC_149 TC_150 | Microsoft 365                  |4       |
      |TC_151 TC_152 | Microsoft 365                  |5       |
      |TC_205 TC_250 | Microsoft 365                  |6       |
      |TC_254 TC_264 | Microsoft 365                  |7       |
      |TC_281 TC_282 | Microsoft 365                  |8       |
      |TC_283 TC_298 | Microsoft 365                  |9       |
      |TC_299 TC_300 | McAfee Multi Access            |1       |
      |TC_301 TC_304 | McAfee Multi Access            |2       |
      |TC_305 TC_306 | McAfee Multi Access            |3       |
      |TC_307 TC_308 | McAfee Multi Access            |4       |
      |TC_311 TC_312 | McAfee Multi Access            |5       |
      |TC_313 TC_316 | McAfee Multi Access            |6       |
      |TC_324 TC_330 | McAfee Multi Access            |7       |
      |TC_336 TC_343 | McAfee Multi Access            |8       |
      |TC_344 TC_348 | McAfee Multi Access            |9       |