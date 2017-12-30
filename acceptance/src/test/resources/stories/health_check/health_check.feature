Feature: Application Health Check

  @e2e @smoke
  Scenario: Health check monitors application state
      Given the application is up and running
      When I request the health status
      Then the application should be healthy

  @e2e
  Scenario: Health check monitors application state
    Given the application is up and running
    When I request the health status
    Then the application should be healthy