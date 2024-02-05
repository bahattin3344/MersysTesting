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
Scenario: Document Types
And Click on the element in Elements
| leftSetup |
| Parameters |
| documentTypes |
| addDocument |

And User sending the keys in Elements
|documentName |  Nur     |

And Click on the element in Elements
| documentStage |
| documentSelectStage |
| documentAdd |
