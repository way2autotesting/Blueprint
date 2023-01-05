Feature: Smoke Test

  Scenario: Check page navigation
    Given I am an MFA User
    When I login with correct username and password
    And I activate MFA "Text"
    And I click "Create a New MS Teams Site"
    Then I navigate to Power App UI "BEIS MS Teams Site Request Form"