Feature: feature to test login functionality

  Scenario: Check login is successful with valid creddentials
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then user is navigated to home page
