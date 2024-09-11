@system
Feature: Login with Datadriven

  Scenario Outline: Successful Login  Datadriven
    Given the user navigates to login page
    When user enters email as "<email>" and password as "<password>"
    And the user clicks on the Login button
    Then the user should be logged in succesfully
    And the user clicks on logout button
    Then user successfully logged out message should be displayed
    And the user should be navigated to homepage

    Examples: 
      | email                  | password |
      | Bhanutest123@gmail.com | test@123 |
      | vemiw18075@gmail.com   | test@123 |

   
      