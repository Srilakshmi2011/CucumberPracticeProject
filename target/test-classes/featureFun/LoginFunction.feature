Feature: To test login functionality

  Scenario: To check login sucessfully with valid credentials
    Given user is on login page
    When giving username and password
    And Click on login button
    Then Land on HomePage
