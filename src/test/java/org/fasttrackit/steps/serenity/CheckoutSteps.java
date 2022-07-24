package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;
import org.fasttrackit.utils.Constants;

public class CheckoutSteps {

    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private ProductPage productPage;
    private CartPage cartPage;
    @Step
    public void fillInCheckoutFields() {
        checkoutPage.setBillingFirstNameField(Constants.FNAME);
        checkoutPage.setBillingLastNameField(Constants.LNAME);
        checkoutPage.setBillingCompany(Constants.COMPANY);
        checkoutPage.setBillingAddress(Constants.ADDRESS);
        checkoutPage.setBillingCity(Constants.CITY);
        checkoutPage.setBillingPostcode(Constants.POSTCODE);
        checkoutPage.setBillingPhone(Constants.PHONE);
        checkoutPage.setBillingEmail(Constants.EMAIL);
    }

    @Step
    public void orderComments(String text) {
        checkoutPage.setOrderComments(text);
    }

    @Step
    public void clickCheckoutMenuButton() {
        checkoutPage.clickCheckoutMenuButton();
    }

    @Step
    public void clickPlaceOrderButton() {
        checkoutPage.clickPlaceOrderButton();
    }

    @Step
    public void successfulOrderMsg(){
        checkoutPage.successfulOrderMsg();
    }

    @Step
    public void emptyCartCantCheckoutMessage(){
        checkoutPage.cantCheckoutEmptyCartMessage();
    }

    @Step
    public void proceedToCheckOutWithDiscount(){
        homePage.open();
        homePage.goToShopButton();
        productPage.sortProductsAverageRating();
        productPage.selectFirstProduct();
        productPage.clickAddToCartButton();
        homePage.goToCartButton();
        cartPage.addDiscount();
        cartPage.proceedToCheckoutButton();
    }

}

