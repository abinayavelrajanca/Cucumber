@contactus @both
Feature: WebDriverUniversity - Contact Us Page

  Background:
    Given I navigate to WebDriverUniversity - Contact Us Page

  Scenario: WebDriverUniversity - Verify Successful Submission Page
    When I verify and enter FirstName
    And I verify and enter LastName
    And I verify and enter emailAddress
    And I enter comments
    And I click on submit button
    Then I verify successful submission page

  Scenario: WebDriverUniversity - Verify Successful Page
    When I verify and enter unique FirstName FirstName
    And I verify and enter unique LastName LastName
    And I verify and enter unique EmailAddress "emailAddress@gmail.com"
    And I enter comments
    And I click on submit button
    Then I verify successful submission page