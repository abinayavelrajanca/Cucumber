@LoginPage @both
Feature: Login Page - Verification

  Background:
    Given I access Login Page of WebDriverUniversity

  Scenario: Login Page - Verification - Incorrect Username and Password
    When I enter username webdriver
    And I enter password webdriver
    And I click on Login Button
    Then I verify the error message

  Scenario: Login Page - Verification - Correct Username and Password
    When I enter username webdriver
    And I enter password webdriver123
    And I click on Login Button
    Then I verify the successful loggedIn message

  Scenario Outline: Login Page - Verification
    When I enter username <userName>
    And I enter password <passWord>
    And I click on Login Button
    Then I verify the message "<message>"
    Examples:
      | userName  | passWord     | message              |
      | webdriver | webdriver    | validation failed    |
      | webdriver | webdriver123 | validation succeeded |