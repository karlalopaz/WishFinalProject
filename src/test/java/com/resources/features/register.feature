Feature: Register a new user

  Scenario: Register a new user by email
    Given I navigate to wish site
    When I click on Registration
    And Enter my data
    Then I am able to see the home page