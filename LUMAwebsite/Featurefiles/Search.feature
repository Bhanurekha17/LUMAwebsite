@system
Feature: Search a product

  Scenario: display of search result Page
    Given the user navigates to Homepage
    When user enters ProductName as "Shirt"
    And the user clicks on the search button
    Then the user should be redirected to the repective searchresultPage