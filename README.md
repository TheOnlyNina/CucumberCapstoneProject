# Cucumber Capstone Project - Test Coverage Summary & Notes

## Test Coverage Summary

### Add to Cart Functionality  
- Verify "Midtrans Pillow" is added to the cart and the cart popup displays the correct cost of 20000.

### Card Payment Flow from Order Summary Popup  
- Verify applying a promo code updates the order total correctly.  
- Enter valid card details and proceed without a promo code.  
- Verify redirection to the Bank OTP screen.  
- Verify payment detail labels (Merchant Name, Amount, Transaction Time, Card Number) are visible with non-empty values.  
- Handle OTP input with the valid code "112233".  
  *(Other OTP codes and cancellation scenarios are implemented as conditional blocks in the step definition for simplicity.)*

### Checkout Form Fields  
- Verify user details (Name, Email, Phone no, City, Postal Code) are visible and editable on the shopping cart page.  
- Verify data can be entered and is correctly reflected in the form fields.

### Order Summary and Payment Options  
- Verify product name and price from expanded order details in the order summary popup.  
- Verify available payment options are listed below the order summary popup.  
- Verify selecting Credit/Debit Card option opens the card details form.

---

## Important Notes and Known Issues

- The HTML of the website contains potential typos in IDs that do not always match the expected values required for tests. This caused some locators to require adjustment.

- The iframe's `src` link (for payment/OTP) loads infinitely. All element paths and interactions were performed by directly using the main page context.

- The current automation code is functional for individual feature execution, but when running all tests together using the TestNG suite (`testng.xml`), some tests may intermittently fail due to synchronization issues or test finalization steps. These will be improved and stabilized in future revisions.

- Promo code selection occasionally behaves unexpectedly due to the website's logic; the final verified amount remains correct, but the promo UI may show a selected promo even when "no promo" was intended.

- OTP handling currently only fully supports the valid OTP code (`112233`) in automated verification. Other OTP codes and cancel scenarios exist as comments or conditional logic to avoid test repetition.

---

## Project Information

- Website under test: [https://demo.midtrans.com/](https://demo.midtrans.com/)
- Tools & Frameworks:
  - Java (programming language)
  - Maven (build tool)
  - Selenium WebDriver (UI automation)
  - Cucumber (BDD framework)
  - TestNG (test execution & grouping)
- Framework Design:
  - Separate feature files organized by functional areas

---

## Usage

1. Clone the repository.
2. Run tests via TestNG suites or individual feature files.
3. Review known issues and adjust wait timings if needed.
4. Future improvements planned for synchronization and robustness.

---

This project was done following the expertautomationteam course on LIVE Instructor Led Course: QA Automation Engineering with Java Selenium (Oct. 2024).
It was one exercise from the final project including others that can be found in my profile.
