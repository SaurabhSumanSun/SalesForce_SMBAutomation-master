Feature: Order a device through business shop
  Scenario Outline: Customer orders a app through businessshop
    Given Customer is able to launch the businessshop and select the app
    Then Customer selects the "<app>" and click on the app
    Then Customer can choose the app and click on it
    Then Customer can view the "<firstname>" "<lastname>" "<phonenumber>" "<email>" and click on submit button
    Then Customer lands on review basket page and clicks on proceed button
    Examples:
     |Scenario_Id                       | app                |firstname|lastname|phonenumber|email           |
     |TC_140 TC_245 TC_246 TC_251 TC_252| Microsoft 365      |Test     |Test    |07710163471|Test@yopmail.com|
     |TC_356 TC_358 TC_359 TC_360       | McAfee Multi Access|Test     |Test    |07710163471|Test@yopmail.com|