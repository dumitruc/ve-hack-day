@TODO
Feature: Node registration request

  Scenario: Submit a collection node registration request
    Given I am planning to do a donations collection
    And I do not have an account
    When I submit all the required details on the registration form
    Then my request is successfully accepted
    And is pending approval

  Scenario: Submit a report on suspicious activity
    Given I am I have seen some suspicious activity
    And I have the SaveTheChildren account
    When I successfully submit all the required details of the activity
    When I successfully submit following details of the activity
      | Date      | 31/07/2015                           |
      | Time      | 12:00                                |
      | Location  | Jogoo Rd, Nairobi, Kenya             |
      | ExtraInfo | It was advertised outside the market |
    And is scored
    And is pending actions

