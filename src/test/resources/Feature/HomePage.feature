Feature: Validating home page of red bus

  Scenario Outline: Validating home page of red bus
    Given The user should be in redbus home page
    When The user should select from and to"<From>","<To>"
    Then The user should select search buses

    Examples: 
      | From                    | To                      |
      | Chennai (All Locations) | Madurai (All Locations) |
      | Chennai (All Locations) | Theni                   |
