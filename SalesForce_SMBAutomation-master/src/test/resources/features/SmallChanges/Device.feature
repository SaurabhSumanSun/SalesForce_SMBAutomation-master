Feature: Order a device through business shop

  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and selects phone section and selects "<DevName>"
    Then Customer selects colour,capacity,quantity for "<memory>" tariff and clicks on view tariff button
    Then customer selects  24 months by clicking on tariff "<plan>"
    Then customer selects "<Tariff>" and click on Go to basket button
    Then Customer lands on review basket page and clicks on proceed button
    Then customer will verify the pricing value


    Examples:
      |Scenario_Id | DevName                   |memory|Tariff |plan     |
      |TC_116      |iphone 12 pro Max 5G       |128GB |3GB    |24 months|
      |TC_117      |iphone 12 pro Max 5G       |256GB |3GB    |24 months|
      |TC_118      |iphone 12 pro Max 5G       |512GB |3GB    |24 months|
      |TC_119      |iPhone 13 Pro Max          |128GB |3GB    |24 months|
      |TC_120      |iPhone 13 Pro Max          |256GB |3GB    |24 months|
      |TC_121      |iPhone 13 Pro Max          |512GB |3GB    |24 months|
      |TC_122      |iPhone 13 Pro Max          |1000GB|3GB    |24 months|
      |TC_126      |iPhone 13 Pro              |128GB |3GB    |24 months|
      |TC_127      |iPhone 13 Pro              |256GB |3GB    |24 months|
      |TC_128      |iPhone 13 Pro              |512GB |3GB    |24 months|
      |TC_129      |iPhone 13 Pro              |1000GB|3GB    |24 months|
      |TC_130      |Samsung Galaxy S22         |128GB |3GB    |24 months|
      |TC_131      |Samsung Galaxy S22         |256GB |3GB    |24 months|
      |TC_132      |iPhone 13                  |128GB |3GB    |24 months|
      |TC_143      |iPhone 13                  |256GB |3GB    |24 months|
      |TC_144      |iPhone 13                  |512GB |3GB    |24 months|
      |TC_166      |Samsung Galaxy S22 Plus    |128GB |3GB    |24 months|
      |TC_167      |Samsung Galaxy S22 Plus    |256GB |3GB    |24 months|
      |TC_168      |Samsung Galaxy Z Fold3     |256GB |3GB    |24 months|
      |TC_169      |Samsung Galaxy Z Fold3     |512GB |3GB    |24 months|
      |TC_191      |iPhone 12 5G               |64GB  |3GB    |24 months|
      |TC_192      |iPhone 12 5G               |128GB |3GB    |24 months|
      |TC_193      |iPhone 12 5G               |256GB |3GB    |24 months|
      |TC_194      |iPhone SE 2020             |64GB  |3GB    |24 months|
      |TC_195      |iPhone SE 2020             |128GB |3GB    |24 months|
      |TC_197      |iPhone SE 2020             |256GB |3GB    |24 months|
      |TC_198      |Samsung Galaxy S22 Ultra   |128GB |3GB    |24 months|
      |TC_200      |Samsung Galaxy S22 Ultra   |256GB |3GB    |24 months|
      |TC_202      |Samsung Galaxy S22 Ultra   |512GB |3GB    |24 months|
      |TC_221      |Google Pixel 6 Pro         |128GB |3GB    |24 months|
      |TC_222      |Google Pixel 6 Pro         |256GB |3GB    |24 months|
      |TC_242      |iPhone 12 Pro 5G           |128GB |3GB    |24 months|
      |TC_243      |iPhone 12 Pro 5G           |256GB |3GB    |24 months|
      |TC_244      |iPhone 12 Pro 5G           |512GB |3GB    |24 months|
      |TC_259      |iPhone 13 mini             |128GB |3GB    |24 months|
      |TC_260      |iPhone 13 mini             |256GB |3GB    |24 months|
      |TC_262      |iPhone 13 mini             |512GB |3GB    |24 months|
      |TC_265      |iPhone 12 mini 5G          |64GB  |3GB    |24 months|
      |TC_266      |iPhone 12 mini 5G          |128GB |3GB    |24 months|
      |TC_267      |iPhone 12 mini 5G          |256GB |3GB    |24 months|
      |TC_268      |Samsung Galaxy S21 FE 5G   |128GB |3GB    |24 months|
      |TC_269      |Samsung Galaxy S21 FE 5G   |256GB |3GB    |24 months|
      |TC_270      |Samsung Galaxy S21 5G      |128GB |3GB    |24 months|
      |TC_271      |Samsung Galaxy S21 Ultra 5G|128GB |3GB    |24 months|
      |TC_292      |Samsung Galaxy S21 Plus 5G |128GB |3GB    |24 months|
      |TC_325      |Samsung Galaxy S21 Plus 5G |256GB |3GB    |24 months|
      |TC_326      |OPPO A16s                  |64GB  |3GB    |24 months|
      |TC_327      |OPPO A94                   |128GB |3GB    |24 months|
      |TC_328      |Moto G31                   |64GB  |3GB    |24 months|
      |TC_331      |iPhone 11                  |64GB  |3GB    |24 months|
      |TC_332      |iPhone 11                  |128GB |3GB    |24 months|
      |TC_333      |Google Pixel 6             |128GB |3GB    |24 months|
      |TC_339      |Oppo Find X3 Pro 5G        |256GB |3GB    |24 months|
      |TC_351      |Samsung Galaxy S20 FE 5G   |128GB |3GB    |24 months|
      |TC_362      |Samsung Galaxy A52s 5G     |128GB |3GB    |24 months|
      |TC_363      |Sony Xperia 5 II 5G        |128GB |3GB    |24 months|
      |TC_364      |Sony Xperia Pro I          |512GB |3GB    |24 months|
      |TC_365      |Sony Xperia 5 III 5G       |128GB |3GB    |24 months|
      |TC_376      |Samsung Galaxy S20 FE      |128GB |3GB    |24 months|