Feature: Testing Mrsys.io

  @SmokeTest
  Scenario Outline: Login System
    Given Navigate to mersys.io
    And User sending the keys in Elements
      | userName |  <name> |
      | password |<password> |
    And Click on the element in Elements
      | loginBtn |

    Examples:
      | name | password |
      |turkeyts|TechnoStudy123|



  @SmokeTest
Scenario: Custom Fields
And Click on the element in Elements
  | leftSetup |
  | Parameters |
| customFields |
| addDocument |

And User sending the keys in Elements
|fieldName |  Nur     |
|fieldCode |  2234     |
And Click on the element in Elements
| documentAdd |
