@Saucedemo
Feature: SauceDemo Website Validation


Scenario:Launch SauceDemo Website
    Given I am on the SauceDemo website
    When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click on the login button
    Then I should be logged in successfully
