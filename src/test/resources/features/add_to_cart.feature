Feature: Add to Cart Functionality

  Scenario: Verify "Midtrans Pillow" is added and cart popup shows with cost 20000/-
    Given I am on the main page
    When I click on the buy now button
    Then I should see the new item added to my shopping cart at the cost of 20000
    And I should see a shopping cart