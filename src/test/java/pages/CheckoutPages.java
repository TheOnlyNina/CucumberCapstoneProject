package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPages {

    WebDriver driver;

    public CheckoutPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // === Form Fields ===

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "phone")
    private WebElement phoneField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "address")
    private WebElement addressField;

    @FindBy(id = "postalCode")
    private WebElement postalCodeField;

    @FindBy(css = ".order-summary-section")
    private WebElement orderSummary;

    // === Buttons & Actions ===

    @FindBy(css = "button.buy")
    private WebElement buyNowButton;

    @FindBy(xpath = "//a[contains(text(),'CHECKOUT')] | //div[contains(@class,'cart-checkout')]")
    private WebElement checkoutPopup;

    @FindBy(xpath = "//span[contains(text(),'promos available')]")
    private WebElement promosAvailableButton;

    @FindBy(xpath = "//input[@placeholder='Promo code']")
    private WebElement promoCodeInput;

    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    private WebElement applyPromoButton;

    @FindBy(xpath = "//div[contains(@class,'total-amount')] | //td[@class='amount']")
    private WebElement orderTotal;

    @FindBy(xpath = "//div[contains(text(),'Credit/Debit Card')]")
    private WebElement creditDebitOption;

    @FindBy(name = "cardnumber")
    private WebElement cardNumberField;

    @FindBy(xpath = "//input[@placeholder='MM / YY']")
    private WebElement expiryField;

    @FindBy(xpath = "//input[@placeholder='123']")
    private WebElement cvvField;

    @FindBy(xpath = "//a[@class='button-main-content']")
    private WebElement payNowButton;

    @FindBy(xpath = "//input[@id='otp']")
    private WebElement otpField;

    @FindBy(xpath = "//button[@name='ok']")
    private WebElement okButton;

    @FindBy(xpath = "//button[@name='cancel']")
    private WebElement cancelButton;

    // === Input Actions ===

    public void enterName(String name) {
        nameField.clear();
        nameField.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterPhone(String phone) {
        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void enterCity(String city) {
        cityField.clear();
        cityField.sendKeys(city);
    }

    public void enterAddress(String address) {
        addressField.clear();
        addressField.sendKeys(address);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeField.clear();
        postalCodeField.sendKeys(postalCode);
    }

    public void enterCardDetails(String number, String expiry, String cvv) {
        cardNumberField.sendKeys(number);
        expiryField.sendKeys(expiry);
        cvvField.sendKeys(cvv);
    }

    public void enterOTP(String otp) {
        otpField.sendKeys(otp);
    }

    // === Click Actions ===

    public void clickBuyNow() {
        buyNowButton.click();
    }

    public void clickPromosAvailable() {
        promosAvailableButton.click();
    }

    public void applyPromoCode(String promoCode) {
        promoCodeInput.sendKeys(promoCode);
        applyPromoButton.click();
    }

    public void clickCreditCardOption() {
        creditDebitOption.click();
    }

    public void clickPayNow() {
        payNowButton.click();
    }

    public void clickOkButton() {
        okButton.click();
    }

    public void clickCancelButton() {
        cancelButton.click();
    }

    // === Getters for assertions ===

    public String getNameValue() {
        return nameField.getAttribute("value");
    }

    public String getEmailValue() {
        return emailField.getAttribute("value");
    }

    public String getPhoneValue() {
        return phoneField.getAttribute("value");
    }

    public String getCityValue() {
        return cityField.getAttribute("value");
    }

    public String getAddressValue() {
        return addressField.getAttribute("value");
    }

    public String getPostalCodeValue() {
        return postalCodeField.getAttribute("value");
    }

    public boolean isOrderSummaryVisible() {
        return orderSummary.isDisplayed();
    }

    public boolean isCheckoutPopupVisible() {
        return checkoutPopup.isDisplayed();
    }

    public String getOrderTotal() {
        return orderTotal.getText();
    }

    public boolean isCardFormVisible() {
        return cardNumberField.isDisplayed();
    }
}