
Feature: order Product
@EndtoEnd
  Scenario: Proceed to Checkout
    Given the Product is successfully added to cart
    When user clicks on the Proceed to check out button
    Then user should be navigated to checkout Page
@EndtoEnd
  Scenario: Place order
    Given the product is available on the checkout Page
    When the user clicks on the next button
    And the user clicks on the place order button
    Then order should get placed and order confirmation page should be displayed
@EndtoEnd
  Scenario: Successfull logout
    Given the order placed succesfully
    When the user clicks on logout button
    Then user successfully logged out message should be displayed
    And the user should be navigated to homepage
