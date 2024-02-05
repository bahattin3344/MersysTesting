Feature: Testing Mrsys.io

  @SmokeTest
  Scenario Outline: Subject Categories
    Given Navigate to mersys.io
    And User sending the keys in Elements
      | userName |  <name> |
      | password |<password> |
    And Click on the element in Elements
      | loginBtn |

And Click on the element in Elements
| Education |
| educationSetup |
| subjectCategories |
| addDocument |

And User sending the keys in Elements
|subjectName |  Nur     |
|subjectCode |  2234     |
And Click on the element in Elements
| documentAdd |


    Examples:
      | name | password |
      |turkeyts|TechnoStudy123|