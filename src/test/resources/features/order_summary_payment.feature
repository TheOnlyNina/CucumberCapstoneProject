Feature: Order Summary and Payment Options

  Scenario: Verify product name and price from expanded order details
    Given I am on the order summary popup
    When I click on the "Details" section
    Then I should see the product name as "Midtrans Pillow"
    And I should see the price as "20000"

    Scenario: Verify available payment options listed below the order summary
      Given I am on the order summary popup
      When I scroll to the payment section
      Then I should see the following payment options:
        | Credit/Debit Card |
        | Bank Transfer     |
        | GoPay             |
        | ShopeePay         |
        | QRIS              |
        | Indomaret         |
        | Kredivo           |
      And I click on the CreditDebit Card option
      Then I should see the card details form