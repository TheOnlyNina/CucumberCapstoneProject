Feature: Checkout Form Fields

  Scenario: Verify user details are visible and editable on the shopping cart
    Given I am on the shopping cart
    Then I should see the following user details:
      | Name        |
      | Email       |
      | Phone no    |
      | City        |
      | Postal Code |
    When I enter valid data into these fields
    Then the entered data should be visible and editable