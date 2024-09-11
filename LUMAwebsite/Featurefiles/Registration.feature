@system
Feature: User Registration

  Scenario: Successful Registration with valid details
    Given the user navigates to create Account page
    When the user enters the details into below fields
      | firstName       | John              |
      | lastName        | Kenedy            |
      | email           | test123@gmail.com |
      | password        | test@123          |
      | confirmpassword | test@123          |
    And the user clicks on the Create an Account button
    Then the user account should get created successfully
