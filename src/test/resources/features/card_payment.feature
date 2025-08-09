Feature: Card Payment Flow from Order Summary Popup

  Scenario: Verify applying a promo code updates the order total
    Given I am on the order summary popup
    When I click on the "promos available" button
    And I apply a valid promo code
    Then I should see the order total reduced accordingly

  Scenario: Enter valid card details and proceed
    Given I am on the order summary popup
    And I click on the CreditDebit Card option
    When I enter card number "4811111111111114", expiry date "02/62", and CVV "123"
    And I choose to proceed without promo
    And I click on Pay Now
    Then I should be redirected to the Bank OTP screen
    Then I should see the payment details labels and non-empty values
      | Merchant Name:    |
      | Amount:           |
      | Transaction Time: |
      | Card Number:      |
          #OTP_Result , instead of feature
    Then I handle OTP with code "112233"
    #Other codes are commented out, turn into if block instead of repetitiveness