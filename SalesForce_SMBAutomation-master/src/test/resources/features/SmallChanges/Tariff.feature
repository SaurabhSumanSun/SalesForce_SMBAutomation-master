Feature: Test to ensure that the Tariffs and the relevant bolt ons are available as per the SDD document shared

  Scenario Outline: To test the tariffs cost and the bolt ons are available as per the SDD for MidMarket and SMB customers

    Given i am on the MyIdentity page
    When i enter username as "<username>" with password as "<password>"
    Then i should be logged in successfully using my "<memorablePhrase>"
    When i click on the "<proposaltype>" and click on new
    Then i validate the price of the below tariffs
      | SheetNameInTariffSheet | tariffNameInApplication |
      | Best for Business      | Best For Business Plans |


    Examples:
      |Scenario id                                                                             | username | password   | memorablePhrase | proposaltype |
      |TC_80 TC_81 TC_107 TC_108 TC_109 TC_110 TC_239 TC_287 TC_288 TC_289 TC_290 TC_337 TC_338| ravindv2 | Tuesday123 | 1234567890      | NEW PROPOSAL |
