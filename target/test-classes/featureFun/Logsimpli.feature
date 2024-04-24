Feature: To login to simplilearn website

  Scenario: Login success scenario
    Given Have launched the application URL
    And Click on login link
    When Enter the UserName
    And Enter the Password
    And Click on login button
    Then Should land on HomePage
