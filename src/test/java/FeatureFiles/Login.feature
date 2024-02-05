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