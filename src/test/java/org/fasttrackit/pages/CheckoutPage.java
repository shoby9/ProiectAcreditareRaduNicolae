package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.fasttrackit.utils.Constants;
import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {

    @FindBy(css = "#menu-item-125")
    private WebElementFacade checkoutMenuButton;
    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameField;
    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameField;
    @FindBy(css = "#billing_company")
    private WebElementFacade billingCompanyField;
    @FindBy(css = "#select2-billing_country-container")
    private WebElementFacade billingCountry;
    @FindBy(css = "[title=\"Romania\"]")
    private WebElementFacade country;
    @FindBy(css = "#billing_address_1")
    private WebElementFacade billingAddress;
    @FindBy(css = "#billing_city")
    private WebElementFacade billingCity;
    @FindBy(css = "#billing_state")
    private WebElementFacade billingState;
    @FindBy(css = "#billing_postcode")
    private WebElementFacade billingPostcode;
    @FindBy(css = "#billing_phone")
    private WebElementFacade billingPhone;
    @FindBy(css = "#billing_email")
    private WebElementFacade billingEmail;
    @FindBy(css = "#place_order")
    private WebElementFacade placeOrderButton;
    @FindBy(css = "#order_comments")
    private WebElementFacade orderComments;
    @FindBy(css = "#post-119")
    private WebElementFacade successfulOrder;
    @FindBy(css =".woocommerce-info")
    private WebElementFacade cantCheckoutEmptyCartMessage;

    public void clickCheckoutMenuButton() {
        clickOn(checkoutMenuButton);
    }
    public void setBillingFirstNameField(String text) {
        typeInto(firstNameField, text);
    }
    public void setBillingLastNameField(String text) {
        typeInto(lastNameField, text);
    }
    public void setBillingCompany(String text) {
        typeInto(billingCompanyField, text);
    }
    public void setBillingCountry() {

    }
    public void setBillingAddress(String text) {
        typeInto(billingAddress, text);
    }
    public void setBillingCity(String text) {
        typeInto(billingCity, text);
    }
    public void setBillingCounty(String text) {
    }
    public void setBillingPostcode(String text) {
        typeInto(billingPostcode, text);
    }
    public void setBillingPhone(String text) {
        typeInto(billingPhone, text);
    }
    public void setBillingEmail(String text) {
        typeInto(billingEmail, text);
    }
    public void clickPlaceOrderButton() {
        clickOn(placeOrderButton);
    }
    public void setOrderComments(String text) {
        typeInto(orderComments, text);
    }
    public void successfulOrderMsg() {
        successfulOrder.shouldBeVisible();
    }
    public void cantCheckoutEmptyCartMessage(){
        cantCheckoutEmptyCartMessage.getText().equals("Checkout is not available wen your cart is empty.");
    }

}
