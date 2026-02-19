@google
Feature: Google Search

  Scenario: Verify Google Title
    Given User launches browser
    When User opens Google
    Then Title should contain Google