
Feature: Add to cart
 @EndtoEnd
  Scenario: Successful Login1 with Valid Credentials
    Given the user navigates to login page
    When user enters email as "bhanutest123@gmail.com" and password as "test@123"
    And the user clicks on the Login button
    Then the user should be logged in succesfully
@EndtoEnd
  Scenario: Successful landing on category page
    Given the user is loggedin and navigates to the Home page
    When navigates through category menu
    And the user clicks on the Jackets category
    Then the user should be redirected to the Jackets Page
@EndtoEnd
  Scenario: Successful landing on Product page
    Given the user lands on the category Page
    When the user clicks on the Jackets Ziplight product
    Then the user should be redirected to the Ziplight Jacket's productPage
@EndtoEnd
  Scenario: Add product to cart
    Given the user lands on the Product Page
    When the user selects the size
    And the user selects the color
    And the user clicks on the Addtocart button
    Then the Product should be successfully added to the cart
    And cartvalue should be incemented by one
