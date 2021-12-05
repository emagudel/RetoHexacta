Feature: Search the Hexacta page the information required


  Scenario Outline: Search the Hexacta page the information
    Given I visit the test page
    When I search in the application for a value with this information
      | ID   | topic   | written_by   | expectedResult   | currentUrl   |
      | <ID> | <topic> | <written_by> | <expectedResult> | <currentUrl> |
    Then I verify the information required for the successful case

    Examples:
      | ID | topic                                         | written_by     | expectedResult               | currentUrl                                        |
      | 1  | Why Fintech in Latin America Is Having a Boom | Sofia Gonzalez | The World of Payment Systems | https://blankfactor.com/fintech-in-latin-america/ |