@system
Feature: Login1 with Valid credentials

  Scenario: Successful Login1 with Valid Credentials
    Given the user navigates to login page
    When user enters email as "bhanutest123@gmail.com" and password as "test@123"
    And the user clicks on the Login button
    Then the user should be logged in succesfully

  Scenario: Successfull logout
    Given the user is logged in and navigates to Profile icon
    When the user clicks on logout button
    Then user successfully logged out message should be displayed
    And the user should be navigated to homepage
