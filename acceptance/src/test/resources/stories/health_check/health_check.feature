Feature: Health check api

    Scenario: Application is up and running
        Given the application is up and running
        When I send a request to the health endpoint
        Then I should get a successful response