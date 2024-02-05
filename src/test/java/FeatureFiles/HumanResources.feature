Feature: Testing Mrsys.io

  @SmokeTest
  Scenario Outline: Login System
    Given Navigate to mersys.io
    And User sending the keys in Elements
      | userName |  <name> |
      | password |<password> |
    And Click on the element in Elements
      | loginBtn |

      And Click on the element in Elements
        | humanResources |
        | setup |
        | position |
        | addPosition |
      And User sending the keys in Elements
        |positionName |  Deniz     |
        |shortName    |Aydın|
      And Click on the element in Elements
        | positionAdd |






      Examples:
        | name | password |
        |turkeyts|TechnoStudy123|












